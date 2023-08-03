package com.benionpackage;


// Character Streams

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile2 {
    public static void main(String args[]) throws IOException {
        FileReader read_file = null;
        FileWriter write_file = null;
        try {
            read_file = new FileReader("C:\\Benion Programmings\\Java\\File Handling\\files\\benion-tech.txt");
            write_file = new FileWriter("C:\\Benion Programmings\\Java\\File Handling\\files\\benion-copy.txt");
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