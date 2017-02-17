package main.java;

import java.util.Scanner;

/**
 * Created by bingwang on 2/17/17.
 */
public class Main {
    public static void main(String[] args){
        PrimeFactorPrinter primeFactorPrinter = new PrimeFactorPrinter();
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        primeFactorPrinter.printFactor(input);
    }
}

