import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        int size;
        String[] student;
        int[] point;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size: ");
        size = scanner.nextInt();
        student = new String[size];
        point = new int[size];

        int i = 0;
        while (i < student.length) {
            System.out.println("Student " + (i + 1) + ": ");
            student[i] = scanner.nextLine();
            i++;
        }
        int j = 0;
        while (j < point.length) {
            System.out.println("Mark for student " + (j + 1) + ": ");
            point[j] = scanner.nextInt();
            j++;
        }
        System.out.println("Show list student: ");
        for (int k = 0;k < student.length; k++) {
            System.out.println(student[k] + ",");
        }
        System.out.println("Show list point: ");
        for (int k = 0;k < point.length; k++) {
            System.out.println(point[k] + ",");
        }
        System.out.println("Students passing the exam is: ");
        for (int k = 0;k < point.length; k++) {
            if (point[k] >= 5) {
                System.out.println(student[k] + ", ");
            }
        }

    }
}
