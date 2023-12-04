import java.util.Scanner;
import java.util.Date;

public class WithFungsi {

    static int option, bed;
    static Scanner sc = new Scanner(System.in);
    static int harga = 0;
    static boolean login = false, signUp = false;
    static int lama, haMa, hari, bulan, tahun, counter = 0, user = -2, word = -1, uName = 3, passW = 3,
            duplicate = 0;
    static double haTot = 0, haDis;
    static float disc = 0.0f;
    static String daftar = "";
    static String nPass = "";
    static String pesanLagi, cetakData, backMenu, namaLog, passLog;
    static String nama[] = { "Rio", "Rizqi", "Necha" };
    static String pass[] = { "test", "coba", "bisa" };
    static String[] hotel = { "aria", "montana" };
    static String namaHotel = "";
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
        } else {
            LogIn();
            System.out.println("Username atau Password salah!");
        }
    }

    // ada yang mau?
    static void RegistHotel() {

    }

    // Rizqi
    static void HotelList() {
        System.out.println(" ----------------");
        System.out.println("|    Traveloki   |");
        System.out.println(" ----------------");
        if (counter == 3) {
            disc += 0.03f;
            System.out.println("Selamat anda mendapatkan discount loyalty sebesar 3%");
        }
        if (hotel.length < 5) {
            System.out.println("+" + "-".repeat(hotel.length * 15 - 1) + "+");
        } else {
            System.out.println("+" + "-".repeat(5 * 15 - 1) + "+");
        }
        System.out.print("|");
        for (int i = 0; i < hotel.length; i++) {
            counter++;
            if (counter % 6 == 0) {
                System.out.println();
                System.out.printf("|%2d. %-10s|", (i + 1), hotel[i]);
            } else
                System.out.printf("%2d. %-10s|", (i + 1), hotel[i]);
        }
        System.out.printf("\n|%2d. %-10s|\n", (hotel.length + 1), "Back");
        System.out.println(namaLog + " Mau nginep dimana?");
        option = sc.nextInt();
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
        harga += jenisKamar[option - 1][bed - 1];
    }

    // Necha
    static void loyalty() {

    }

    static void Harga(int price) {
        RoomType();
        ExtraBed();
        Discount();
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
        sc.nextLine();
        ClearScreen();
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

    static void Exit() {

    }

    static void HeadLine() {
        System.out.println("+----------------+");
        System.out.println("|    Traveloki   |");
        System.out.println("+----------------+");
    }

    static void MainMenu() {
        HeadLine();
        System.out.println("1. Daftar hotel");
        System.out.println("2. Booking hotel");
        System.out.println("3. Ganti akun");
        System.out.print("(1/2/3) : ");
        option = sc.nextInt();
        sc.nextLine();
        switch (option) {
            case 1:
                ClearScreen();
                RegistHotel();
            case 2:
                ClearScreen();
                HotelList();
            case 3:
                ClearScreen();
                Run();
            default:
                ClearScreen();
                System.out.println("pilihan Salah!");
                MainMenu();
        }
    }

    static void ClearScreen() {
        System.out.print("\033[H\033[2J");
    }

    public static void main(String[] args) {
        Run();
    }
}