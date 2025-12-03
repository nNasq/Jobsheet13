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

        int totalIteratif = totalIteratif(data);

        int totalRekursif = totalRekursif(data, n);

        System.out.println("Total (iteratif) dari " + n + " angka yang dimasukkan adalah: " + totalIteratif);
        System.out.println("Total (rekursif) dari " + n + " angka yang dimasukkan adalah: " + totalRekursif);
    }

    static int totalIteratif(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    static int totalRekursif(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return arr[n - 1] + totalRekursif(arr, n - 1);
    }
}
