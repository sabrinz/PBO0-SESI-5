public class Deposito extends Rekening {
    privat int jangkaWaktuBulan;
    private double sukuBunga;

    public Deposito(String namaPemilik, String nomorRekening, double saldoAwal, double sukuBunga, int jangkaWaktuBulan) {
        super(namaPemilik, nomorRekening, saldoAwal);
        this.sukuBunga = sukuBunga;
        this.jangkaWaktuBulan = jangkaWaktuBulan;
    }

    public double hitungBunga() {
        return (sukuBunga / 12) * saldo * jangkaWaktuBulan / 100;
    }

    @Override
    public void tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            double denda = saldo * 0.1;
            saldo -= (jumlah + denda);
            System.out.println("Penarikan sebelum jatuh tempo dikenakan denda 10%. Saldo saat ini: " + saldo);
        } else {
            System.out.println("Penarikan gagal. Saldo tidak mencukupi.");
        }
    }
}
