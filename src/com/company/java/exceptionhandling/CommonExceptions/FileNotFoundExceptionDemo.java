package com.company.java.exceptionhandling.CommonExceptions;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionDemo {

    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            System.out.println(e);
        }
    }
}