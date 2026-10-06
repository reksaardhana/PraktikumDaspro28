import java.util.Scanner;

public class StudiKasus228 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, jenisKegiatan;

        System.out.print("Nama mahasiswa : ");
        nama = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = input.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")) {
            int jumlahDokumen, peringkat;

            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = input.nextInt();

            System.out.print("Peringkat juara : ");
            peringkat = input.nextInt();

            if (jumlahDokumen < 4) {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            } else if (peringkat == 1 || peringkat == 2 || peringkat == 3) {
                System.out.println("Status : Berhak memperoleh dana penghargaan.");
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan karena bukan Juara 1, 2, atau 3.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("BAKORMA")) {
            int jumlahDokumen, peringkat;

            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = input.nextInt();

            System.out.print("Peringkat juara : ");
            peringkat = input.nextInt();

            if (jumlahDokumen < 4) {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            } else if (peringkat == 1 || peringkat == 2 || peringkat == 3) {
                System.out.println("Status : Berhak memperoleh dana penghargaan.");
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan karena bukan Juara 1, 2, atau 3.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            int jumlahDokumen, peringkat;

            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = input.nextInt();

            System.out.print("Peringkat juara : ");
            peringkat = input.nextInt();

            if (jumlahDokumen < 4) {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            } else if (peringkat == 1 || peringkat == 2 || peringkat == 3) {
                System.out.println("Status : Berhak memperoleh dana penghargaan.");
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan karena bukan Juara 1, 2, atau 3.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            int jumlahDokumen, statusPendanaan;

            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = input.nextInt();

            System.out.print("Status pendanaan PKM : ");
            statusPendanaan = input.nextInt();

            if (jumlahDokumen < 4) {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            } else if (statusPendanaan == 1) {
                System.out.println("Status : Berhak memperoleh dana penghargaan.");
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan karena tidak lolos pendanaan PKM.");
            }
        }
    }
}