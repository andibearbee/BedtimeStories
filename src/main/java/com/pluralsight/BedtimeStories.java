package com.pluralsight;
import java.io.*;
import java.util.Scanner;
public class BedtimeStories {
    //show the user the story options
    //prompt the user to input their choice
    //tell the scanner where to find the file
    //print file contents
    public static void main(String[] args) {
        try {
// create a FileInputStream object pointing to
// a specific file
            FileInputStream fis = new FileInputStream("src/main/resources/hansel_and_gretel.txt");
// create a Scanner to reference the file to be read
            Scanner scanner = new Scanner(fis);
            String story;
// read until there is no more data
            while (scanner.hasNextLine()) {
                story = scanner.nextLine();
                System.out.println(story);
            }
// close the scanner and release the resources
            scanner.close();
        }
        catch (IOException e) {
// display stack trace if there was an error
            e.printStackTrace();
        }
    }
}
