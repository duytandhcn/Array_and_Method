import java.util.Scanner;

public class MinArray {
    public static int minValue(int array[]) {
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i ++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size: ");
        size = scanner.nextInt();
        arr = new int[size];
        int i =0;
        while (i < arr.length) {
            System.out.println("Enter element " + (i  + 1)+ ": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Minvalue in array = " + arr[minValue(arr)] + " at index " + minValue(arr));
    }
}
