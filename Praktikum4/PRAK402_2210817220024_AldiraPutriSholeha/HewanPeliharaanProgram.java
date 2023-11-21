package Praktikum4.PRAK402_2210817220024_AldiraPutriSholeha;
import java.util.Arrays;
import java.util.Scanner;

public class HewanPeliharaanProgram {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();
        String nama;
        String ras;
        String warnaBulu;
        if (pilihan == 1) {
            System.out.print("Nama hewan peliharaan: ");
            nama = scanner.nextLine();
            System.out.print("Ras: ");
            ras = scanner.nextLine();
            System.out.print("Warna Bulu: ");
            warnaBulu = scanner.nextLine();
            Kucing kucing = new Kucing(nama, ras, warnaBulu);
            kucing.displayDetailKucing();
        } else if (pilihan == 2) {
            System.out.print("Nama hewan peliharaan: ");
            nama = scanner.nextLine();
            System.out.print("Ras: ");
            ras = scanner.nextLine();
            System.out.print("Warna Bulu: ");
            warnaBulu = scanner.nextLine();
            System.out.print("Kemampuan: ");
            String[] kemampuan = scanner.nextLine().split(" ");
            Anjing anjing = new Anjing(nama, ras, warnaBulu, kemampuan);
            anjing.displayDetailAnjing();
        }

    }
}

