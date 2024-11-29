package lesson4;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 7, 3, 5, 11, 2};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverse (int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
