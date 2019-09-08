public class TotalMatrix {
    public static void main(String[] args) {
        double[][] matrix = {
                {1,5,0,5},
                {10,15,0.9,5},
                {1,20,7,-3},
                {12,5,0,5.7}
        };
        double total1 = 0;
        double total2 = 0;
        for (int i = 0;i < matrix.length; i ++) {
            int j = i;
            total1 += matrix[i][j];
        }
        System.out.println("total1 " + total1);
        for (int i = 0; i < matrix.length; i ++) {
            int j = matrix.length - 1 -i;
            total2 += matrix[i][j];
        }
        System.out.println("total2 " + total2);
    }
}
