package com.example.task11;

import org.assertj.core.internal.bytebuddy.implementation.bytecode.Throw;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        try {
            int min = Integer.MAX_VALUE;
            int minIndex = 0;
            for (int i = 0; i < arr.length; i++){
                if (arr[i] <= min){
                    min = arr[i];
                    minIndex = i;
                }
            }
            arr[minIndex] = arr[0];
            arr[0] = min;
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }



    }

}