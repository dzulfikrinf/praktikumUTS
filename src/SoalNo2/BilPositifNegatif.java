package SoalNo2;
import java.util.Scanner;

public class BilPositifNegatif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int nilai, jmlPositif = 0, jmlNegatif = 0;
        float rerata, total = 0;
        int jumlahBilangan = 0;

        System.out.println("Masukan bilangan integer, program akan berhenti "
                + "jika memasukan nilai 0:");

        while ((nilai = input.nextInt()) != 0) {
            if (nilai > 0) {
                jmlPositif++;
            } else if (nilai < 0) {
                jmlNegatif++;
            }

            total += nilai;
            jumlahBilangan++;
        }
        
        if (jumlahBilangan > 0) {
            rerata = (float) total / jumlahBilangan;

            System.out.println("Jumlah bilangan positif adalah " + jmlPositif);
            System.out.println("Jumlah bilangan negatif adalah " + jmlNegatif);
            System.out.println("Nilai total adalah " + total);
            System.out.printf("Nilai rata-rata %.2f\n", rerata);
        } else {
            System.out.println("Tidak ada nilai yang diinput");
        }
    }    
}
