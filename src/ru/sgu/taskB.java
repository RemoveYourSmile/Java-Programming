package ru.sgu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;



public class taskB {
    int max = -1000000000;
    int min = 1000000000;

    public static void main(String[] args){
        taskB b = new taskB();
        b.print();
    }

    List<Integer> readList() {
        while (true) {
            try {
                List<Integer> list = new ArrayList<>();
                Scanner in = new Scanner(System.in);
                System.out.println("Введите размер массива: ");
                int n = in.nextInt();
                System.out.println("Введите " + n + " значений:");
                for (int i = 0; i < n; i++) {
                    list.add(i, in.nextInt());
                }
                return list;
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод");
            }
        }
    }

    int findMax(List<Integer> list){
        if (list.size() < 2){
            return 0;
        }
        max = list.stream().max(Integer::compare).get();
        list.removeIf(x -> x == max);
        if (list.size() == 0){
            return max;
        } else max = list.stream().max(Integer::compare).get();
        return max;
    }

    int findMin(List<Integer> list){
        if (list.size() < 3){
            return 0;
        }
        for (int i = 0; i < 2; i++){
            if (list.size() == 0){
                break;
            }
            min = list.stream().min(Integer::compare).get();
            list.removeIf(x -> x == min);
        }
        if (list.size() == 0){
            return min;
        } else min = list.stream().min(Integer::compare).get();
        return min;
    }

    void print(){
        System.out.println("2-е максимальное значение: " + findMax(this.readList()));
        System.out.println("3-е минимальное значение: " + findMin(this.readList()));
    }
}
