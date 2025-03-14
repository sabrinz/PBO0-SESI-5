public class Tabungan extends Rekening {
    private double bungaTahunan;

    public Tabungan(String namaPemilik, String nomorRekening, double saldoAwal, double bungaTahunan) {
        super(namaPemilik, nomorRekening, saldoAwal);
        this.bungaTahunan = bungaTahunan;
    }

    public double hitungBunga(int bulan) {
        return (bungaTahunan / 12) * saldo * bulan / 100;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bunga Tahunan  : " + bungaTahunan + "%");
    }
}
