import java.util.Scanner;
public class CheckString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập nội dung");
        String str = scanner.nextLine();
        System.out.println("Nhập ký tự");
        String check = scanner.nextLine();
        int count = 0;
        for (int i = 0; i <str.length(); i++) {

            if (str.charAt(i) == check.charAt(0) ){
                count++;
            }
        }
        System.out.println(count);

    }

}
