package Praktikum4.PRAK402_2210817220024_AldiraPutriSholeha;
import java.util.Arrays;
public class Kucing {
    String warnaBulu;

    public Kucing(String n, String r, String w) {
        super(n, r);
        warnaBulu = w;
    }

    public void display() {
        System.out.println("Nama hewan peliharaan: " + nama);
        System.out.println("Ras: " + ras);
        System.out.println("Warna Bulu: " + warnaBulu);
    }

    public void displayDetailKucing() {
        display();
    }
}
