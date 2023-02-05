package org.example;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            Scanner sc = new Scanner(new File ("data.txt"));
            int x = Integer.parseInt("abc");
        } catch (FileNotFoundException | ArithmeticException ex) {
            System.out.println("An exception occurred: " + ex.getMessage());
        }
    }
}