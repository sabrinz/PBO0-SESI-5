import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan berbagai rekening
        ArrayList<Rekening> daftarRekening = new ArrayList<>();

        // Menambahkan rekening ke dalam ArrayList
        daftarRekening.add(new Tabungan("20230040147", "20230040147", 500000, 5.0));
        daftarRekening.add(new Giro("20230040147", "20230040147", 700000, 100000));
        daftarRekening.add(new Deposito("20230040147", "20230040147", 1000000, 3.5, 12));

        // Menampilkan semua rekening
        System.out.println("=== Daftar Rekening ===");
        for (Rekening r : daftarRekening) {
            r.tampilkanInfo();
            System.out.println("----------------------");
        }

        // Mencari rekening dengan saldo tertinggi dan terendah
        Rekening saldoTertinggi = daftarRekening.get(0);
        Rekening saldoTerendah = daftarRekening.get(0);

        for (Rekening r : daftarRekening) {
            if (r.getSaldo() > saldoTertinggi.getSaldo()) {
                saldoTertinggi = r;
            }
            if (r.getSaldo() < saldoTerendah.getSaldo()) {
                saldoTerendah = r;
            }
        }

        // Menampilkan rekening dengan saldo tertinggi dan terendah
        System.out.println("
Rekening dengan Saldo Tertinggi:");
        saldoTertinggi.tampilkanInfo();

        System.out.println("
Rekening dengan Saldo Terendah:");
        saldoTerendah.tampilkanInfo();
    }
}
