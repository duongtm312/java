import java.util.Scanner;
public class ReadNumber {
public static String NumberToLetter( int x ){
    switch (x){
        case 0:
            return " Không";
        case 1:
            return " Một";
        case 2:
            return " Hai";
        case 3:
            return " Ba";
        case 4:
            return " Bốn";
        case 5:
            return " Năm";
        case 6:
            return " Sáu";
        case 7:
            return " Bảy";
        case 8:
            return " Tám";
        case 9:
            return " Chín";
    }
    return null;
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số");
        String num = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        int check;
        for (int i = 0; i < num.length(); i++) {
            check = Integer.parseInt(String.valueOf(num.charAt(i)));
            result.append( NumberToLetter(check));

        }
        System.out.println(result);

    }
}
