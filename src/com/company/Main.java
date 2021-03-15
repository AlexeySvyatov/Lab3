package com.company;
import java.util.Scanner;
public class Main {
    // var 16
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива - ");
        int[] array;
        int n = in.nextInt();
        array = new int[n];
        for(int i = 0; i < array.length; i++){
            array[i] = ((int) (Math.random() * 9));
            System.out.print(array[i]);
        }
        System.out.println("  ");
        for(int i = 0; i < array.length; i++){
            if(i % 2 == 0){
                System.out.print(array[i]);
            }
        }
    }
}
