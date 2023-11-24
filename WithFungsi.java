import java.util.Scanner;
import java.util.Date;

public class WithFungsi {
    static int option;
    static Scanner sc = new Scanner(System.in);

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

    static void MainMenu() {

    }

    static void Exit() {

    }

    static void ClearScreen() {
        System.out.print("\033[H\033[2J");
    }

    public static void main(String[] args) {
        Run();
    }
}
