import java.util.Scanner;

public class linkArray {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element array1: ");
        int i = 0;
        while (i < array1.length) {
            System.out.println("Array element " + (i + 1) + ",");
            array1[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Enter element array2: ");
        int j = 0;
        while (j < array2.length) {
            System.out.println("Array element " + (j + 1) + ",");
            array2[j] = scanner.nextInt();
            j++;
        }
        int[] array3 = new int[9];
        for (int k = 0; k < array3.length; k++) {
            if (k <= 4) {
                array3[k] = array1[k];
            } else {
                array3[k] = array2[k - 5];
            }
            System.out.printf(array3[k] + ", ");
        }
    }
}
