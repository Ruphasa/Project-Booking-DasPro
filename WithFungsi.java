import java.util.Scanner;
import java.util.Date;

public class WithFungsi {

    static int option, bed;
    static Scanner sc = new Scanner(System.in);
    static int harga = 0;
    static boolean login = false, signUp = false;
    static int lama, haMa, hari, bulan, tahun, baris = 2, counter = 0, user = -2, word = -1, uName = 3, passW = 3,
            duplicate = 0, bayar = 0, cash = 0, rek = 0;
    static double haTot = 0, haDis;
    static float disc = 0.0f;
    static String daftar = "";
    static String nPass = "", bank = "";
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
        System.out.print("Masukan Nama Hotel: ");
        String newHotel = sc.nextLine();

        String[] newArray = new String[baris + 1];
        baris++;
        for (int i = 0; i < hotel.length; i++) {
            newArray[i] = hotel[i];
        }
        hotel = newArray;
        hotel[baris - 1] = newHotel;

        int[][] newKamar = new int[baris + 1][4];
        baris++;
        for (int i = 0; i < jenisKamar.length; i++) {
            for (int j = 0; j < jenisKamar[i].length; j++) {
                newKamar[i][j] = jenisKamar[i][j];
            }
        }
        jenisKamar = newKamar;

        System.out.println("masukan harga Single Bed");
        jenisKamar[baris - 1][0] = sc.nextInt();
        System.out.println("masukan harga Double Bed");
        jenisKamar[baris - 1][1] = sc.nextInt();
        System.out.println("masukan harga Queens Bed");
        jenisKamar[baris - 1][2] = sc.nextInt();
        System.out.println("masukan harga Kings Bed");
        jenisKamar[baris - 1][3] = sc.nextInt();

        MainMenu();
    }

    // Rizqi
    static void HotelList() {
        System.out.println(" ----------------");
        System.out.println("|    Traveloki   |");
        System.out.println(" ----------------");

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
        loyalty();
    }

    // Necha
    static void RoomType() {
        int jenisKamar[][] = {
                { 100000, 300000, 400000, 600000 },
                { 150000, 400000, 550000, 800000 }
        };

        System.out.println("Pilih jenis kasur: ");
        System.out.println("1. Single Bed " + jenisKamar[option - 1][0]);
        System.out.println("2. Double Bed " + jenisKamar[option - 1][1]);
        System.out.println("3. Queens Bed " + jenisKamar[option - 1][2]);
        System.out.println("4. Kings Bed " + jenisKamar[option - 1][3]);
        int bed = sc.nextInt();
        sc.nextLine();
        harga += jenisKamar[option - 1][bed - 1];
    }

    static void bayar() {
        System.out.println(
                "=============================**Silahkan Pilih Bank**=============================");
        System.out.println("1. BNI");
        System.out.println("2. BRI");
        System.out.println("3. BCA");
        System.out.println("4. MANDIRI");
        System.out.println("(1/2/3/4): ");
        bayar = sc.nextInt();
        switch (bayar) {

            case 1:
                bnibca();
                break;

            case 2:
                bri();
                break;

            case 3:
                bnibca();
                break;

            case 4:
                mandiri();
                break;

            default:
                System.out.println("Pilihan Anda salah");
                bayar();
        }
            nominal();
    }

    static void nominal() {
        System.out.print("Masukkan Nominal Anda (Sesuai Tagihan!): Rp. ");
        cash = sc.nextInt();
    }

    static void cekLunas() {
        if (cash == haTot) {
            System.out.println("Transfer Bank dengan No.Rek " + rek
                    + " Telah Berhasil!");
            System.out.println("**Tagihan Anda Telah Lunas**");
        } else {
           System.out.println("Nominal Anda salah! Tagihan Belum Lunas");
           nominal();
        }
    }

    static void bnibca() {
        System.out.print("Masukkan No.Rek Anda (10 digit): ");
        rek = sc.nextInt();
        if (rek < 10) {
            System.out.println("Digit yang Anda masukkan salah!");
            bnibca();
        }
    }

    static void bri() {
        System.out.print("Masukkan No.Rek Anda (15 digit): ");
        rek = sc.nextInt();
        if (rek < 10) {
            System.out.println("Digit yang Anda masukkan salah!");
            bri();
        }
    }

    static void mandiri() {
        System.out.print("Masukkan No.Rek Anda (13 digit): ");
        rek = sc.nextInt();
        if (rek < 10) {
            System.out.println("Digit yang Anda masukkan salah!");
            mandiri();
        }
    }

    // Necha
    static void loyalty() {
        counter++;
        if (counter == 3) {
            disc += 0.1;
            System.out.println("Selamat anda mendapatkan discount loyalty sebesar 10%");
        } else if (counter == 5) {
            disc += 0.15;
            System.out.println("Selamat anda mendapatkan discount loyalty sebesar 15%");
        }
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
        System.out.println("3. Bayar");
        System.out.println("4. Ganti akun");
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