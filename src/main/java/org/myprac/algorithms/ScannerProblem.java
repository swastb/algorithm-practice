package org.myprac.algorithms;

import java.util.Scanner;

public class ScannerProblem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();        
        Double d = Double.valueOf(scan.next());
        //scan.next();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}