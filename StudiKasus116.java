import java.util.Scanner;
public class StudiKasus116 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int hargaPerCup = 18000;
        int jumlahCup;
        int uangBayar;
        int totalHarga;
        int diskon;
        int totalBayar;
        int kembalian;
        int kurang;
        
        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = scanner.nextInt();
        System.out.print("Masukkan uang yang dibayar: ");
        uangBayar = scanner.nextInt();
        totalHarga = hargaPerCup * jumlahCup;
        diskon = 0;
        if (totalHarga >= 100000) {
            diskon = (int) (totalHarga * 0.1);
        }
        totalBayar = totalHarga - diskon;
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Total harga: " + totalHarga);
            System.out.println("Diskon: " + diskon);
            System.out.println("Total bayar: " + totalBayar);
            System.out.println("Kembalian: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Total harga: " + totalHarga);
            System.out.println("Diskon: " + diskon);
            System.out.println("Total bayar: " + totalBayar);
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }
        scanner.close();
    }
}