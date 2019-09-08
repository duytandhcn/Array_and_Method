import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size: ");
        size = scanner.nextInt();
        int[] integer = new int[size];
        int i = 0;
        while (i < integer.length) {
            System.out.println("Enter element " + (i + 1) + ": ");
            integer[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Show element in array: ");
        for (int j = 0; j < integer.length; j++) {
            System.out.printf(integer[j] + "\t");
        }
        int n;
        System.out.println("Enter add number: ");
        n = scanner.nextInt();
        int index;
        System.out.println("Position add number: ");
        index = scanner.nextInt();

        System.out.println("Array after add number: ");
        if (index > 0 || index < integer.length - 1) {
            for (int j = 0; j < integer.length; j++) {
                if (index == j) {
                    for (int k = integer.length - 1; k > j; k--) {
                        integer[k] = integer[k - 1];
                    }
                    integer[j] = n;
                }
                System.out.printf(integer[j] + "\t");
            }
        }
    }
}
