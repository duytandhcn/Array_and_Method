public class MaxArrayMatrix {
    public static void main(String[] args) {
        double[][] matrix = {
                {1,5,0,5},
                {10,15,0.9,5},
                {1,20,7,-3},
                {12,5,0,5.7}
        };
        double max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0;j < matrix[i].length; j++) {
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Maxvalue: " + max);
    }
}
