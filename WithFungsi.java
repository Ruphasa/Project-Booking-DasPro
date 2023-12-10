import java.util.Scanner;
import java.util.Date;

public class WithFungsi {
    static int option, bed, menu, akun;
    static Scanner sc = new Scanner(System.in);
    static Date now = new Date();
    static int harga = 0;
    static boolean login = false, signUp = false;
    static int lama, haMa, hari, bulan, tahun, baris = 2, counter = 0, user = -2, word = -1, uName = 3, passW = 3,
            duplicate = 0, payment = 0, cash = 0, list = 0, passB = 0, namB = 0;
    static double haTot = 0, haDis, rek = 0;
    static float disc = 0.0f;
    static String daftar = "";
    static String nPass = "", bank = "";
    static String pesanLagi, cetakData, backMenu, namaLog, passLog, extra, anything;
    static String uNama[] = { "Rio", "Rizqi", "Necha" };
    static String uPass[] = { "test", "coba", "bisa" };
    static String[] hotel = { "Aria", "Montana" };
    static String namaHotel = "";
    static int jenisKamar[][] = {
            { 100000, 300000, 400000, 600000 },
            { 150000, 400000, 550000, 800000 }
    };
    static String bNama[] = {};
    static String bPass[] = {};
    static String jenisKasur[] = {
            "Single Bed", "Double Bed", "Queens Bed", "KIngs Bed"
    };

    // Rio
    static void SignUp() {
        System.out.println(
                "\n================================== APLIKASI BOOKING HOTEL ===================================");
        System.out.println("+------------------------+");
        System.out.println("|         SIGN UP        |");
        System.out.println("+------------------------+");
        System.out.println("| Daftarkan Akun sebagai:|");
        System.out.println("| 1. User                |");
        System.out.println("| 2. Bisnis              |");
        System.out.println("+------------------------+");
        System.out.print("Pilih Akun(1/2): ");
        akun = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukkan Username: ");
        daftar = sc.nextLine();

        for (int i = 0; i < bNama.length; i++) {
            if (daftar.equals(bNama[i])) {
                System.out.println("Username Telah Digunakan");
                SignUp();
            }
        }
        for (int i = 0; i < uName; i++) {
            if (daftar.equals(uNama[i])) {
                System.out.println("Username Telah Digunakan");
                SignUp();
            }
        }

        System.out.print("Masukkan Password: ");
        nPass = sc.nextLine();

        if (akun == 1) {
            String[] newNama = new String[uName + 1];
            uName++;
            for (int i = 0; i < uNama.length; i++) {
                newNama[i] = uNama[i];
            }
            uNama = newNama;
            String[] newPass = new String[passW + 1];
            passW++;
            for (int i = 0; i < uPass.length; i++) {
                newPass[i] = uPass[i];
            }
            uPass = newPass;
            uNama[uName - 1] = daftar;
            uPass[passW - 1] = nPass;
            System.out.println("\t\t** Berhasil Daftar Akun! Silahkah LOGIN **");
            LogIn();

        } else if (akun == 2) {
            String[] newNama = new String[namB + 1];
            namB++;
            for (int i = 0; i < bNama.length; i++) {
                newNama[i] = bNama[i];
            }
            bNama = newNama;
            String[] newPass = new String[passB + 1];
            passB++;
            for (int i = 0; i < bPass.length; i++) {
                newPass[i] = bPass[i];
            }
            bPass = newPass;
            bNama[namB - 1] = daftar;
            bPass[passB - 1] = nPass;
            System.out.println("\t\t** Berhasil Daftar Akun! Silahkah LOGIN **");
            LogIn();

        } else {
            System.out.println("Pilihan Anda Salah!");
            SignUp();
        }
    }

