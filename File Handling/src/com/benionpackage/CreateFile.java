package com.benionpackage;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File file_object = new File("C:\\Benion Programmings\\Java\\File Handling\\files\\First File.txt");
            if (file_object.createNewFile()) {
                System.out.println(file_object.getName() + " ---- File Created Successfully");
            } else {
                System.out.println("File Already Exists");
            }
        } catch (IOException file_error) {
            System.out.println("File Creation Error Occurred");
            file_error.printStackTrace();
        }
    }
}
