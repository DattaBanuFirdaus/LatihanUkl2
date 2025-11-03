import java.util.Scanner;

public class SoalUkl2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Bilangan : ");
        int n = input.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " adalah Bilangan Genap");
        } else {
            System.out.println(n + " adalah Bilangan Ganjil");
        }
    }
}
