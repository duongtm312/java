import java.util.Scanner;

public class Array2Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 10)
                System.out.println("Size should not exceed 10");
        } while (size > 10);
        int size2;
        do {
            System.out.print("Enter a size 2:");
            size2 = scanner.nextInt();
            if (size2 > 10)
                System.out.println("Size should not exceed 10");
        } while (size2 > 10);
        int[][] array = new int[size][size2];
        int i = 0;
        int j;
        System.out.println(array.length);
        while (i < array.length) {
            j =0;
            while (j < array[i].length) {
                System.out.print("Enter a number in" + (i + 1) +":"+(j+1)+ ": ");
                array[i][j] = scanner.nextInt();
                j++;
            }
            System.out.println("i: "+i);
            i++;
        }
        int check;
        do {
            System.out.println("Enter index");
            check = scanner.nextInt();
            if (check>array.length||check<0){
                System.out.println("Wrong index");
            }
        }while (check>array.length||check<0);
        int sum =0;
        for (int k = 0; k < array[check].length; k++) {
            sum +=array[check][k];
        }
        System.out.println("Tổn tại vị trí"+check+"bằng"+sum);
    }

}
