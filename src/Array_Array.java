import java.util.Arrays;
import java.util.Scanner;

public class Array_Array {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 10)
                System.out.println("Size should not exceed 20");
        } while (size > 10);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        int size2;
        int[] array2;
        do {
            System.out.print("Enter a size:");
            size2 = scanner.nextInt();
            if (size2 > 10)
                System.out.println("Size should not exceed 20");
        } while (size2 > 10);
        array2 = new int[size2];
        int j = 0;
        while (j < array2.length) {
            System.out.print("Enter element" + (j + 1) + " : ");
            array2[j] = scanner.nextInt();
            j++;
        }
        int[] array3 = new int[array.length + array2.length];
        for (int k = 0; k < array.length; k++) {
            array3[k]=array[k];
        }
        for (int k = 0; k < array2.length; k++) {
            array3[array.length+k] = array2[k];

        }
        System.out.println(Arrays.toString(array3));
    }
}
