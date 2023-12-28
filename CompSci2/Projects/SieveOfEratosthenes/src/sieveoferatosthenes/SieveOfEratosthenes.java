/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sieveoferatosthenes;

import java.util.*;
import static java.lang.System.*;

/**
 *
 * @author 020022
 */
public class SieveOfEratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(in);
        final int MAX = 100;
        boolean Prs[];
        boolean NPr[];
        Prs = new boolean[MAX];
        computePrimes(Prs);
        displayPrimes(Prs);
    }

    public static void computePrimes(boolean primes[]) {

        for (int x = 0; x < primes.length; x++) {
            primes[x] = true;
        }
        for (int x = 2; x < primes.length; x++) {

            for (int y = x+x; y < primes.length; y += x) {
                primes[y] = false;
            }
        }

    }

    public static void displayPrimes(boolean primes[]) {
        for (int x = 2; x < primes.length; x++) {
            if (primes[x] == true) {
                out.print(x + " ");
            } else {

            }
        }
    }
}
