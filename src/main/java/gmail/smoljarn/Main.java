package gmail.smoljarn;

public class Main {
    public static void main(String[] args) {
        int[] array = {100, 23, 45, 42, 12, 19};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i] + " ");
            }
        }
    }
}