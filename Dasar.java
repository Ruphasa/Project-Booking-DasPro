import java.util.Scanner;

public class Dasar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hotel, lama, hargaAkhir;
        
    System.out.println("Mau nginep dimana (aria, savana, grandPalace)?");
    hotel = sc.nextInt();
    System.out.println("berapa Malam ?");
    lama = sc.nextInt();

    hargaAkhir = hotel * lama;

    System.out.println("Harganya " + hargaAkhir);

    }
}
