public class Giro extends Rekening {
    private double limitPenarikan;

    public Giro(String namaPemilik, String nomorRekening, double saldoAwal, double limitPenarikan) {
        super(namaPemilik, nomorRekening, saldoAwal);
        this.limitPenarikan = limitPenarikan;
    }

    @Override
    public void tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo + limitPenarikan) {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil. Saldo saat ini: " + saldo);
        } else {
            System.out.println("Penarikan gagal. Melebihi batas limit giro.");
        }
    }
}
