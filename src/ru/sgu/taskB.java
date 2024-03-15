package ru.sgu;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;


public class taskB {
    public static void main(String[] args) {

        while (true) {

            try {

                Scanner in = new Scanner(System.in);
                String str = in.nextLine();
                String[] s = str.split(" ");
                BigDecimal a = new BigDecimal(s[0]);
                BigDecimal b = new BigDecimal(s[1]);

                switch (s[2]) {
                    case ("ADD"):
                        System.out.println(a.add(b));
                        break;
                    case ("SUB"):
                        System.out.println(a.subtract(b));
                        break;
                    case ("MULT"):
                        System.out.println(a.multiply(b));
                        break;
                    case ("DIV"):
                        System.out.println(a.divide(b));
                        break;
                    case ("REM"):
                        System.out.println(a.remainder(b));
                        break;
                    case ("POW"):
                        System.out.println(new BigInteger(s[0]).pow(Integer.parseInt(s[1])));
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
