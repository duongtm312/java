import java.util.Arrays;
import java.util.Scanner;
public class ArrayDelete {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,9,0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần xóa");
        int num = scanner.nextInt();
        int i = 0;
        boolean check = false;
        for (; i < arr.length; i++) {
            if (num==arr[i]){
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("Số cần xóa không thuộc mảng");
        }else {
            int[] arr2 = new int[arr.length-1];
            for (int j = 0; j < arr.length-1; j++) {
                if (j<i){
                    arr2[j] = arr[j];
                }else {
                    arr2[j] = arr[j+1];
                }
            }
            System.out.println(Arrays.toString(arr2));
        }
    }
}
