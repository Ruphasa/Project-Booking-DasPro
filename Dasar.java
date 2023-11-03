import java.util.Scanner;

public class Dasar {
    public static void main(String[] args) {
        //Declareration
        Scanner scanner = new Scanner(System.in);
        boolean login = false;
        int option, lama, haMa, hari, bulan, tahun, counter = 0, user = -2, word = -1, bed;
        double haTot = 0, haDis;
        float disc = 0.0f;
        String pesanLagi, cetakData, backMenu, namaLog, passLog;
        String nama[] = { "Rio", "Rizqi", "Necha" };
        String pass[] = { "test", "coba", "bisa" };
        String hotel = "";
        int jenisKamar[][] = {
                { 100000, 300000, 400000, 600000 },
                { 150000, 400000, 550000, 800000 }
        };
        System.out.println(
                "\n================================== APLIKASI BOOKING HOTEL ===================================");
        //Login
        do {
            System.out.println(
                    "\n=============================================================================================");
            System.out.println("\t\t\t\t\t LOGIN");
            System.out.println("\t\t\t Silahkan masukkan username dan password Anda");
            System.out.println(
                    "=============================================================================================");

            System.out.print("Username : ");
            namaLog = scanner.nextLine();

            for (int i = 0; i < nama.length; i++) {
                if (namaLog.equals(nama[i])) {
                    user = i;
                }
            }
            System.out.print("Password : ");
            passLog = scanner.nextLine();

            for (int i = 0; i < pass.length; i++) {
                if (passLog.equals(pass[i])) {
                    word = i;
                }
            }
            if (user == word) {
                login = true;
            }
        } while (login != true);
        //Asking what hotel did you want to book
        do {
            System.out.println(
                    "\n=============================================================================================");
            System.out.println("\t\t\t\t\t MENU");
            System.out.println("\t\t\t\t     Daftar Hotel");
            System.out.println(
                    "=============================================================================================");
            if (counter == 3) {
                disc += 0.03f;
                System.out.println("\t\t *Selamat Anda mendapatkan discount loyalty sebesar 3%*");
            }
            System.out.println("Halo " + namaLog + ", Selamat Datang!");
            System.out.println("1 Aria");
            System.out.println("2 Montana");
            System.out.println("3 Exit");
            System.out.println("Silahkan pilih hotel, Mau nginep dimana? ");
            option = scanner.nextInt();
            if (option==3) {
                continue;
            }
            //Asking Room
            System.out.println("mau jenis kamar yang mana? ");
            System.out.println("1. Single Bed");
            System.out.println("2. Double Bed");
            System.out.println("3. Queens Bed");
            System.out.println("4. Kings Bed");
            bed = scanner.nextInt();
            //Asking Date
            System.out.println("Masukkan Tanggal Pemesanan: ");
            hari = scanner.nextInt();
            System.out.println("Masukkan Bulan: ");
            bulan = scanner.nextInt();
            System.out.println("Masukkan Tahun: ");
            tahun = scanner.nextInt();
            System.out.println("Masukkan Lama Menginap: ");
            lama = scanner.nextInt();
            //Case
            switch (option) {
                case 1:
                    if (hari == 17 && bulan == 8) {
                        disc += 0.1f;
                    }
                    hotel = "Aria";
                    break;

                case 2:

                    if (hari == 25 && bulan == 12) {
                        disc += 0.12f;
                    }
                    hotel = "Montana";
                case 3:
                    System.out.println("\t\t\t\t ***Your Now Exit***");
                    System.out.println("\t\t\t\t    **Thank You**");
                    break;
                default:
                    System.out.println("\t\t Menu yang anda masukkan salah!");
                    break;
            }
            //operation
            haMa = jenisKamar[option - 1][bed - 1] * lama;
            haDis = haMa * disc;
            haTot = haMa - haDis;
            counter++;
            System.out.println("Total Tagihan = " + haTot);
            //Asking for data
            System.out.println(
                    "===============================================================================================");
            System.out.print("\t\t   Apakah anda ingin mencetak data pemesanan? (Y/T) : ");
            cetakData = scanner.next();
            //Printing data
            if (cetakData.equalsIgnoreCase("y")) {
                System.out.println(
                        "\n===============================================================================================");
                System.out.println("\t\t\t\t Data Pemesanan Hotel");
                System.out.println(
                        "===============================================================================================");
                System.out.println("Nama Pemesan\t: " + namaLog);
                System.out.println("Hotel\t\t: " + hotel);
                System.out.println("Jenis Kamar\t: " + bed);
                System.out.println("Waktu Pemesanan\t: " + hari + "/" + bulan + "/" + tahun);
                System.out.println("Lama Menginap\t: " + lama);
                System.out.println("Diskon\t\t: " + disc);
                System.out.println("Total Tagihan\t: " + haTot);

            } else {
                System.out.println("\t\t\t Data Tidak Dicetak, Terimakasih");
            }
            //Asking booking again in the same hotel
            System.out.println(
                    "===============================================================================================");
            System.out.print("\t\t   Apakah anda ingin memesan lagi? (Y/T) : ");
            pesanLagi = scanner.next();
            if (pesanLagi.equalsIgnoreCase("y")) {
                option = option;
                continue;
            } else if(pesanLagi.equalsIgnoreCase("t")){
                System.out.println("\t\t Terimakasih Telah Memesan " + "kamar" + hotel + " di Aplikasi Kami");
            }
            //Asking back to menu
            System.out.println(
                    "===============================================================================================");
            System.out.print("\t\t\t   Kembali ke menu (ketik 'Y') : ");
            backMenu = scanner.next();
            if (backMenu.equalsIgnoreCase("y")) {
                continue;
            } else
                option = 3;
            System.out.println("\t\t\t\t    Silahkan Exit");
            break;
        } while (option != 3);
    }
}