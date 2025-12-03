package Rekursif;
import java.util.Scanner;

public class Percobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();
        System.out.print("Perhitungan: ");
        cetakDeret(bilangan, pangkat);
        System.out.println(" = " + hitungPangkat(bilangan, pangkat));
    }   
    
    static int hitungPangkat(int x, int y){
        if (y == 0){
            return 1;
        } else {
            return x * hitungPangkat(x, y - 1);
        }
    }

    static void cetakDeret(int x, int y){
        if (y == 0){
            System.out.print("1");
        } else {
            System.out.print(x + "x");
            cetakDeret(x, y - 1);
        }
    }
}
