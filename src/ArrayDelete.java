import java.util.Arrays;
import java.util.Scanner;
public class ArrayDelete {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,9,0,1,1,2};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần xóa");
        int num = scanner.nextInt();
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (num==arr[i]){
                count ++;
            }
        }
        for (int i = 0; i < count; i++) {
            arr = deleteArray(arr,num);
        }
        System.out.println(Arrays.toString(arr));
    }
    static int[] deleteArray(int[]array,int num){
        int i =0;
        int[] arr2 = new int[array.length-1];
        for (; i < array.length; i++) {
            if (num==array[i]){
                break;
            }
        }
            for (int j = 0; j < array.length-1; j++) {
                if (j<i){
                    arr2[j] = array[j];
                }else {
                    arr2[j] = array[j+1];
                }
            }
        return arr2;
    }
}
