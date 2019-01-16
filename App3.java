import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

            System.out.println("Enter a sequence of numbers");
            String seq = input.nextLine();

        char[] A = seq.toCharArray();

        for (int j = 1; j < A.length; j++) {
            char key = A[j];
            int i = j - 1;
            while (i >= 0 && A[i] < key) {
                A[i + 1] = A[i];
                i = i - 1;
            }
            A[i + 1] = key;
        }
        for (int b = 0; b < A.length; b++) {
            System.out.print(A[b]+ " ");
        }
    }
}

