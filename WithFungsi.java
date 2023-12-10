import java.util.Scanner;
import java.util.Date;
import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class WithFungsi {
    static int option, bed, menu, akun;
    static Scanner sc = new Scanner(System.in);
    static Date now = new Date();
    static LocalDateTime localDateTime = LocalDateTime.now();
    static int harga = 0;
    static int lama, haMa, baris = 2, counter = 0, user = -2, index = -1, uName = 2, passW = 2, bayar = 0, cash = 0,
            list = 0, passB = 1, namB = 1;
    static double haTot = 0, haDis, rek = 0;
    static float disc = 0.0f;
    static String daftar = "";
    static String nPass = "";
    static String namaLog, passLog, extra, anything;
    static String uNama[] = { "Rio", "Necha" };
    static String uPass[] = { "test", "bisa" };
    static String[] hotel = { "aria", "montana" };
    static int jenisKamar[][] = {
            { 100000, 300000, 400000, 600000 },
            { 150000, 400000, 550000, 800000 }
    };
    static String bNama[] = { "Rizqi" };
    static String bPass[] = { "coba" };
    static int coordinat[][] = {
            { 0, 0 },
            { 1, 0 }
    };

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
        menu = sc.nextInt();
        sc.nextLine();
        System.out.print("Daftarkan User Anda: ");
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

        if (menu == 1) {
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
            ClearScreen();
            System.out.println("\t\t** Berhasil Daftar Akun! Silahkah LOGIN **");
            LogIn();
        } else if (menu == 2) {
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
            ClearScreen();
            System.out.println("\t\t** Berhasil Daftar Akun! Silahkah LOGIN **");
            LogIn();

        } else {
            ClearScreen();
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

        if (menu == 1) {
            for (int i = 0; i < uNama.length; i++) {
                if (namaLog.equals(uNama[i])) {
                    user = i;
                }
            }

            System.out.print("Password : ");
            passLog = sc.nextLine();

            if (passLog.equals(uPass[user])) {
                index = user;
                System.out.println("\t\t** Anda Berhasil Login Akun Sebagai User **");
                MainMenuUser();
            }
            user = -2;
            LogIn();
            System.out.println("Username atau Password salah!");
        } else if (menu == 2) {
            for (int i = 0; i < bNama.length; i++) {
                if (namaLog.equals(bNama[i])) {
                    user = i;
                }
            }
            System.out.print("Password : ");
            passLog = sc.nextLine();

            if (passLog.equals(bPass[user])) {
                index = user;
                System.out.println("\t\t** Anda Berhasil Login Akun Sebagai Bisnis **");
                MainMenuBisnis();
            }
            user = -2;
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

        int[][] newKamar = new int[baris][4];
        for (int i = 0; i < jenisKamar.length; i++) {
            for (int j = 0; j < jenisKamar[i].length; j++) {
                newKamar[i][j] = jenisKamar[i][j];
            }
        }
        jenisKamar = newKamar;

        int[][] newCoordinat = new int[baris][2];
        for (int i = 0; i < coordinat.length; i++) {
            for (int j = 0; j < coordinat[i].length; j++) {
                newCoordinat[i][j] = coordinat[i][j];
            }
        }
        coordinat = newCoordinat;
        coordinat[baris-1][0] = baris-1;
        coordinat[baris-1][1] = index;

        System.out.println("masukan harga single Bed");
        jenisKamar[baris - 1][0] = sc.nextInt();
        System.out.println("masukan harga Double Bed");
        jenisKamar[baris - 1][1] = sc.nextInt();
        System.out.println("masukan harga Queens Bed");
        jenisKamar[baris - 1][2] = sc.nextInt();
        System.out.println("masukan harga Kings Bed");
        jenisKamar[baris - 1][3] = sc.nextInt();
        sc.nextLine();
        System.out.println("\t\t** Hotel Anda Berhasil Didaftarkan **");
        MainMenuBisnis();
    }

    static void MyHotel() {
        int length = 0;
        for (int i = 0; i < coordinat.length; i++) {
            if (coordinat[i][1] == index) {
                length++;
            }
        }
        String myHotel[] = new String[length];
        length = 0;
        for (int i = 0; i < myHotel.length; i++) {
            if (coordinat[i][1] == index) {
                myHotel[length] = hotel[coordinat[i][0]];
                length++;
            }
        }
        System.out.println("+" + "-".repeat(myHotel.length * 15 - 1) + "+");
        for (int i = 0; i < myHotel.length; i++) {
            System.out.printf("|%2d. %-10s", (i + 1), myHotel[i]);
        }
        System.out.println("\nInsert anything to go back\n");
        anything=sc.nextLine();
        MainMenuBisnis();
    }

    static void chooseHotel() {
        HeadLine();
        MyHotel();
        System.out.println("Hotel mana yang mau disetting");
        menu = sc.nextInt();
        SettingHotel();
    }

    static void SettingHotel() {
        System.out.println("Mau setting apa ?");
        System.out.println("1. nama hotel");
        System.out.println("2. Harga Kamar");
        System.out.println("3. Discount");
        menu = sc.nextInt();
        sc.nextLine();
        switch (menu) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            default:
                System.out.println("Pilihan anda salah");
                SettingHotel();
                break;
        }
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
        System.out.println("Halo " + namaLog + ", Mau Nginep Dimana?");
        option = sc.nextInt();
        sc.nextLine();
        if (option == hotel.length + 1) {
            MainMenuUser();
        }
        Harga();
    }

    // Necha
    static void RoomType() {
        System.out.println("+--------------------------------+");
        System.out.println("|          JENIS KAMAR           |");
        System.out.println("+--------------------------------+");
        System.out.println("| 1. Single Bed       |  " + jenisKamar[option - 1][0] + "  |");
        System.out.println("| 2. Double Bed       |  " + jenisKamar[option - 1][1] + "  |");
        System.out.println("| 3. Queens Bed       |  " + jenisKamar[option - 1][2] + "  |");
        System.out.println("| 4. Kings Bed        |  " + jenisKamar[option - 1][3] + "  |");
        System.out.println("+--------------------------------+");
        System.out.print("Pilih Jenis Kamar: ");
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
            System.out.print("Pilih Bank: ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
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
            System.out.println(
                    "=============================================================================================");
            System.out.println("Transfer Bank dengan No.Rek " + rek + " Telah Berhasil!");
            System.out.println(
                    "=============================================================================================");
            System.out.println("**Tagihan Anda Telah Lunas**");
            System.out.println("input anything to back");
            anything = sc.nextLine();
            MainMenuUser();
        } else {
            ClearScreen();
            System.out.println("Nominal Anda salah! Tagihan Belum Lunas");
            nominal();
        }
    }

    static void bnibca() {
        System.out.print("Masukkan No.Rek Anda (10 digit): ");
        rek = sc.nextLong();
        String rekString = Double.toString(rek);
        if (rekString.length() != 10) {
            System.out.println("Digit yang Anda Masukkan Salah!");
            bnibca();
        }
    }

    static void bri() {
        System.out.print("Masukkan No.Rek Anda (15 digit): ");
        rek = sc.nextLong();
        String rekString = Double.toString(rek);
        if (rekString.length() != 15) {
            System.out.println("Digit yang Anda Masukkan Salah!");
            bri();
        }
    }

    static void mandiri() {
        System.out.print("Masukkan No.Rek Anda (13 digit): ");
        rek = sc.nextLong();
        String rekString = Double.toString(rek);
        if (rekString.length() != 13) {
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
        CekHari();
        ExtraBed();
        Discount();
        loyalty();
        System.out.println("Berapa Lama Anda Akan Menginap?: ");
        lama = sc.nextInt();
        haMa = harga * lama;
        haDis = haMa * disc;
        haTot = haMa - haDis;
        sc.nextLine();
        System.out.println("*================================*");
        System.out.println("| Total Tagihan Anda = " + haTot + "\t |");
        System.out.println("*================================*");
        System.out.println("input anything to back");
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

    static void cetak() {
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
        int tanggal = localDateTime.getDayOfMonth();
        int bulan = localDateTime.getMonthValue();
        if (tanggal == bulan) {
            disc += tanggal / 100;
        } else if (tanggal == 17 && bulan == 8) {
            disc += 0.17;
        } else if (tanggal == 25 && bulan == 12) {
            disc += 20;
        } else if (tanggal > 27 && bulan == 12 || tanggal < 16 && bulan == 1) {
            disc += 10;
        }
    }

    static void CekHari() {
        DayOfWeek hari = localDateTime.getDayOfWeek();
        int weekend[] = { 100000, 200000 };
        String day[] = { "MONDAY", "THURSDAY", "WEDNESDAY", "TUESDAY", "FRIDAY", "SATURDAY", "SUNDAY" };
        for (int i = 0; i < bNama.length; i++) {
            if (hari.equals(day[i])) {
                if (i > 4) {
                    harga += weekend[option];
                }
                break;
            }
        }
    }

    static void Run() {
        ClearScreen();
        HeadLine();
        System.out.println("1. Sign up (jika belum memiliki akun)");
        System.out.println("2. Login (jika sudah memiliki akun)");
        System.out.println("3. Exit");
        System.out.print("Pilih Menu(1/2/3): ");
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
                Run();
            default:
                System.out.println("Pilihan Anda salah!");
                Run();
        }
    }

    static void Exit() {
        ClearScreen();
        System.out.println("====================");
        System.out.println("||   =             ||");
        System.out.println("||  ===            ||");
        System.out.println("|| ====            ||");
        System.out.println("||  ============== ||");
        System.out.println("||   ============= ||");
        System.out.println("||   ===       === ||");
        System.out.println("||   ===       === ||");
        System.out.println("||  ===       ==== ||");
        System.out.println("=====================");
        anything = sc.nextLine();
    }

    static void HeadLine() {
        System.out.println("+--------------------------------+");
        System.out.println("|            Traveloki           |");
        System.out.println("+--------------------------------+");
    }

    static void MainMenuUser() {
        HeadLine();
        System.out.println("+----------------------+");
        System.out.println("|       MENU USER      |");
        System.out.println("+----------------------+");
        System.out.println("| 1. Booking Hotel     |");
        System.out.println("| 2. Payment           |");
        System.out.println("| 3. Cetak Pembayaran  |");
        System.out.println("| 4. Ganti Akun        |");
        System.out.println("| 5. Exit              |");
        System.out.println("+----------------------+");
        System.out.print("Pilih Menu: ");
        menu = sc.nextInt();
        sc.nextLine();
        switch (menu) {
            case 1:
                ClearScreen();
                HotelList();
            case 2:
                ClearScreen();
                Payment();
            case 3:
                ClearScreen();
                cetak();
            case 4:
                ClearScreen();
                Run();
            case 5:
                Exit();
                MainMenuUser();
            default:
                ClearScreen();
                System.out.println("pilihan Salah!");
                MainMenuUser();
        }
    }

    static void MainMenuBisnis() {
        HeadLine();
        System.out.println("+----------------------+");
        System.out.println("|      MENU BISNIS     |");
        System.out.println("+----------------------+");
        System.out.println("| 1. Register Hotel    |");
        System.out.println("| 2. Your Hotel        |");
        System.out.println("| 3. Hotel Setting     |");
        System.out.println("| 4. Ganti Akun        |");
        System.out.println("| 5. Exit              |");
        System.out.println("+----------------------+");
        System.out.print("Pilih Menu: ");
        menu = sc.nextInt();
        sc.nextLine();
        switch (menu) {
            case 1:
                RegistHotel();
            case 2:
                MyHotel();
            case 3:
                chooseHotel();
            case 4:
                Run();
            case 5:
                Exit();
                MainMenuBisnis();
            default:
                System.out.println("pilihan anda salah");
                MainMenuBisnis();
        }
    }

    static void ClearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Exit();
        Run();
    }
}