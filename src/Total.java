import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();

        int[] data = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            data[i] = sc.nextInt();
        }

        int totalIteratif = hitungIteratif(data);

        int totalRekursif = hitungRekursif(data, n);

        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + totalIteratif);
    }

    static int hitungIteratif(int[] arr) {
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return total;
    }

    static int hitungRekursif(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } else {
            return arr[n - 1] + hitungRekursif(arr, n - 1);
        }
    }
}
