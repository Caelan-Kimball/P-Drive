/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   GDIPlusExampleProgram.cpp
 * Author: Caelan Kimball
 *
 * Created on May 10, 2018, 11:45 AM
 */

#define UNICODE
#include <cstdlib>
#include <windows.h>
#include <./gdiplus/gdiplus.h>
#include <time.h>



using namespace std;
using namespace Gdiplus;

LRESULT CALLBACK WndProc(HWND, UINT, WPARAM, LPARAM);
VOID OnPaint(HDC hdc);

float myX = 100;
float myY = 100;

INT WINAPI WinMain(HINSTANCE hInstance, HINSTANCE, PSTR, INT iCmdShow) {
    
    HWND hWnd;
    MSG msg;
    WNDCLASS wndClass;
    GdiplusStartupInput gdiplusStartupInput;
    ULONG_PTR gdiplusToken;
    //Initialize GDI
    GdiplusStartup(&gdiplusToken, &gdiplusStartupInput, NULL);

    wndClass.style = CS_HREDRAW | CS_VREDRAW;
    wndClass.lpfnWndProc = WndProc;
    wndClass.cbClsExtra = 0;
    wndClass.cbWndExtra = 0;
    wndClass.hInstance = hInstance;
    wndClass.hIcon = LoadIcon(NULL, IDI_APPLICATION);
    wndClass.hCursor = LoadCursor(NULL, IDC_ARROW);
    wndClass.hbrBackground = (HBRUSH) GetStockObject(WHITE_BRUSH);
    wndClass.lpszMenuName = NULL;
    wndClass.lpszClassName = TEXT("GettingStarted");

    RegisterClass(&wndClass);

    hWnd = CreateWindow(
            TEXT("GettingStarted"), //window class name
            TEXT("Getting Started"), //window caption
            WS_OVERLAPPEDWINDOW, //window style
            CW_USEDEFAULT, //initial x position
            CW_USEDEFAULT, //initial y position
            640, //initial x size
            480, //initial y size
            NULL, //parent window handle
            NULL, //window menu handle
            hInstance, //program instance handle
            NULL); // creation parameters

    ShowWindow(hWnd, iCmdShow);
    UpdateWindow(hWnd);

    while (GetMessage(&msg, NULL, 0, 0)) {
        TranslateMessage(&msg);
        DispatchMessage(&msg);
    }

    GdiplusShutdown(gdiplusToken);
    return msg.wParam;
}// end of winMain

LRESULT CALLBACK WndProc(HWND hWnd, UINT message, WPARAM wParam, LPARAM lParam) {
    HDC hdc;
    PAINTSTRUCT ps;

    switch (message) {
        case WM_PAINT:
            hdc = BeginPaint(hWnd, &ps);
            OnPaint(hdc);
            EndPaint(hWnd, &ps);
            return 0;
        case WM_DESTROY:
            PostQuitMessage(0);
            return 0;
        default:
            return DefWindowProc(hWnd, message, wParam, lParam);
    }
}//WndProc

VOID OnPaint(HDC hdc) {
    srand(time(NULL));
    int color = rand() %255;

    //create a graphics object from the main window hdc
    Graphics graphics(hdc);

    //pens and brushes
    Pen pen(Color(color, color, color, 255));

    Pen pen2(Color(color, color, color, 128));

    SolidBrush brush(Color(color, color, color, 255));

    LinearGradientBrush linGrBrush(
            Point(0, 0),
            Point(200, 100),
            Color(color, color, color, 255), // opaque blue
            Color(color, color, color, 0)); // opaque green
    
    Pen pen3(&linGrBrush, 10);
    
    graphics.DrawLine(&pen, 0, 0, 200, 100);
    
    FontFamily fontFamily(L"Times New Roman");
    Font font(&fontFamily, 44, FontStyleRegular, UnitPixel);
    PointF pointF(100.0f,20.0f);
    
    graphics.DrawString(L"Hello World!", -1, &font, pointF, &linGrBrush);
    
    // draw a circle
    graphics.DrawEllipse(&pen2, 350, 125, 200, 200);
    
    // 200 circles
    for(int x = 0; x < 400; x++){
        graphics.DrawEllipse(&pen2, 75+ x, 85, 100, 100);
        pen2.SetColor(Color(color, color, color, 128));
    }
    graphics.DrawLine(&pen3, 10, 100, 450, 300);
    graphics.FillEllipse(&linGrBrush, 50, 200, 200, 200);
    pointF.X = 100.0f;
    pointF.Y = 100.0f;
    graphics.DrawString(L"Computer Programming!", -1, &font, pointF, &brush);
}
/*
 * 
 */


