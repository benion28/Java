package com.benionpackage;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {
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
    }
}