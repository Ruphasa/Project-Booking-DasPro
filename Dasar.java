import java.util.Scanner;

public class Dasar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String hotel;
        int harga, lama, hargaAkhir;
        
    System.out.println("Mau nginep dimana ?");
    hotel = sc.nextLine();
    System.out.println("harganya berapa ?");
    harga = sc.nextInt();
    System.out.println("berapa Malam ?");
    lama = sc.nextInt();

    hargaAkhir = harga * lama;

    System.out.println("Harganya " + hotel + " selama " + lama + " malam adalah " + hargaAkhir);

    }
}
