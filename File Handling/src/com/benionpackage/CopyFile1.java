package com.benionpackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


// Byte Streams

public class CopyFile1 {
    public static void main(String args[]) throws IOException {
        FileInputStream read_file = null;
        FileOutputStream write_file = null;
        try {
            read_file = new FileInputStream("C:\\Benion Programmings\\Java\\File Handling\\files\\benion-tech.txt");
            write_file = new FileOutputStream("C:\\Benion Programmings\\Java\\File Handling\\files\\copy.txt");
            int file_text;
            while ((file_text = read_file.read()) != -1) {
                write_file.write(file_text);
            }
            System.out.println("--- File Copied Successfully ---");
        }finally {
            if (read_file != null) {
                read_file.close();
            }
            if (write_file != null) {
                write_file.close();
            }
        }
    }
}