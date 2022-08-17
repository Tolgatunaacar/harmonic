import java.util.Scanner;

public class harmonic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı girin:");
        int number = input.nextInt();
        double harmonic =0;

        for (double i =1; i<= number;i++){
            harmonic += (1/i);
        }
        System.out.println(harmonic);
    }
}
