import java.util.Scanner;

public class Dasar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean login = false;
        int harga=0, option, lama, haMa, hari, bulan, tahun, counter = 0, user = -2, word = -1;
        double haTot=0, haDis;
        float disc = 0.0f;
        String pesanLagi, cetakData, backMenu, namaLog, passLog;
        String nama[] = { "Rio", "Rizqi", "Necha" };
        String pass[] = { "test", "coba", "bisa" };
        String hotel="";

        System.out.println(
                "\n================================== APLIKASI BOOKING HOTEL ===================================");

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
            System.out.println("Masukkan Tanggal Pemesanan: ");
            hari = scanner.nextInt();
            System.out.println("Masukkan Bulan: ");
            bulan = scanner.nextInt();
            System.out.println("Masukkan Tahun: ");
            tahun = scanner.nextInt();
            System.out.println("Masukkan Lama Menginap: ");
            lama = scanner.nextInt();
            switch (option) {
                case 1:

                    if (hari == 17 && bulan == 8) {
                        disc += 0.1f;
                    }
                    hotel="Aria";
                    harga = 1000000;                    
                    break;
                                        
                case 2:
                                        
                if (hari == 25 && bulan == 12) {
                disc += 0.12f;
                }
                hotel="Montana";                     
                harga = 2000000;         
                case 3:
                System.out.println("\t\t\t\t ***Your Now Exit***");
                System.out.println("\t\t\t\t    **Thank You**");
                break;                        
                default:
                System.out.println("\t\t Menu yang anda masukkan salah!");
                break;
                }
                haMa = harga * lama;
                haDis = haMa * disc;
                haTot = haMa - haDis;
                counter++;
                System.out.println("Total Tagihan = " + haTot);
                System.out.println(
                "===============================================================================================");
                System.out.print("\t\t   Apakah anda ingin mencetak data pemesanan? (Y/T) : ");
                cetakData = scanner.next();
                    if (cetakData.equalsIgnoreCase("y")) {
                    System.out.println(
                    "\n===============================================================================================");
                    System.out.println("\t\t\t\t Data Pemesanan Hotel");
                    System.out.println(
                    "===============================================================================================");
                    System.out.println("Nama Pemesan\t: " + namaLog);                        
                    System.out.println("Hotel\t\t: " + hotel);
                    System.out.println("Waktu Pemesanan\t: " + hari + "/" + bulan + "/" + tahun);
                    System.out.println("Lama Menginap\t: " + lama);
                    System.out.println("Diskon\t\t: " + disc);
                    System.out.println("Total Tagihan\t: " + haTot);
                                                    
                    } else {
                        System.out.println("\t\t\t Data Tidak Dicetak, Terimakasih");
                    }
                    System.out.println(
                    "===============================================================================================");
                    System.out.print("\t\t   Apakah anda ingin memesan lagi? (Y/T) : ");
                    pesanLagi = scanner.next();
                    if (pesanLagi.equalsIgnoreCase("y")) {
                        option=option;
                        continue;
                    } else {
                        System.out.println("\t\t Terimakasih Telah Memesan "+"kamar"+hotel+" di Aplikasi Kami");
                    } 
                    System.out.println(
                    "===============================================================================================");
                    System.out.print("\t\t\t   Kembali ke menu (ketik 'Y') : ");
                    backMenu = scanner.next();
                    if (backMenu.equalsIgnoreCase("y")) {
                        continue;
                    } else
                    option=3;
                System.out.println("\t\t\t\t    Silahkan Exit");
            break;        
        } while (option != 3);
    }
}