    // Rio
    static void LogIn() {
        System.out.println(
                "\n=============================================================================================");
        System.out.println("\t\t\t\t\t LOGIN");
        System.out.println("\t\t\t Silahkan Masukkan Username dan Password Anda");
        System.out.println(
                "=============================================================================================");

        System.out.print("Username : ");
        namaLog = sc.nextLine();

        if (akun == 1) {
            for (int i = 0; i < uNama.length; i++) {
                if (namaLog.equals(uNama[i])) {
                    user = i;
                }
            }

            System.out.print("Password : ");
            passLog = sc.nextLine();

            for (int i = 0; i < uPass.length; i++) {
                if (passLog.equals(uPass[i])) {
                    word = i;
                    System.out.println("\t\t** Anda Berhasil Login Akun Sebagai User **");
                    MainMenuUser();
                }
            }

            if (user == word) {
                user = -2;
                word = -1;
                System.out.println("\t\t** Anda Berhasil Login Akun Sebagai User **");
                MainMenuUser();

            } else {
                LogIn();
                System.out.println("Username atau Password salah!");
            }

        } else if (akun == 2) {
            for (int i = 0; i < bNama.length; i++) {
                if (namaLog.equals(bNama[i])) {
                    user = i;
                }
            }
            System.out.print("Password : ");
            passLog = sc.nextLine();

            for (int i = 0; i < bPass.length; i++) {
                if (passLog.equals(bPass[i])) {
                    word = i;
                    System.out.println("\t\t** Anda Berhasil Login Akun Sebagai Bisnis **");
                    MainMenuBisnis();
                }
            }
            if (user == word) {
                user = -2;
                word = -1;
                System.out.println("\t\t** Anda Berhasil Login Akun Sebagai Bisnis **");
                MainMenuBisnis();

            } else {
                LogIn();
                System.out.println("Username atau Password salah!");
            }
        }
    }

    static void MainMenuUser() {
        System.out.println("+----------------------+");
        System.out.println("|       MENU USER      |");
        System.out.println("+----------------------+");
        System.out.println("| 1. Hotel List        |");
        System.out.println("| 2. Booking Hotel     |");
        System.out.println("| 3. Payment           |");
        System.out.println("| 4. Cetak Pembayaran  |");
        System.out.println("| 5. Ganti Akun        |");
        System.out.println("| 6. Back To Main Menu |");
        System.out.println("| 7. Exit              |");
        System.out.println("+----------------------+");
        System.out.println("Pilih Menu: ");
        menu = sc.nextInt();
        sc.nextLine();
        switch (menu) {
            case 1:
                ClearScreen();
                HotelList();
            case 2:
                ClearScreen();
                Booking();
            case 3:
                ClearScreen();
                Payment();
            case 4:
                ClearScreen();
                Print();
            case 5:
                ClearScreen();
                GantiAkun();
            case 6:
                ClearScreen();
                Run();
            case 7:
                Exit(0);
            default:
                ClearScreen();
                System.out.println("Pilihan Anda Salah!");
                MainMenuUser();
        }
    }

