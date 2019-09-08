public class Chuoi {
    public static void main(String[] args) {
        String str = "hello_i_am_a_student";
        char x = 'a';
        int count = 0;
        for (int i =0; i < str.length(); i++){
            if (x == str.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
