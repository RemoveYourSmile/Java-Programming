package ru.sgu;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class taskC {
    public static void main(String[] args){

        File file = new File("input.txt");

        try {
            Scanner in = new Scanner(file);
            FileWriter out = new FileWriter("output.txt");

            while (in.hasNextLine()){
                String[] words = in.nextLine().split(" ");
                if (words.length >= 3){
                    if (isNumeric(words[2])){
                        out.write(words[1] + " " + words[0].charAt(0) + ".\n");
                    } else {
                        out.write(words[1] + " " + words[0].charAt(0) + "." + words[2].charAt(0) + ".\n");
                    }
                } else if (words.length == 2){
                    out.write(words[1] + " " + words[0].charAt(0) + ".\n");
                } else if (words.length == 1){
                    out.write("\n");
                }
            }
            out.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}