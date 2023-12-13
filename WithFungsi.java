import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;
import java.util.Random;

public class WithFungsi {
    static int option, bed, menu, akun;
    static Scanner sc = new Scanner(System.in);
    static Date now = new Date();
    static LocalDateTime localDateTime = LocalDateTime.now();
    static int weekend[] = { 100000, 200000 };
    static int tanggal = 0;
    static int bulan = 0;
    static int tahun = 0;
    static int harga = 0, nomorKamar = 0;
    static int lama, haMa, baris = 2, user = -2, index = -1, uName = 2, passW = 2, bayar = 0, cash = 0,
            list = 0, passB = 1, namB = 1;
    static double haTot = 0, haDis;
    static long rek = 0;
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
    static String myHotel[] = {};

    static int tanggalCheckIn = 0, bulanCheckIn = 0, tahunCheckIn = 0, tanggalCheckOut = 0, bulanCheckOut = 0,
            tahunCheckOut = 0;

    static int banyakPesanan = 0;
    static String pesanan[][] = new String[banyakPesanan][6];

    static String jenisKasur[] = {
            "Single Bed", "Double Bed", "Queens Bed", "KIngs Bed"
    };
    static int counter[] = { 0, 0 };
    static int banyakDisc = 5;
    static double discount[][] = {
            { 0, 17, 8, 0.17 },
            { 1, 17, 8, 0.17 },
            { 0, 12, 12, 0.12 },
            { 0, 11, 11, 0.11 },
            { 1, 25, 12, 0.20 }
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
        ClearScreen();
        System.out.print("Daftarkan User Anda: ");
        daftar = sc.nextLine();

        for (int i = 0; i < bNama.length; i++) {
            if (daftar.equals(bNama[i])) {
                ClearScreen();
                System.out.println("Username Telah Digunakan");
                SignUp();
            }
        }
        for (int i = 0; i < uName; i++) {
            if (daftar.equals(uNama[i])) {
                ClearScreen();
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

            int newCounter[] = new int[uName];
            for (int i = 0; i < counter.length; i++) {
                newCounter[i]=counter[i];
            }
            counter=newCounter;
            counter[uName-1]=0;
            ClearScreen();
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

        for (int i = 0; i < uNama.length; i++) {
            if (namaLog.equals(uNama[i])) {
                user = i;
                System.out.print("Password : ");
                passLog = sc.nextLine();
                if (passLog.equals(uPass[user])) {
                    index = user;
                    ClearScreen();
                    System.out.println("\t\t** Anda Berhasil Login Akun Sebagai User **");
                    MainMenuUser();
                }
                user = -2;
                ClearScreen();
                System.out.println("Username atau Password salah!");
                LogIn();
            }
        }

        for (int i = 0; i < bNama.length; i++) {
            if (namaLog.equals(bNama[i])) {
                user = i;
                System.out.print("Password : ");
                passLog = sc.nextLine();
                if (passLog.equals(bPass[user])) {
                    index = user;
                    ClearScreen();
                    System.out.println("\t\t** Anda Berhasil Login Akun Sebagai Bisnis **");
                    MainMenuBisnis();
                }
                user = -2;
                ClearScreen();
                System.out.println("Username atau Password salah!");
                LogIn();
            }
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
        coordinat[baris - 1][0] = baris - 1;
        coordinat[baris - 1][1] = index;

        System.out.println("masukan harga single Bed");
        jenisKamar[baris - 1][0] = sc.nextInt();
        System.out.println("masukan harga Double Bed");
        jenisKamar[baris - 1][1] = sc.nextInt();
        System.out.println("masukan harga Queens Bed");
        jenisKamar[baris - 1][2] = sc.nextInt();
        System.out.println("masukan harga Kings Bed");
        jenisKamar[baris - 1][3] = sc.nextInt();
        sc.nextLine();
        ClearScreen();
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
        if (length == 0) {
            System.out.println("Kamu tidak memiliki hotel yang terdaftar!");
            System.out.println("Insert anything to go back");
            anything = sc.nextLine();
            MainMenuBisnis();
        }
        String newMyHotel[] = new String[length];
        length = 0;
        for (int i = 0; i < hotel.length; i++) {
            if (coordinat[i][1] == index) {
                newMyHotel[length] = hotel[coordinat[i][0]];
                length++;
            }
        }
        myHotel = newMyHotel;
        System.out.println("+" + "-".repeat(myHotel.length * 15 - 1) + "+");
        for (int i = 0; i < myHotel.length; i++) {
            System.out.printf("|%2d. %-10s", (i + 1), myHotel[i]);
        }
        System.out.print("|");
        if (menu == 2) {
            System.out.println("\nInsert anything to go back");
            anything = sc.nextLine();
            ClearScreen();
            MainMenuBisnis();
        }
    }

    static void chooseHotel() {
        HeadLine();
        MyHotel();
        System.out.println("\nHotel mana yang mau disetting");
        menu = sc.nextInt();
        for (int i = 0; i < hotel.length; i++) {
            if (myHotel[menu - 1] == hotel[i]) {
                option = i;
            }
        }
        SettingHotel();
    }

    static void SettingHarga() {
        System.out.println("+--------------------------------+");
        System.out.println("|          JENIS KAMAR           |");
        System.out.println("+--------------------------------+");
        System.out.println("| 1. Single Bed       |  " + jenisKamar[option][0] + "  |");
        System.out.println("| 2. Double Bed       |  " + jenisKamar[option][1] + "  |");
        System.out.println("| 3. Queens Bed       |  " + jenisKamar[option][2] + "  |");
        System.out.println("| 4. Kings Bed        |  " + jenisKamar[option][3] + "  |");
        System.out.println("| 5. Harga weekend    |  " + "+" + weekend[option] + " |");
        System.out.println("+--------------------------------+");
        System.out.println("| 6. Back                        |");
        System.out.println("+--------------------------------+");
        System.out.print("Pilih Harga yang mana : ");
        menu = sc.nextInt();
        if (menu < 5 && menu > 0) {
            System.out.print("Masukkan Harga Baru : ");
            jenisKamar[option][menu - 1] = sc.nextInt();
        } else if (menu == 5) {
            System.out.println("Masukkan Harga Baru : ");
            weekend[option] = sc.nextInt();
        } else {
            ClearScreen();
            System.out.println("pilahan anda salah!");
            SettingHarga();
        }
    }

    static void SettingDiscount() {
        System.out.print("Mau setting untuk tanngal berapa : ");
        tanggal = sc.nextInt();
        System.out.print("Bulan berapa : ");
        bulan = sc.nextInt();
        for (int i = 0; i < bNama.length; i++) {
            if (discount[i][0] == option) {
                if (discount[i][1] == tanggal) {
                    if (discount[i][2] == bulan) {
                        System.out.print("Mau diganti jadi berapa ? ");
                        discount[i][3] = sc.nextDouble() / 100;
                        sc.nextLine();
                        System.out.printf("Pada tanggal %s bulan %s discountnya menjadi %.0f%%", tanggal, bulan,
                                discount[i][3] * 100);
                        System.out.println("\nInsert anything to go back");
                        anything = sc.nextLine();
                        MainMenuBisnis();
                    }
                }
            }
        }
        banyakDisc++;
        double newDiscount[][] = new double[banyakDisc][4];
        for (int i = 0; i < discount.length; i++) {
            for (int j = 0; j < discount[i].length; j++) {
                newDiscount[i][j] = discount[i][j];
            }
        }
        discount = newDiscount;
        System.out.println("Discount berapa persen : ");
        discount[banyakDisc - 1][3] = sc.nextDouble() / 100;
        discount[banyakDisc - 1][2] = bulan;
        discount[banyakDisc - 1][1] = tanggal;
        discount[banyakDisc - 1][0] = option;
    }

    static void SettingHotel() {
        System.out.println("Mau setting apa ?");
        System.out.println("1. Harga Kamar");
        System.out.println("2. Discount");
        menu = sc.nextInt();
        sc.nextLine();
        switch (menu) {
            case 1:
                ClearScreen();
                SettingHarga();
                break;
            case 2:
                ClearScreen();
                SettingDiscount();
                break;
            default:
                ClearScreen();
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
            ClearScreen();
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
        System.out.println("| 5. Back                        |");
        System.out.println("+--------------------------------+");
        System.out.print("Pilih Jenis Kamar: ");
        int bed = sc.nextInt();
        sc.nextLine();
        if (bed == 5) {
            ClearScreen();
            MainMenuUser();
        } else if (bed > 5 && bed < 1) {
            ClearScreen();
            System.out.println("pilihan anda salah");
            RoomType();
        }
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
                    ClearScreen();
                    System.out.println("Pilihan Anda salah");
                    Payment();
            }
            nominal();
        } else {
            banyakPesanan++;
            String newPesanan[][] = new String[banyakPesanan][6];
            for (int i = 0; i < pesanan.length; i++) {
                for (int j = 0; j < pesanan[i].length; j++) {
                    newPesanan[i][j] = pesanan[i][j];
                }
            }
            pesanan = newPesanan;
            pesanan[banyakPesanan - 1][0] = namaLog;
            pesanan[banyakPesanan - 1][1] = hotel[option];
            pesanan[banyakPesanan - 1][2] = jenisKasur[bed];
            pesanan[banyakPesanan - 1][3] = Integer.toString((bed + 1) + nomorKamar);
            pesanan[banyakPesanan - 1][4] = Integer.toString(tanggalCheckIn) + "/" + Integer.toString(bulanCheckIn)
                    + "/" + Integer.toString(tahunCheckIn);
            pesanan[banyakPesanan - 1][5] = Integer.toString(tanggalCheckOut) + "/" + Integer.toString(bulanCheckOut)
                    + "/" + Integer.toString(tahunCheckOut);
            System.out.println("Tagihan anda telah lunas :)");
            anything = sc.nextLine();
            ClearScreen();
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
            ClearScreen();
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
        String rekString = Long.toString(rek);
        if (rekString.length() != 10) {
            System.out.println("Digit yang Anda Masukkan Salah!");
            bnibca();
        }
    }

    static void bri() {
        System.out.print("Masukkan No.Rek Anda (15 digit): ");
        rek = sc.nextLong();
        String rekString = Long.toString(rek);
        if (rekString.length() != 15) {
            System.out.println("Digit yang Anda Masukkan Salah!");
            bri();
        }
    }

    static void mandiri() {
        System.out.print("Masukkan No.Rek Anda (13 digit): ");
        rek = sc.nextLong();
        String rekString = Long.toString(rek);
        if (rekString.length() != 13) {
            System.out.println("Digit yang Anda Masukkan Salah!");
            mandiri();
        }
    }

    // Necha
    static void loyalty() {
        counter[index]++;
        if (counter[index] == 3) {
            disc += 0.1;
            System.out.println("Selamat Anda Mendapatkan Discount Loyalty Sebesar 10%");
        } else if (counter[index] == 5) {
            disc += 0.15;
            System.out.println("Selamat Anda Mendapatkan Discount Loyalty Sebesar 15%");
        } else {
            disc += 0;
        }
    }

    static void Harga() {
        harga = 0;
        RoomType();
        CekHari();
        ExtraBed();
        Discount();
        loyalty();
        System.out.print("tanggal check-in : ");
        tanggalCheckIn = sc.nextInt();
        System.out.print("bulan berapa itu : ");
        bulanCheckIn = sc.nextInt();
        System.out.print("tahun berapa itu : ");
        tahunCheckIn = sc.nextInt();
        System.out.print("tanggal check-out : ");
        tanggalCheckOut = sc.nextInt();
        System.out.print("bulan berapa itu : ");
        bulanCheckOut = sc.nextInt();
        if (bulanCheckOut > bulanCheckIn + 1) {
            ClearScreen();
            System.out.print("terlalu lama!");
            Harga();
        }
        System.out.print("Tahun berapa itu : ");
        tahunCheckOut = sc.nextInt();
        if (tahunCheckOut > tahunCheckIn + 1) {
            ClearScreen();
            System.out.print("terlalu lama!");
            Harga();
        }
        if (tanggalCheckIn > tanggalCheckOut) {
            if (bulanCheckIn == 2) {
                if (tahunCheckIn % 4 == 0) {
                    if (tahunCheckIn % 100 != 0) {
                        lama = (29 - tanggalCheckIn) + tanggalCheckOut;
                    } else {
                        lama = (28 - tanggalCheckIn) + tanggalCheckOut;
                    }
                } else {
                    lama = (28 - tanggalCheckIn) + tanggalCheckOut;
                }
            } else if (bulanCheckIn == 4 || bulanCheckIn == 6 || bulanCheckIn == 9 || bulanCheckIn == 11) {
                lama = (30 - tanggalCheckIn) + tanggalCheckOut;
            } else {
                lama = (31 - tanggalCheckIn) + tanggalCheckOut;
            }
        } else {
            lama = tanggalCheckOut - tanggalCheckIn;
        }
        haMa = harga * lama;
        haDis = haMa * disc;
        haTot = haMa - haDis;
        sc.nextLine();
        System.out.println("*================================*");
        System.out.println("| Total Tagihan Anda = " + haTot + "\t |");
        System.out.println("*================================*");
        System.out.println("input anything to go back");
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
            Random random = new Random();
            nomorKamar = random.nextInt(20);
            System.out.println(
                    "\n===============================================================================================");
            System.out.println("\t\t\t\t Cetak Pembayaran Hotel");
            System.out.println(
                    "===============================================================================================");
            System.out.println("Nama Pemesan\t : " + namaLog);
            System.out.println("Hotel\t\t : " + hotel[option]);
            System.out.println("Jenis Kamar\t : " + jenisKasur[bed]);
            System.out.println("Nomor Kamar : " + (bed + 1) + nomorKamar);
            System.out.println("Waktu Pemesanan\t : " + now);
            System.out.printf("\nCheck-In : %d/%d/%d\n" + tanggalCheckIn + bulanCheckIn + tahunCheckIn);
            System.out.printf("\nCheck-Out : %d/%d/%d\n" + tanggalCheckOut + bulanCheckOut + tahunCheckOut);
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
        for (int i = 0; i < discount.length; i++) {
            if (discount[i][0] == option) {
                if (discount[i][1] == tanggal) {
                    if (discount[i][2] == bulan) {
                        harga += weekend[option];
                        disc += discount[i][3];
                        break;
                    }
                }
            }
        }
    }

    static void CekHari() {
        DayOfWeek hari = localDateTime.getDayOfWeek();
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
        tanggal = localDateTime.getDayOfMonth();
        bulan = localDateTime.getMonthValue();
        tahun = localDateTime.getYear();
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
                ClearScreen();
                Exit();
                MainMenuUser();
            default:
                ClearScreen();
                System.out.println("pilihan Salah!");
                MainMenuUser();
        }
    }

    static void ListPesanan() {
        System.out.println("+---------------------------------------------+");
        for (int i = 0; i < pesanan.length; i++) {
            for (int j = 0; j < pesanan[i].length; j++) {
                System.out.printf("|%-10s", pesanan[i][j]);
            }
            System.out.print(" |\n");
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
        System.out.println("| 4. Lihat Pesanan     |");
        System.out.println("| 5. Ganti Akun        |");
        System.out.println("| 6. Exit              |");
        System.out.println("+----------------------+");
        System.out.print("Pilih Menu: ");
        menu = sc.nextInt();
        sc.nextLine();
        switch (menu) {
            case 1:
                ClearScreen();
                RegistHotel();
            case 2:
                ClearScreen();
                MyHotel();
            case 3:
                ClearScreen();
                chooseHotel();
            case 4:
                ClearScreen();
                ListPesanan();
            case 5:
                ClearScreen();
                Run();
            case 6:
                ClearScreen();
                Exit();
                MainMenuBisnis();
            default:
                ClearScreen();
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