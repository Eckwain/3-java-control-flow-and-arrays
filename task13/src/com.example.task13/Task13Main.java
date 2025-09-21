package com.example.task13;

import java.util.Arrays;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 1100, 7, 8};
        int[] filteredArray = removeMoreThen1000(arr);
        System.out.println(Arrays.toString(filteredArray));

    }

    static int[] removeMoreThen1000(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        try {
            int numOfMoreThan1000 = 0;
            for (int j : arr){
                if (j > 1000){
                    numOfMoreThan1000++;
                }
            }
            int[] newArr = new int[arr.length - numOfMoreThan1000];
            int index = 0;
            for (int i : arr){
                if (i <= 1000){
                    newArr[index] = i;
                    index++;
                }
            }
            return newArr;
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }

}