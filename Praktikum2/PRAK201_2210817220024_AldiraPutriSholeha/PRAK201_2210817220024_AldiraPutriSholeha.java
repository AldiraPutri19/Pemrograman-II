public class Main {
    public static void main(String[] args) {
        Buah apel = new Buah("Apel", 0.4, 7000.0);
        Buah mangga = new Buah("Mangga", 0.2, 3500.0);
        Buah alpukat = new Buah("Alpukat", 0.25, 10000.0);

        apel.tampilkanInfoBuah();
        mangga.tampilkanInfoBuah();
        alpukat.tampilkanInfoBuah();
    }
}

class Buah {
    private String namaBuah;
    private double beratBuah;
    private double hargaKg;

    public Buah(String namaBuah, double beratBuah, double hargaKg) {
        this.namaBuah = namaBuah;
        this.beratBuah = beratBuah;
        this.hargaKg = hargaKg;
    }

    public void tampilkanInfoBuah() {
        System.out.println("Nama Buah: " + namaBuah);
        System.out.println("Berat: " + beratBuah + " kg");
        double jumlahBeliKg = beratBuah * 10; // Karena harga per kg, maka dikali 10
        System.out.println("Jumlah Beli: " + jumlahBeliKg + " kg");

        double hargaSebelumDiskon = jumlahBeliKg * hargaKg;
        System.out.printf("Harga Sebelum Diskon: Rp%,.2f%n", hargaSebelumDiskon);

        double totalDiskon = (int)(jumlahBeliKg / 4) * (hargaKg * 4 * 0.02);
        System.out.printf("Total Diskon: Rp%,.2f%n", totalDiskon);

        double hargaSetelahDiskon = hargaSebelumDiskon - totalDiskon;
        System.out.printf("Harga Setelah Diskon: Rp%,.2f%n", hargaSetelahDiskon);

        System.out.println();
    }
}