    static void MainMenuBisnis() {
        System.out.println("+----------------------+");
        System.out.println("|      MENU BISNIS     |");
        System.out.println("+----------------------+");
        System.out.println("| 1. Register Hotel    |");
        System.out.println("| 2. Hotel List        |");
        System.out.println("| 3. Ganti Akun        |");
        System.out.println("| 4. Back To Main Menu |");
        System.out.println("| 5. Exit              |");
        System.out.println("+----------------------+");
        System.out.println("Pilih Menu: ");
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
                ClearScreen();
                GantiAkun();
            case 4:
                ClearScreen();
                Run();
            case 5:
                Exit(0);
            default:
                ClearScreen();
                System.out.println("Pilihan Anda Salah!");
                MainMenuBisnis();
        }
    }

    static void GantiAkun() {
        System.out.println("+------------------------+");
        System.out.println("|       GANTI AKUN       |");
        System.out.println("+------------------------+");
        System.out.println("| Ganti Akun sebagai :   |");
        System.out.println("| 1. User                |");
        System.out.println("| 2. Bisnis              |");
        System.out.println("+------------------------+");
        menu = sc.nextInt();
        System.out.print("Pilih Menu(1/2): ");
        if (menu == 1) {
            System.out.println("\t\t** Berhasil Mengganti Akun User **");
            MainMenuUser();
        } else if (menu == 2) {
            System.out.println("\t\t** Berhasil Mengganti Akun Bisnis **");
            MainMenuBisnis();
        }
    }

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
                System.out.printf("|%2d. %-10s|", (i + 1), jenisKasur[i]);
                System.out.println();
                System.out.printf("|%2d. %-10s|", (i + 1), jenisKamar[i]);
                System.out.println();
            } else
                System.out.printf("%2d. %-10s|", (i + 1), hotel[i]);
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

        System.out.print("Masukkan harga Single Bed: ");
        jenisKamar[baris - 1][0] = sc.nextInt();
        System.out.print("Masukkan harga Double Bed: ");
        jenisKamar[baris - 1][1] = sc.nextInt();
        System.out.print("Masukkan harga Queens Bed: ");
        jenisKamar[baris - 1][2] = sc.nextInt();
        System.out.print("Masukkan harga Kings Bed: ");
        jenisKamar[baris - 1][3] = sc.nextInt();
        System.out.println("\t\t** Hotel Anda Berhasil Didaftarkan **");
        MainMenuBisnis();
    }

    // Rizqi
    static void Booking() {
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
        System.out.println("Halo " + namaLog + " ,Mau Nginep Dimana?");
        option = sc.nextInt();
        sc.nextLine();
        if (option == hotel.length + 1) {
            MainMenuUser();
        }
        Harga();
    }

    // Necha
    static void RoomType() {
        int jenisKamar[][] = {
                { 100000, 300000, 400000, 600000 },
                { 150000, 400000, 550000, 800000 }
        };

        System.out.println("Pilih Jenis Kamar: ");
        System.out.println("1. Single Bed " + jenisKamar[option - 1][0]);
        System.out.println("2. Double Bed " + jenisKamar[option - 1][1]);
        System.out.println("3. Queens Bed " + jenisKamar[option - 1][2]);
        System.out.println("4. Kings Bed " + jenisKamar[option - 1][3]);
        int bed = sc.nextInt();
        sc.nextLine();
        harga += jenisKamar[option - 1][bed - 1];
    }

    static void Payment() {
        if (cash != haTot) {
            System.out.println(
                    "=============================**Silahkan Pilih Bank**=============================");
            System.out.println("+----------------------+");
            System.out.println("|         BANK         |");
            System.out.println("+----------------------+");
            System.out.println("| 1. BNI               |");
            System.out.println("| 2. BRI               |");
            System.out.println("| 3. BCA               |");
            System.out.println("| 4. MANDIRI           |");
            System.out.println("+----------------------+");
            System.out.println("Pilih Bank: ");
            payment = sc.nextInt();
            sc.nextLine();
            switch (payment) {

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
                    Payment();
            }
            nominal();
        } else {
            System.out.println("Tagihan anda telah lunas :)");
            anything = sc.nextLine();
            MainMenuUser();
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
            System.out.println("(input anything to back)");
            anything = sc.nextLine();
            MainMenuUser();
        } else {
            System.out.println("Nominal Anda salah! Tagihan Belum Lunas");
            nominal();
        }
    }

    static void bnibca() {
        System.out.print("Masukkan No.Rek Anda (10 digit): ");
        rek = sc.nextInt();
        if (rek < 10) {
            System.out.println("Digit yang Anda Masukkan Salah!");
            bnibca();
        }
    }

    static void bri() {
        System.out.print("Masukkan No.Rek Anda (15 digit): ");
        rek = sc.nextInt();
        if (rek < 15) {
            System.out.println("Digit yang Anda Masukkan Salah!");
            bri();
        }
    }

    static void mandiri() {
        System.out.print("Masukkan No.Rek Anda (13 digit): ");
        rek = sc.nextInt();
        if (rek < 13) {
            System.out.println("Digit yang Anda Masukkan Salah!");
            mandiri();
        }
    }

    // Necha
    static void loyalty() {
        counter++;
        if (counter == 3) {
            disc += 0.1;
            System.out.println("Selamat Anda Mendapatkan Discount Loyalty Sebesar 10%");
        } else if (counter == 5) {
            disc += 0.15;
            System.out.println("Selamat Anda Mendapatkan Discount Loyalty Sebesar 15%");
        } else {
            disc += 0;
        }
    }

    static void Harga() {
        RoomType();
        ExtraBed();
        Discount();
        loyalty();
        System.out.println("Berapa Lama Anda Akan Menginap?: ");
        lama = sc.nextInt();
        haMa = harga * lama;
        haDis = haMa * disc;
        haTot = haMa - haDis;
        sc.nextLine();
        System.out.println("*=================================*");
        System.out.println("| Total Tagihan Anda = " + haTot + "\t|");
        System.out.println("*=================================*");
        System.out.println("(input anything to back)");
        anything = sc.nextLine();
        MainMenuUser();
    }

    // ada yang mau?
    static void ExtraBed() {
        System.out.println("Apakah Anda Ingin Menambah Extra Bed?(Y/T): ");
        extra = sc.next();
        if (extra.equalsIgnoreCase("y")) {
            harga += jenisKamar[option - 1][0];
        } else if (extra.equalsIgnoreCase("t")) {
            harga += 0;
        } else {
            System.out.println("Pilihan Anda Salah!");
            ExtraBed();
        }
    }

    static void Print() {
        if (haTot != cash) {
            System.out.println("Tagihan Anda Belum Lunas, Silahkan Melakukan Pembayaran");
            Payment();
        } else {
            System.out.println(
                    "\n===============================================================================================");
            System.out.println("\t\t\t\t Cetak Pembayaran Hotel");
            System.out.println(
                    "===============================================================================================");
            System.out.println("Nama Pemesan\t : " + namaLog);
            System.out.println("Hotel\t\t : " + hotel[option]);
            System.out.println("Jenis Kamar\t : " + jenisKasur[bed]);
            System.out.println("Waktu Pemesanan\t : " + now);
            System.out.println("Lama Menginap\t : " + lama + " hari");
            System.out.println("Diskon\t\t : " + disc);
            System.out.println("Total Tagihan\t : " + "Rp " + haTot);
            System.out.println(
                    "===============================================================================================");
            System.out.println("input anything to back");
            anything = sc.nextLine();
            MainMenuUser();
        }
    }

    // Rizqi
    static void Discount() {

    }

    static void Run() {
        ClearScreen();
        HeadLine();
        System.out.println("1. Sign up (jika belum memiliki akun)");
        System.out.println("2. Login (jika sudah memiliki akun)");
        System.out.println("3. Exit");
        menu = sc.nextInt();
        sc.nextLine();
        ClearScreen();
        switch (menu) {
            case 1:
                SignUp();
            case 2:
                LogIn();
            case 3:
                Exit(0);
            default:
                System.out.println("Pilihan Anda salah!");
                Run();
        }
    }

    static void Exit(int exitCode) {
        System.out.println("\t\t\t\t *** Your Now Exit ***");
        System.out.println("\t\t\t\t    ** Thank You **");
        System.exit(exitCode);
    }

    static void HeadLine() {
        System.out.println("+--------------------------------+");
        System.out.println("|            Traveloki           |");
        System.out.println("+--------------------------------+");
    }

    // static void MainMenu() {
    // HeadLine();
    // System.out.println("1. Daftar hotel");
    // System.out.println("2. Booking hotel");
    // System.out.println("3. Bayar");
    // System.out.println("4. Cetak Riwayat Pembayaran");
    // System.out.println("5. Ganti akun");
    // System.out.print("(1/2/3/4/5) : ");
    // menu = sc.nextInt();
    // sc.nextLine();
    // switch (menu) {
    // case 1:
    // ClearScreen();
    // RegistHotel();
    // case 2:
    // ClearScreen();
    // HotelList();
    // case 3:
    // ClearScreen();
    // Payment();
    // case 4:
    // ClearScreen();
    // Print();
    // case 5:
    // ClearScreen();
    // Run();
    // default:
    // ClearScreen();
    // System.out.println("Pilihan Anda Salah!");
    // MainMenu();
    // }
    // }

    static void ClearScreen() {
        System.out.print("\033[H\033[2J");
    }

    public static void main(String[] args) {
        Run();
    }
}