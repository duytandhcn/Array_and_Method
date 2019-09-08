import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter delete number: ");
        number = scanner.nextInt();
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Array after delete number: ");
            for (int i = 0; i < array.length; i++) {
                if (array[i] == number) {
                    for (int j = i;j < array.length -1; j++){
                        array[j] = array[j + 1];
                    }
                    array[array.length -1] = 0;
                }
                System.out.printf(array[i] + "\t");
            }
        } else {
            System.out.println("Number not in array");
        }
    }
}
