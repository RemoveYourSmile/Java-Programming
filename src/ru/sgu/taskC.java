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
            String toWrite;
            while (in.hasNextLine()){
                int counter = 0;
                toWrite = "%s %s%s";
                String nextLine = in.nextLine();

                if (nextLine.isEmpty()) {
                    out.write("\n");
                    continue;
                }

                String[] words = nextLine.split(" ");

                for (String str : words) {
                    if (counter == 3) {
                        break;
                    }
                        if (!isNumeric(str)) {
                            switch (counter) {
                                case 0:
                                    toWrite = String.format(toWrite, "%s", str.charAt(0) + ".", "%s");
                                    break;
                                case 1:
                                    toWrite = String.format(toWrite, str, "%s");
                                    break;
                                case 2:
                                    toWrite = String.format(toWrite, str.charAt(0) + ".");
                                    break;
                            }
                        }
                        counter++;
                }
                toWrite = toWrite.replace("%s", "").trim();
                out.write(toWrite + "\n");
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