package Praktikum3.PRAK301_2210817220024_AldiraPutriSholeha;
import java.util.LinkedList;
import java.util.Scanner;
public class Soal1Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah dadu: ");
        int jumlahDadu = input.nextInt();

        LinkedList<Dadu> daduList = new LinkedList<>();
        int totalNilaiDadu = 0;

        for (int i = 1; i <= jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            daduList.add(dadu);
        }

        for (int i = 0; i < daduList.size(); i++) {
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + daduList.get(i).getNilai());
            totalNilaiDadu += daduList.get(i).getNilai();
        }

        System.out.println("Total nilai dadu keseluruhan " + totalNilaiDadu);
    }
}
