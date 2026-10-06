import java.util.Scanner;

public class StudiKasus216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa;
        String jenisKegiatan;
        byte jumlahDokumen;
        byte peringkatJuara;
        byte status;

        System.out.print("nama mahasiswa: ");
        namaMahasiswa = sc.nextLine();

        System.out.print("Jenis kegiatan(BELMAWA/BAKORMA/Mandiri/PKM/LAINNYA): ");
        jenisKegiatan = sc.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Jumlah dokumen: ");
            jumlahDokumen = sc.nextByte();
            if (jumlahDokumen == 4) {
                System.out.print("Peringkat juara: ");
                peringkatJuara = sc.nextByte();
                if (peringkatJuara == 3 || peringkatJuara == 2|| peringkatJuara == 1) {
                    System.out.println("Status: dokumen lengkap, dana penghargaan diberikan");
                } else {
                    System.out.println("Status: bukan juara 1, 2, atau 3, " + "dana penghargaan tidak diberikan");
                }
            } else {
                System.out.println("Status: dokumen kurang " + (4 - jumlahDokumen) + ", dana penghargaan tidak diberikan");
            }
            status = 0;

        }
        sc.close();
    }
}
