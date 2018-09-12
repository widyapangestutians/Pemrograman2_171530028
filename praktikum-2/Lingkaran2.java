import java.util.Scanner;

public class Lingkaran2 { 
    public static void main(String[] args) { 
        int r;
        double Luas;

        Scanner scan = new Scanner(System.in);
        System.out.println("\tMenghitung Luas Lingkaran\t");
        System.out.print("Masukkan jari-jari = ");
        r = scan.nextInt();
        Luas = 3.14*r*r;
        System.out.println("Luas lingkaran = "+Luas);
    }
}
