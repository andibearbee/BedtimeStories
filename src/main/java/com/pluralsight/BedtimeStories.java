package com.pluralsight;
import java.io.*;
import java.util.Scanner;
public class BedtimeStories {
    //show the user the story options
    //prompt the user to input their choice
    //tell the scanner where to find the file
    //print file contents
    public static void main(String[] args) {
            System.out.println("Choose Your Story: \n" + "1: Goldilocks \n" +
                    "2: Hansel and Gretel \n" +
                    "3: Mary Had a Little Lamb");
            Scanner storyChoice = new Scanner(System.in);
            int userChoice = storyChoice.nextInt();
            switch (userChoice) {
                case 1: {
                    readGoldilocks();
                    break;
                }
                case 2: {
                    readHanselAndGretel();
                break;
                }
                case 3: {
                    readMaryHadALittleLamb();
                    break;
                }
            }
// create a FileInputStream object pointing to
// a specific file

    }
    public static void readGoldilocks() {
        int countLine = 0;
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/goldilocks.txt");
// create a Scanner to reference the file to be read
            Scanner scanner = new Scanner(fis);
            String story;
// read until there is no more data
            while (scanner.hasNextLine()) {
                countLine++;
                story = scanner.nextLine();
                System.out.println(countLine + " " + story);
            }
// close the scanner and release the resources
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
        public static void readHanselAndGretel() {
        int countLine = 0;
            try {
                FileInputStream fis = new FileInputStream("src/main/resources/hansel_and_gretel.txt");
// create a Scanner to reference the file to be read
                Scanner scanner = new Scanner(fis);
                String story;
// read until there is no more data
                while (scanner.hasNextLine()) {
                    countLine++;
                    story = scanner.nextLine();
                    System.out.println(countLine + " " + story);
                }
// close the scanner and release the resources
                scanner.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
            public static void readMaryHadALittleLamb() {
        int countLine = 0;
                try {
                    FileInputStream fis = new FileInputStream("src/main/resources/mary_had_a_little_lamb.txt");
// create a Scanner to reference the file to be read
                    Scanner scanner = new Scanner(fis);
                    String story;
// read until there is no more data
                    while (scanner.hasNextLine()) {
                        countLine++;
                        story = scanner.nextLine();
                        System.out.println(countLine + " " + story);
                    }
// close the scanner and release the resources
                    scanner.close();
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }

            }
        }
