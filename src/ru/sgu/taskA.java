package ru.sgu;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class taskA {

    public static void main(String[] args) {
        taskA streamInt = new taskA();
        streamInt.printResult(x -> x > 5);
    }

    public IntStream read(){
        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                int[] array = new int[10];
                System.out.println("Введите 10 элементов:");
                for (int i = 0; i < 10; i++) {
                    array[i] = in.nextInt();
                }
                IntStream stream = Arrays.stream(array);
                return stream;
            }  catch (InputMismatchException e) {
                System.out.println("Некорректный ввод");
            }
        }
    }

    public IntStream usingPredicate(IntStream stream, IntPredicate predicate){
        return stream.filter(predicate);
    }

    public void printResult(IntPredicate predicate){
        usingPredicate(this.read(), predicate).forEach(System.out::println);
    }
}