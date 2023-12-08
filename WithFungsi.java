import java.util.Scanner;
import java.util.Date;

public class WithFungsi {

    static int option, bed, menu;
    static Scanner sc = new Scanner(System.in);
    static Date now = new Date();
    static int harga = 0;
    static boolean login = false, signUp = false;
    static int lama, haMa, hari, bulan, tahun, baris = 2, counter = 0, user = -2, word = -1, uName = 3, passW = 3,
            duplicate = 0, bayar = 0, cash = 0, list = 0;
    static double haTot = 0, haDis, rek = 0;
    static float disc = 0.0f;
    static String daftar = "";
    static String nPass = "", bank = "";
    static String pesanLagi, cetakData, backMenu, namaLog, passLog, extra, anything;
    static String nama[] = { "Rio", "Rizqi", "Necha" };
    static String pass[] = { "test", "coba", "bisa" };
    static String[] hotel = { "aria", "montana" };
    static String namaHotel = "";
    static int jenisKamar[][] = {
            { 100000, 300000, 400000, 600000 },
            { 150000, 400000, 550000, 800000 }
    };
    static String jenisKasur[] = {
            "Single Bed", "Double Bed", "Queens Bed", "KIngs Bed"
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
        System.out.print("Masukan Password: ");
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

    // Rio
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

        System.out.println("masukan harga single Bed");
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
        HeadLine();
        if (hotel.length < 5) {
            System.out.println("+" + "-".repeat(hotel.length * 15 - 1) + "+");
        } else {
            System.out.println("+" + "-".repeat(5 * 15 - 1) + "+");
        }
        System.out.print("|");
        for (int i = 0; i < hotel.length; i++) {
            list++;
            if (list % 6 == 0) {
                System.out.println();
                System.out.printf("|%2d. %-10s|", (i + 1), hotel[i]);
                System.out.println();
            } else
                System.out.printf("%2d. %-10s|", (i + 1), hotel[i]);
        }
        System.out.printf("\n|%2d. %-10s|\n", (hotel.length + 1), "Back");
        System.out.println(namaLog + " Mau nginep dimana?");
        option = sc.nextInt();
        sc.nextLine();
        if (option == hotel.length + 1) {
            MainMenu();
        }
        Harga();
    }

    // Necha
    static void RoomType() {
        int jenisKamar[][] = {
                { 100000, 300000, 400000, 600000 },
                { 150000, 400000, 550000, 800000 }
        };

        System.out.println("Pilih jenis kamar: ");
        System.out.println("1. Single Bed " + jenisKamar[option - 1][0]);
        System.out.println("2. Double Bed " + jenisKamar[option - 1][1]);
        System.out.println("3. Queens Bed " + jenisKamar[option - 1][2]);
        System.out.println("4. Kings Bed " + jenisKamar[option - 1][3]);
        int bed = sc.nextInt();
        sc.nextLine();
        harga += jenisKamar[option - 1][bed - 1];
    }

    static void bayar() {
        if (cash != haTot) {
            System.out.println(
                    "=============================**Silahkan Pilih Bank**=============================");
            System.out.println("1. BNI");
            System.out.println("2. BRI");
            System.out.println("3. BCA");
            System.out.println("4. MANDIRI");
            System.out.println("(1/2/3/4): ");
            bayar = sc.nextInt();
            sc.nextLine();
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
        } else {
            System.out.println("Tagihan anda telah lunas :)");
            anything = sc.nextLine();
            MainMenu();
        }
    }

    static void nominal() {
        System.out.print("Masukkan Nominal Anda (Sesuai Tagihan!): Rp. ");
        cash = sc.nextInt();
        sc.nextLine();
        cekLunas();
    }

    static void cekLunas() {
        if (cash == haTot) {
            System.out.println("Transfer Bank dengan No.Rek " + rek + " Telah Berhasil!");
            System.out.println("**Tagihan Anda Telah Lunas**");
            System.out.println("input anything to back");
            anything = sc.nextLine();
            MainMenu();
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
        if (rek < 15) {
            System.out.println("Digit yang Anda masukkan salah!");
            bri();
        } 
}

    static void mandiri() {
        System.out.print("Masukkan No.Rek Anda (13 digit): ");
        rek = sc.nextInt();
        if (rek < 13) {
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
        } else {
            disc += 0;
        }
    }

    static void Harga() {
        RoomType();
        ExtraBed();
        Discount();
        loyalty();
        System.out.println("berapa lama kamu akan menginap : ");
        lama = sc.nextInt();
        haMa = harga * lama;
        haDis = haMa * disc;
        haTot = haMa - haDis;
        sc.nextLine();
        System.out.println("*=================================*");
        System.out.println("| Total Tagihan Anda = " + haTot + " |");
        System.out.println("*=================================*");
        System.out.println("input anything to back");
        anything = sc.nextLine();
        MainMenu();
    }

    // ada yang mau?
    static void ExtraBed() {
        System.out.println("Apakah Anda ingin menambah extra bed?(Y/T): ");
        extra = sc.next();
        if (extra.equalsIgnoreCase("y")) {
            harga += jenisKamar[option - 1][0];
        } else if (extra.equalsIgnoreCase("t")) {
            harga += 0;
        } else {
            System.out.println("Pilihan Anda salah");
            ExtraBed();
        }
    }

    static void cetak() {
        if (haTot != cash) {
            System.out.println("Tagihan Anda belum lunas, Silahkan melakukan pembayaran");
            bayar();
        } else {
            System.out.println(
                    "\n===============================================================================================");
            System.out.println("\t\t\t\t Cetak Riwayat Pembayaran Hotel");
            System.out.println(
                    "===============================================================================================");
            System.out.println("Nama Pemesan\t : " + namaLog);
            System.out.println("Hotel\t\t : " + hotel[option]);
            System.out.println("Jenis Kamar\t : " + jenisKasur[bed]);
            System.out.println("Waktu Pemesanan\t : " + now);
            System.out.println("Lama Menginap\t : " + lama + " hari");
            System.out.println("Diskon\t\t : " + disc);
            System.out.println("Total Tagihan\t : " + "Rp " + haTot);
            anything = sc.nextLine();
            MainMenu();
        }
    }

    // Rizqi
    static void Discount() {
        Date now = new Date();
        if (login) {

        }
    }

    static void Run() {
        ClearScreen();
        HeadLine();
        System.out.println("1. Signn up jika belum memiliki akun");
        System.out.println("2. Login jika sudah memiliki akun");
        System.out.println("3. keluar applikasi");
        menu = sc.nextInt();
        sc.nextLine();
        ClearScreen();
        switch (menu) {
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
        System.out.println("4. Cetak Riwayat Pembayaran");
        System.out.println("5. Ganti akun");
        System.out.print("(1/2/3/4/5) : ");
        menu = sc.nextInt();
        sc.nextLine();
        switch (menu) {
            case 1:
                ClearScreen();
                RegistHotel();
            case 2:
                ClearScreen();
                HotelList();
            case 3:
                bayar();
            case 4:
                cetak();
            case 5:
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