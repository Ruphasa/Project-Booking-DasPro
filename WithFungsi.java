import java.util.Scanner;
import java.util.Date;

public class WithFungsi {
    static int option;
    static Scanner sc = new Scanner(System.in);
    static boolean login = false, signUp = false;
    static int lama, haMa, hari, bulan, tahun, counter = 0, user = -2, word = -1, bed, uName = 3, passW = 3,
            duplicate = 0;
    static double haTot = 0, haDis;
    static float disc = 0.0f;
    static String daftar = "";
    static String nPass = "";
    static String pesanLagi, cetakData, backMenu, namaLog, passLog;
    static String nama[] = { "Rio", "Rizqi", "Necha" };
    static String pass[] = { "test", "coba", "bisa" };
    static String hotel = "";
    static int jenisKamar[][] = {
            { 100000, 300000, 400000, 600000 },
            { 150000, 400000, 550000, 800000 }
    };
    // Rio
    static void SignUp() {  
        System.out.println(
                "\n================================== APLIKASI BOOKING HOTEL ===================================");
        
            System.out.print("Daftarkan User Anda: ");
            daftar = sc.nextLine();
            for (int i = 0; i < uName; i++) {
                if (daftar.equals(nama[i])) {
                    duplicate = i;
                    System.out.println("Username Telah Digunakan");
                    SignUp();
                }
            }
            System.out.println("Masukan Password: ");
            nPass = sc.nextLine();
        
        String[] newNama = new String[uName + 1];
        uName++;
        for (int i = 0; i < nama.length; i++) {
            newNama[i] = nama[i];
        }
        nama = newNama;
        String[] newPass = new String[passW + 1];
        passW++;
        for (int i = 0; i < pass.length; i++) {
            newPass[i] = pass[i];
        }
        pass = newPass;
        nama[uName - 1] = daftar;
        pass[passW - 1] = nPass;
        LogIn();
    }

    // Rio
    static void LogIn() {
        System.out.println(
                    "\n=============================================================================================");
            System.out.println("\t\t\t\t\t LOGIN");
            System.out.println("\t\t\t Silahkan masukkan username dan password Anda");
            System.out.println(
                    "=============================================================================================");

            System.out.print("Username : ");
            namaLog = sc.nextLine();

            for (int i = 0; i < nama.length; i++) {
                if (namaLog.equals(nama[i])) {
                    user = i;
                }
            }
            System.out.print("Password : ");
            passLog = sc.nextLine();

            for (int i = 0; i < pass.length; i++) {
                if (passLog.equals(pass[i])) {
                    word = i;
                }
            }
            if (user == word) {
                MainMenu();
            } else{
                LogIn();
                System.out.println("Username atau Password salah!");
            }
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