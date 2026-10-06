import java.util.Scanner;

public class StudiKasus128 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup;
        int uangBayar;
        int totalHarga;
        int diskon;
        int totalBayar;
        int kembalian;
        int kurang;

        System.out.print("Masukkan jumlah cup : ");
        jumlahCup = input.nextInt();

        System.out.print("Masukkan uang bayar : ");
        uangBayar = input.nextInt();

        input.close();
    }
}