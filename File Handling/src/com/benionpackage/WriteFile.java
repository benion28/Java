package com.benionpackage;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter file_writer = new FileWriter("C:\\Benion Programmings\\Java\\File Handling\\files\\First File.txt");
            file_writer.write("Benion Is An Excellent Programmer To Have Existed On Planet Earth..!!!!");
            file_writer.close();
            System.out.println("Successfully Wrote To This File");
        } catch (IOException file_error) {
            System.out.println("File Writing Error Occurred");
            file_error.printStackTrace();
        }
    }
}
