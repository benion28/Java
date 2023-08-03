package com.benionpackage;

import java.io.*;
import java.util.Scanner;

/*
        Scanner scanner = new Scanner(System.in);

        HandleFile my_file = new HandleFile();

        while (true) {
            System.out.println();
            System.out.println("--------------------------");
            System.out.print("Enter A Keyword To Perform A Task: ");
            String input = scanner.nextLine();
            String keyword = input.toLowerCase().trim();
            if (keyword.equals("create")) {
                System.out.println("--- File Creation ----");

                System.out.print("Type In The File Directory: ");
                String file_directory = scanner.nextLine();

                System.out.print("Type In The File Name: ");
                String file_name = scanner.nextLine();

                my_file.create_file(file_directory, file_name);
                break;
            } else if (keyword.equals("info")) {
                System.out.println("--- File Information ----");

                System.out.print("Type In The File Directory: ");
                String file_directory = scanner.nextLine();

                System.out.print("Type In The File Name: ");
                String file_name = scanner.nextLine();

                my_file.file_info(file_directory, file_name);
                break;
            } else if (keyword.equals("read")) {
                System.out.println("--- File Reading ----");

                System.out.print("Type In The File Directory: ");
                String file_directory = scanner.nextLine();

                System.out.print("Type In The File Name: ");
                String file_name = scanner.nextLine();

                System.out.println();
                my_file.read_file(file_directory, file_name);
                break;
            } else if (keyword.equals("write")) {
                System.out.println("--- File Writing ----");

                System.out.print("Type In The File Directory: ");
                String file_directory = scanner.nextLine();

                System.out.print("Type In The File Name: ");
                String file_name = scanner.nextLine();

                System.out.print("Type In The Text To Be Written: ");
                String file_text = scanner.nextLine();
                my_file.write_file(file_directory, file_name, file_text);
                break;
            } else if (keyword.equals("copy")) {
                System.out.println("--- File Copying ----");

                System.out.print("Type In The File Directory You Want To Copy From: ");
                String file_directory_from = scanner.nextLine();

                System.out.print("Type In The File Name You Want To Copy From: ");
                String file_name_from = scanner.nextLine();

                System.out.print("Type In The File Directory You Want To Copy To: ");
                String file_directory_to = scanner.nextLine();

                System.out.print("Type In The File Name You Want To Copy From To: ");
                String file_name_to = scanner.nextLine();

                System.out.println();
                my_file.copy_file(file_directory_from, file_name_from, file_directory_to, file_name_to);
                break;
            } else {
                System.out.println("---- Hints ---- \n Enter \"create\" to create a new file \n Enter \"info\" to get the details of a file \n Enter \"read\" to read the contents of a file \n Enter \"write\" to write data into a file \n Enter \"copy\" to copy file contents to another file");
            }
        }
*/

public class HandleFile {

    HandleFile() {
        System.out.println();
        System.out.println("<<<<<< Handle File Constructed >>>>>>");
    }

    public void create_file(String directory, String filename) {
        try {
            File file_object = new File(directory + "\\" + filename);
            if (file_object.createNewFile()) {
                System.out.println(file_object.getName() + " ---- File Created Successfully----");
            } else {
                System.out.println("File Already Exists");
            }
        } catch (IOException file_error) {
            System.out.println("File Creation Error Occurred");
            file_error.printStackTrace();
        }
    }

    public void file_info(String directory, String filename) {
        File file_object = new File(directory + "\\" + filename);
        if (file_object.exists()) {
            System.out.println("File Name: " + file_object.getName());
            System.out.println("Absolute Path: " + file_object.getAbsolutePath());
            System.out.println("IsWriteable: " + file_object.canWrite());
            System.out.println("IsReadable: " + file_object.canRead());
            System.out.println("File Size(bytes): " + file_object.length());
        } else {
            System.out.println("File Does Not Exists");
        }
    }

    public void read_file(String directory, String filename) {
        try {
            File file_object = new File(directory + "\\" + filename);
            Scanner my_reader = new Scanner(file_object);
            while (my_reader.hasNextLine()) {
                String data = my_reader.nextLine();
                System.out.println(data);
                System.out.println();
                System.out.println("------ Successfully Read File ---- " + file_object.getName());
            }
            my_reader.close();
        } catch (FileNotFoundException file_error) {
            System.out.println("File Reading Error Occurred");
            file_error.printStackTrace();
        }
    }

    public void write_file(String directory, String filename, String text) {
        try {
            FileWriter file_writer = new FileWriter(directory + "\\" + filename);
            File file_object = new File(directory + "\\" + filename);
            file_writer.write(text);
            file_writer.close();
            System.out.println("Successfully Wrote To File " + file_object.getName());
        } catch (IOException file_error) {
            System.out.println("File Writing Error Occurred");
            file_error.printStackTrace();
        }
    }

    public void copy_file(String directory_from, String filename_from, String directory_to, String filename_to) throws IOException {
        FileReader read_file = null;
        FileWriter write_file = null;
        try {
            read_file = new FileReader(directory_from + "\\" + filename_from);
            write_file = new FileWriter(directory_to + "\\" + filename_to);
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