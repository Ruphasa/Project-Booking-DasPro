import java.util.Scanner;
import java.util.Date;

public class WithFungsi {
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
            { 100000, 300000, 400000, 600000 },
            { 150000, 400000, 550000, 800000 }
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
        System.out.print("\033[H\033[2J");
        System.out.println(" ----------------");
        System.out.println("|    Traveloki   |");
        System.out.println(" ----------------");
        System.out.println("1. Signn up jika belum memiliki akun");
        System.out.println("2. Login jika sudah memiliki akun");
        System.out.println("3. keluar applikasi");
        option = sc.nextInt();
        System.out.print("\033[H\033[2J");
        switch (option) {
            case 1:
                SignUp();
            case 2:
                LogIn();
            case 3:
                Exit();
            default:
                System.out.println("pilah anda salah!");
                Run();
        }
    }
    static void Exit(){
        
    }
    static void MainMenu() {

    }

    static void ClearScreen() {
        System.out.print("\033[H\033[2J");
    }

    public static void main(String[] args) {
        Run();
    }
}