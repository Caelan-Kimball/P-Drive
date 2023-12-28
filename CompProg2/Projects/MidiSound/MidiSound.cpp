/* 
 * File:   MidiSound.cpp
 * Author: Caelan Kimball
 *
 * Created on January 29, 2020, 12:28 PM
 */

#include <windows.h>
#include <mmsystem.h>
#include <iostream>
#include <vector>
#include <wingdi.h>
#include <wincrypt.h>

using namespace std;

#define MD 0
#define HZ 1
#define DB 2
#define NO 3

#define BYTE unsigned char
#define ULONG unsigned long
#define MESSAGE union { LONG w; BYTE d[4];}

enum EFrequency {
    keRest = 0,
    keC0 = 24, keCS0, keD0, keDS0, keE0, keF0, keFS0, keG0, keGS0, keA0, keAS0, keB0,
    keC1 = 36, keCS1, keD1, keDS1, keE1, keF1, keFS1, keG1, keGS1, keA1, keAS1, keB1,
    keC2 = 48, keCS2, keD2, keDS2, keE2, keF2, keFS2, keG2, keGS2, keA2, keAS2, keB2,
    keC3 = 60, keCS3, keD3, keDS3, keE3, keF3, keFS3, keG3, keGS3, keA3, keAS3, keB3,
    keC4 = 72, keCS4, keD4, keDS4, keE4, keF4, keFS4, keG4, keGS4, keA4, keAS4, keB4,
};

enum EDuration {
    ke16th = 115, ke8th = (ke16th << 1), keDot8th = (ke8th + ke16th), keQuart = (ke8th << 1), keDotQuart = (keQuart + ke8th),
    keHalf = (keQuart << 1), keWhole = (keHalf << 1)
};

struct Note {
    BYTE hz, db;

    Note() {
    }

    Note(BYTE hz) {
        this ->hz = hz;
        db = 100;
    }

    Note(BYTE hz, BYTE db) {
        this ->hz = hz;
        this ->db = db;
    }

    Note(int ihz, int idb) {
        this ->hz = static_cast<BYTE> (ihz);
        this ->db = static_cast<BYTE> (idb);
    }
};

struct Line {
    short t;
    Note n;

    Line() {
    }

    Line(short tt, Note nn) {
        t = tt;
        n = nn;
    }

    Line(short tt, BYTE hz, BYTE db) {
        t = tt;
        n = Note(hz, db);
    }
};

class NoteTrack {
private:
    short time = 0;

public:
    vector<Line> track;

    void addLine(Line l) {
        track.push_back(l);
        time = l.t;
    }

    void addLine(short t, Note n) {
        track.push_back(Line(t, n));
        time = t;
    }

    void addLine(short t, BYTE hz, BYTE db) {
        track.push_back(Line(t, hz, db));
        time = t;
    }

    void addLineRelative(short t, Note n) {
        track.push_back(Line(time + t, n));
        time += t;
    }

    void addLineRelative(short t, BYTE hz, BYTE db) {
        track.push_back(Line(time + t, hz, db));
        time += t;
    }

    void end(short t) {
        track.push_back(Line(time + t, 0, 0));
    }
};

class Midie {
private:
    int midiport, flag;
    HMIDIOUT device;
    MESSAGE m;

public:

    Midie() {
        midiport = 0;
        flag = midiOutOpen(&device, midiport, 0, 0, CALLBACK_NULL);
        if (flag != MMSYSERR_NOERROR)
            cout << "[ERROR] MIDI output could not be opened. \n";
        m.d[MD] = 0x90;
        m.d[HZ] = 0;
        m.d[DB] = 0;
        m.d[NO] = 0;
    }

    void wait(short t) {
        Sleep(t);
    }

    void playNote(BYTE hz, BYTE db) {
        m.d[HZ] = hz;
        m.d[DB] = db;
    }

    void playNote(Note n) {
        m.d[HZ] = n.hz;
        m.d[DB] = n.db;
    }

    void playNoteBlocked(BYTE hz, BYTE db, short t) {
        m.d[HZ] = hz;
        m.d[DB] = db;
        flag = midiOutShortMsg(device, m.w);
        Sleep(t);
    }

    void playNoteBlocked(Note n, short t) {
        m.d[HZ] = n.hz;
        m.d[DB] = n.db;
        flag = midiOutShortMsg(device, m.w);
        Sleep(t);
    }

