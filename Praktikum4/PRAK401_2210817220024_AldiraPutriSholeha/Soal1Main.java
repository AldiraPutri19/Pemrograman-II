package Praktikum4.PRAK401_2210817220024_AldiraPutriSholeha;
import java.util.Scanner;

public class Soal1Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        HewanPeliharaan pet = new HewanPeliharaan("", "");
        pet.inputNama();
        String nama = read.nextLine();
        pet.inputRas();
        String ras = read.nextLine();

        pet = new HewanPeliharaan(nama, ras);
        pet.display();
        read.close();
    }
}
