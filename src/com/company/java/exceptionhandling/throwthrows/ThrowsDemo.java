package com.company.java.exceptionhandling.throwthrows;

import java.io.FileReader;
import java.io.FileNotFoundException;


public class ThrowsDemo {
    public static void readFile()
            throws FileNotFoundException {
        FileReader file = new FileReader("abc.txt");
    }

    public static void main(String[] args)
            throws FileNotFoundException {
        readFile();
    }
}
