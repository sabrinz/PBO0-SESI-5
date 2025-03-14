import java.util.ArrayList;

public class Rekening {
    protected String namaPemilik;
    protected String nomorRekening;
    protected double saldo;

    public Rekening(String namaPemilik, String nomorRekening, double saldoAwal) {
        this.namaPemilik = namaPemilik;
        this.nomorRekening = nomorRekening;
        this.saldo = saldoAwal;
    }

    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setoran berhasil. Saldo saat ini: " + saldo);
        } else {
            System.out.println("Jumlah setoran harus lebih dari 0.");
        }
    }

    public void setor(double jumlah, boolean transfer) {
        if (transfer) {
            if (jumlah > 2500) {
                saldo += jumlah - 2500;
                System.out.println("Transfer berhasil. Saldo saat ini: " + saldo);
            } else {
                System.out.println("Jumlah transfer tidak mencukupi untuk biaya administrasi.");
            }
        } else {
            setor(jumlah);
        }
    }

    public void tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil. Saldo saat ini: " + saldo);
        } else {
            System.out.println("Penarikan gagal. Saldo tidak mencukupi.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Saldo: " + saldo);
    }
}
