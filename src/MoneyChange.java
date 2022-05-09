import java.util.Scanner;
public class MoneyChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000, usd;
        System.out.println("Nhập số tiền USD");
        usd = scanner.nextDouble();
        double change = usd*vnd;
        System.out.println("Giá trị VND: " +change);
    }
}
