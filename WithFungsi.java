import java.util.Scanner;
import java.util.Date;

public class DasarWithFungsi {
    static int option;
    static Scanner sc = new Scanner(System.in);
    static int harga = 0;
    // Rio
    static void SignUp() {
        

    }

    // Rio
    static void LogIn() {

    }

    // ada yang mau?
    static void RegistHotel() {

    }

    // Rizqi
    static void HotelList() {

    }

    // Necha
    static void RoomType() {
        int jenisKamar[][] = {
            { 200000, 400000, 500000, 700000 },
            { 250000, 600000, 750000, 900000 }
    };

        System.out.println("Pilih jenis kasur: ");
        System.out.println("1. Single Bed");
        System.out.println("2. Double Bed");
        System.out.println("3. Queens Bed");
        System.out.println("4. Kings Bed");
        int bed = sc.nextInt();
        sc.nextLine();
        harga += jenisKamar[option-1][bed-1];
    }


    // ada yang mau?
    static void ExtraBed() {

       
    }
    // Rizqi
    static void Discount() {

    }

    static void Run() {

    }

    static void MainMenu() {

    }

    static void ClearScreen() {

    }

    public static void main(String[] args) {
        Run();
    }
}