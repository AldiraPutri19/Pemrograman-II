package Praktikum1;
import java.util.Scanner;
public class PRAK102_2210817220024_AldiraPutriSholeha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("");

        int angkaAwal = input.nextInt();
        int jumlahDeret = 10;
        int i = 0;
        while (i <= jumlahDeret) {
            int angka = (angkaAwal % 5 == 0) ? angkaAwal / 5 - 1 : angkaAwal;
            System.out.print(angka);
            if (i <= jumlahDeret - 1) {
                System.out.print(",");
            }
            angkaAwal++;
            i++;
        }
    }
}
