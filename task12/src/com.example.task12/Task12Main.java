package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void selectionSort(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        try{
            for (int i = 0; i < arr.length; i++) {
                int pos = i;
                int min = arr[i];
                //цикл выбора наименьшего элемента
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < min) {
                        //pos - индекс наименьшего элемента
                        pos = j;
                        min = arr[j];
                    }
                }
                arr[pos] = arr[i];
                //меняем местами наименьший с arr[i]
                arr[i] = min;
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}