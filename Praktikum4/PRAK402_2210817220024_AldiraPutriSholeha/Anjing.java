package Praktikum4.PRAK402_2210817220024_AldiraPutriSholeha;
import java.util.Arrays;
public class Anjing {
    String warnaBulu;
    String[] kemampuan;

    public Anjing(String n, String r, String w, String[] k) {
        super(n, r);
        warnaBulu = w;
        kemampuan = k;
    }

    public void display() {
        System.out.println("Nama hewan peliharaan: " + nama);
        System.out.println("Ras: " + ras);
        System.out.println("Warna Bulu: " + warnaBulu);
        System.out.println("Kemampuan: " + Arrays.toString(kemampuan));
    }

    public void displayDetailAnjing() {
        display();
}
