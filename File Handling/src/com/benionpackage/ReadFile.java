package com.benionpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File file_object = new File("C:\\Benion Programmings\\Java\\File Handling\\files\\First File.txt");
            Scanner my_reader = new Scanner(file_object);
            while (my_reader.hasNextLine()) {
                String data = my_reader.nextLine();
                System.out.println(data);
            }
            my_reader.close();
        } catch (FileNotFoundException file_error) {
            System.out.println("File Reading Error Occurred");
            file_error.printStackTrace();
        }
    }
}
