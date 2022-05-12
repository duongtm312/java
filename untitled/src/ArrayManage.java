import java.util.Scanner;

public class ArrayManage {
    static int[] array = {1,2,3,4};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("=====Menu=====");
            System.out.println("|1.Show array");
            System.out.println("|2.Add element");
            System.out.println("|3.Edit array");
            System.out.println("|4.Delete element");

            do {
                System.out.println("Enter choice");
                choice = scanner.nextInt();
                if (choice < 0 || choice > 4) {
                    System.out.println("Wrong choice");
                }
            }
            while (choice < 0 || choice > 4);

            switch (choice) {
                case 1:
                    showArray(array);
                    break;
                case 2:
                    System.out.println("Enter element");
                    int element = scanner.nextInt();
                    addElement(element);
                    showArray(array);
                    break;
                case 3:
                    System.out.println("Enter element");
                    int elementEdit = scanner.nextInt();
                    System.out.println("Enter index");
                    int index = scanner.nextInt();
                    editArray(elementEdit, index);
                    showArray(array);
                    break;
                case 4:
                    System.out.println("Enter index");
                    int indexDelete = scanner.nextInt();
                    deleteElement(indexDelete);
                    showArray(array);
                    break;

            }
        }
    }

    static void addElement(int element) {
        int[] arr2 = new int[array.length + 1];
        for (int i = 0; i < arr2.length - 1; i++) {
            arr2[i] = array[i];
        }
        arr2[array.length] = element;
        array = arr2;
    }

    static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }

    static void editArray(int elementEdit, int index) {
        array[index] = elementEdit;
    }

    static void deleteElement(int indexDelete) {
        int[] arr2 = new int[array.length - 1];
        for (int i = 0; i < arr2.length; i++) {
            if (i < indexDelete) {
                arr2[i] = array[i];
            } else {
                arr2[i] = array[i + 1];
            }
        }
        array = arr2;
    }
}