    void playNoteTrack(NoteTrack* t) {
        short time = 0, timer = 0;
        vector<Line> ::iterator it;
        for (it = t->track.begin(); it != t ->track.end(); it++) {
            timer = it->t - time;
            Sleep(timer);
            time += timer;
            m.d[HZ] = it->n.hz;
            m.d[DB] = it->n.db;
            flag = midiOutShortMsg(device, m.w);
        }
    }

    void send(unsigned long word) {
        flag = midiOutShortMsg(device, m.w);
    }

    void close() {
        midiOutReset(device);
        midiOutClose(device);
    }
};

/*
 * 
 */
int main(int argc, char** argv) {
    //The beginnig of track
    cout << "Start the Program\n";
    Midie midi;
    NoteTrack* riversInTheDesert = new NoteTrack();

    int tick = 0;
    //measure 1
    riversInTheDesert->addLine(tick, Note(keC2));
    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += (keDotQuart);
    riversInTheDesert->end(tick);

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    riversInTheDesert->addLine(tick, Note(keC2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keRest, 100));
    tick += (keDotQuart);

    riversInTheDesert->addLine(tick, Note(keC2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    riversInTheDesert->addLine(tick, Note(keC2, 100));
    tick += (keDotQuart);

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    riversInTheDesert->addLine(tick, Note(keC2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keRest, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keDS2, 100));
    riversInTheDesert->addLine(tick, Note(keGS2, 100));
    tick += (keDotQuart);

    riversInTheDesert->addLine(tick, Note(keC2, 100));
    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += (keDotQuart);


    riversInTheDesert->addLine(tick, Note(keF2, 100));
    riversInTheDesert->addLine(tick, Note(keC2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keRest, 100));
    tick += (keDotQuart);

    riversInTheDesert->addLine(tick, Note(keC2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    riversInTheDesert->addLine(tick, Note(keC2, 100));
    tick += (keDotQuart);

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    riversInTheDesert->addLine(tick, Note(keC2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keRest, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keDS2, 100));
    riversInTheDesert->addLine(tick, Note(keGS2, 100));
    tick += (keDotQuart);
    //Measure 5
    riversInTheDesert->addLine(tick, Note(keF3, 100));
    riversInTheDesert->addLine(tick, Note(keC3, 100));
    tick += (keDotQuart);

    riversInTheDesert->addLine(tick, Note(keF3, 100));
    riversInTheDesert->addLine(tick, Note(keC3, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keRest, 100));
    tick += keHalf;

    riversInTheDesert->addLine(tick, Note(keF3, 100));
    riversInTheDesert->addLine(tick, Note(keC3, 100));
    tick += (keDotQuart);

    riversInTheDesert->addLine(tick, Note(keF3, 100));
    riversInTheDesert->addLine(tick, Note(keC3, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keRest, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keGS3, 100));
    riversInTheDesert->addLine(tick, Note(keDS3, 100));
    tick += (keDotQuart);

    riversInTheDesert->addLine(tick, Note(keF3, 100));
    riversInTheDesert->addLine(tick, Note(keC3, 100));
    tick += (keDotQuart);

    riversInTheDesert->addLine(tick, Note(keF3, 100));
    riversInTheDesert->addLine(tick, Note(keC3, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keRest, 100));
    tick += keHalf;

    riversInTheDesert->addLine(tick, Note(keF3, 100));
    riversInTheDesert->addLine(tick, Note(keC3, 100));
    tick += (keDotQuart);

    riversInTheDesert->addLine(tick, Note(keF3, 100));
    riversInTheDesert->addLine(tick, Note(keC3, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keRest, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keGS3, 100));
    riversInTheDesert->addLine(tick, Note(keDS3, 100));
    tick += (keDotQuart);
    //Measure 9
    riversInTheDesert->addLine(tick, Note(keF2, 100));
    riversInTheDesert->addLine(tick, Note(keC3, 100));
    riversInTheDesert->addLine(tick, Note(keF3, 100));
    tick += (keDotQuart);

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    riversInTheDesert->addLine(tick, Note(keC3, 100));
    riversInTheDesert->addLine(tick, Note(keF3, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keRest, 100));
    tick += keHalf;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    riversInTheDesert->addLine(tick, Note(keC3, 100));
    riversInTheDesert->addLine(tick, Note(keF3, 100));
    tick += (keDotQuart);

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    riversInTheDesert->addLine(tick, Note(keC3, 100));
    riversInTheDesert->addLine(tick, Note(keF3, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keRest, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keGS2, 100));
    riversInTheDesert->addLine(tick, Note(keDS3, 100));
    riversInTheDesert->addLine(tick, Note(keGS3, 100));
    tick += (keDotQuart);

    riversInTheDesert->addLine(tick, Note(keRest, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += ke16th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += ke16th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keRest, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += ke16th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += ke16th;
    //Measure 12
    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keRest, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keC3, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keGS2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keAS2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keRest, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += ke16th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += ke16th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keRest, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keC3, 100));
    tick += keQuart;

    riversInTheDesert->addLine(tick, Note(keDS3, 100));
    tick += keHalf;

    riversInTheDesert->addLine(tick, Note(keRest, 100));
    tick += keDotQuart;
    //Measure 15
    riversInTheDesert->addLine(tick, Note(keRest, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += ke16th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += ke16th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keRest, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keC3, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keGS2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keAS2, 100));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += keQuart;

    riversInTheDesert->addLine(tick, Note(keGS2, 100));
    tick += keQuart;

    riversInTheDesert->addLine(tick, Note(keF2, 100));
    tick += keDotQuart;

    riversInTheDesert->addLine(tick, Note(keGS2, 100));
    tick += keHalf;

    riversInTheDesert->addLine(tick, Note(keRest, 100));
    tick += keHalf;
    //Measure 18
    riversInTheDesert->addLine(tick, Note(keRest));
    tick += keDotQuart;

    riversInTheDesert->addLine(tick, Note(keF4));
    riversInTheDesert->addLine(tick, Note(keF3));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keAS4));
    riversInTheDesert->addLine(tick, Note(keAS3));
    tick += keDot8th;

    riversInTheDesert->addLine(tick, Note(keGS3));
    riversInTheDesert->addLine(tick, Note(keGS4));
    tick += keDot8th;

    riversInTheDesert->addLine(tick, Note(keG3));
    riversInTheDesert->addLine(tick, Note(keG4));
    tick += ke16th;

    riversInTheDesert->addLine(tick, Note(keG3));
    riversInTheDesert->addLine(tick, Note(keG4));
    tick += ke16th;

    riversInTheDesert->addLine(tick, Note(keF4));
    riversInTheDesert->addLine(tick, Note(keC4));
    riversInTheDesert->addLine(tick, Note(keF3));
    tick += keDotQuart;

    riversInTheDesert->addLine(tick, Note(keGS4));
    riversInTheDesert->addLine(tick, Note(keC4));
    riversInTheDesert->addLine(tick, Note(keGS3));
    tick += keQuart;

    riversInTheDesert->addLine(tick, Note(keF4));
    riversInTheDesert->addLine(tick, Note(keGS3));
    tick += keQuart;

    riversInTheDesert->addLine(tick, Note(keG3));
    riversInTheDesert->addLine(tick, Note(keDS4));
    tick += keQuart;

    riversInTheDesert->addLine(tick, Note(keG3));
    riversInTheDesert->addLine(tick, Note(keDS4));
    tick += keQuart;

    riversInTheDesert->addLine(tick, Note(keF4));
    riversInTheDesert->addLine(tick, Note(keF3));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keAS4));
    riversInTheDesert->addLine(tick, Note(keAS3));
    tick += keDot8th;

    riversInTheDesert->addLine(tick, Note(keGS3));
    riversInTheDesert->addLine(tick, Note(keGS4));
    tick += keDot8th;

    riversInTheDesert->addLine(tick, Note(keG3));
    riversInTheDesert->addLine(tick, Note(keG4));
    tick += ke16th;

    riversInTheDesert->addLine(tick, Note(keG3));
    riversInTheDesert->addLine(tick, Note(keG4));
    tick += ke16th;
    //Measure 21
    riversInTheDesert->addLine(tick, Note(keF4));
    riversInTheDesert->addLine(tick, Note(keD4));
    riversInTheDesert->addLine(tick, Note(keF3));
    tick += keDotQuart;

    riversInTheDesert->addLine(tick, Note(keGS4));
    riversInTheDesert->addLine(tick, Note(keCS4));
    riversInTheDesert->addLine(tick, Note(keGS3));
    tick += keQuart;

    riversInTheDesert->addLine(tick, Note(keF4));
    riversInTheDesert->addLine(tick, Note(keGS3));
    tick += keQuart;

    riversInTheDesert->addLine(tick, Note(keG3));
    riversInTheDesert->addLine(tick, Note(keDS4));
    tick += keQuart;

    riversInTheDesert->addLine(tick, Note(keG3));
    riversInTheDesert->addLine(tick, Note(keDS4));
    tick += keQuart;

    riversInTheDesert->addLine(tick, Note(keF4));
    riversInTheDesert->addLine(tick, Note(keF3));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keAS4));
    riversInTheDesert->addLine(tick, Note(keAS3));
    tick += keDot8th;

    riversInTheDesert->addLine(tick, Note(keGS3));
    riversInTheDesert->addLine(tick, Note(keGS4));
    tick += keDot8th;

    riversInTheDesert->addLine(tick, Note(keG3));
    riversInTheDesert->addLine(tick, Note(keG4));
    tick += ke16th;

    riversInTheDesert->addLine(tick, Note(keG3));
    riversInTheDesert->addLine(tick, Note(keG4));
    tick += ke16th;

    riversInTheDesert->addLine(tick, Note(keF3));
    riversInTheDesert->addLine(tick, Note(keC4));
    riversInTheDesert->addLine(tick, Note(keF4));
    tick += keDotQuart;

    riversInTheDesert->addLine(tick, Note(keGS3));
    riversInTheDesert->addLine(tick, Note(keC4));
    riversInTheDesert->addLine(tick, Note(keGS4));
    tick += keQuart;

    riversInTheDesert->addLine(tick, Note(keGS4));
    riversInTheDesert->addLine(tick, Note(keAS4));
    tick += keQuart;

    riversInTheDesert->addLine(tick, Note(keG3));
    riversInTheDesert->addLine(tick, Note(keG4));
    tick += keQuart;
    //Measure 24
    riversInTheDesert->addLine(tick, Note(keDS4));
    riversInTheDesert->addLine(tick, Note(keAS4));
    tick += keQuart;

    riversInTheDesert->addLine(tick, Note(keF3));
    riversInTheDesert->addLine(tick, Note(keF4));
    tick += ke8th;

    riversInTheDesert->addLine(tick, Note(keAS4));
    riversInTheDesert->addLine(tick, Note(keAS3));
    tick += keDot8th;

    riversInTheDesert->addLine(tick, Note(keGS3));
    riversInTheDesert->addLine(tick, Note(keGS4));
    tick += keDot8th;

    riversInTheDesert->addLine(tick, Note(keG3));
    riversInTheDesert->addLine(tick, Note(keG4));
    tick += ke16th;

    riversInTheDesert->addLine(tick, Note(keG3));
    riversInTheDesert->addLine(tick, Note(keG4));
    tick += ke16th;

    riversInTheDesert->addLine(tick, Note(keF4));
    riversInTheDesert->addLine(tick, Note(keD4));
    riversInTheDesert->addLine(tick, Note(keF3));
    tick += keDotQuart;

    riversInTheDesert->addLine(tick, Note(keGS4));
    riversInTheDesert->addLine(tick, Note(keCS4));
    riversInTheDesert->addLine(tick, Note(keGS3));
    tick += keQuart;

    riversInTheDesert->addLine(tick, Note(keF4));
    riversInTheDesert->addLine(tick, Note(keGS3));
    tick += keQuart;

    riversInTheDesert->addLine(tick, Note(keG3));
    riversInTheDesert->addLine(tick, Note(keDS4));
    tick += keQuart;

    riversInTheDesert->addLine(tick, Note(keRest));
    tick += keQuart;

    riversInTheDesert->addLine(tick, Note(keG3));
    riversInTheDesert->addLine(tick, Note(keDS4));
    tick += keQuart;

    riversInTheDesert->addLine(tick, Note(keG3));
    riversInTheDesert->addLine(tick, Note(keDS4));
    tick += keQuart;
    
    riversInTheDesert->addLine(tick, Note(keRest));
    tick += ke8th;
    
    
    midi.playNoteTrack(riversInTheDesert);

    midi.wait(1000);
    midi.close();
    return 0;
}