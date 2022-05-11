import java.util.Arrays;
import java.util.Scanner;
public class ArrayIn {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,9,0};
        int[] arr2 = new int[arr.length+1];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần thêm");
        int num = scanner.nextInt();
        int index;
        do {
            System.out.println("Nhập vị trí");
            index = scanner.nextInt();
        }while (index <-1&&index>arr.length-1 );
        for (int i = 0; i < arr.length; i++) {
            if (i<index){
                arr2[i]=arr[i];
            }else {
                arr2[i+1] = arr[i];
            }
        }
        arr2[index] = num;
        System.out.println(Arrays.toString(arr2));
    }
}
