import java.util.Scanner;
public class ReadNumber {
    public static void main(String[] args) {
        int a = 12345678;
        String[] arr = String.valueOf(a).split("");
        System.out.println(read(arr));
    }

    public static String read(String[] arr) {
        String str = "";
        int length = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (length % 3 == 0 || !arr[i].equals("0")) {
                str += sayNumber(arr[i], length);

                if (length % 3 == 0) {
                    str += "Trăm ";
                }
                if (length % 3 == 2 && !arr[i].equals("1")) {
                    str += "Mươi ";
                }
            } else {
                if (length % 3 == 2 && !arr[i + 1].equals("0")) {
                    str += "Ninh ";
                }
            }
            if (length == 7 && arr.length >= 6) {
                str += "Triệu ";
            }
            if (length == 4 && arr.length >= 3) {
                str += "Nghìn ";
            }

            length--;
        }
        return str;
    }

    public static String readOne(String now, int length) {
        if (now.equals("1") && length % 3 == 2) {
            return "Mười ";
        } else {
            return "Một ";
        }
    }

    public static String sayNumber(String number, int length) {
        switch (number) {
            case "0":
                return "Không ";
            case "1":
                return readOne(number, length);
            case "2":
                return "Hai ";
            case "3":
                return "Ba ";
            case "4":
                return "Bốn ";
            case "5":
                return "Năm ";
            case "6":
                return "Sáu ";
            case "7":
                return "Bảy ";
            case "8":
                return "Tám ";
            case "9":
                return "Chín ";
            default:
                return "";
        }
    }
}
