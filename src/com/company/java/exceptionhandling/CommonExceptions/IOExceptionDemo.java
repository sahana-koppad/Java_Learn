package com.company.java.exceptionhandling.CommonExceptions;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionDemo {

    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("test.txt");

            int ch;
            while ((ch = file.read()) != -1) {
                System.out.print((char) ch);
            }

            file.close();

        } catch (IOException e) {
            System.out.println("I/O Error Occurred");
            System.out.println(e);
        }
    }
}