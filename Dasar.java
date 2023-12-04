import java.util.Scanner;

public class Dasar {
    public static void main(String[] args) {
        // Declareration
        Scanner scanner = new Scanner(System.in);
        boolean login = false, signUp = false;
        int option, lama = 0, haMa, hari = 0, bulan = 0, tahun = 0, counter = 0, user = -2, word = -1, bed = 0,
                uName = 3, passW = 3,
                duplicate = 0, bayar = 0, cash = 0, rek = 0;
        double haTot = 0, haDis, kembali;
        float disc = 0.0f;
        String daftar = "";
        String nPass = "";
        String pesanLagi, cetakData, backMenu, namaLog = "", passLog, bank = "";
        String nama[] = { "Rio", "Rizqi", "Necha" };
        String pass[] = { "test", "coba", "bisa" };
        String hotel = "";
        int jenisKamar[][] = {
                { 100000, 300000, 400000, 600000 },
                { 150000, 400000, 550000, 800000 }
        };

        // Menu
        System.out.println(
                "\n================================== APLIKASI BOOKING HOTEL ===================================");
        do {
            cash=0;
            System.out.println("+----------------------+");
            System.out.println("|         MENU         |");
            System.out.println("+----------------------+");
            System.out.println("| 1. Sign Up           |");
            System.out.println("| 2. Login             |");
            System.out.println("| 3. Price List Hotel  |");
            System.out.println("| 4. Pesan Hotel       |");
            System.out.println("| 5. Bayar             |");
            System.out.println("| 6. Riwayat Pemesanan |");
            System.out.println("| 7. Informasi Diskon  |");
            System.out.println("| 8. Exit              |");
            System.out.println("+----------------------+");
            System.out.println("Pilih Menu: ");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {

                // Sign Up
                case 1:
                    do {
                        System.out.print("Daftarkan User Anda: ");
                        scanner.nextLine();
                        daftar = scanner.nextLine();
                        for (int i = 0; i < uName; i++) {
                            if (daftar.equals(nama[i])) {
                                duplicate = i;
                                System.out.println("Username Telah Digunakan");
                                break;
                            }
                        }
                        if (daftar.equals(nama[duplicate])) {
                            continue;
                        }
                        System.out.print("Masukkan Password: ");
                        nPass = scanner.nextLine();
                        signUp = true;
                    } while (signUp != true);
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

                    // Login
                case 2:
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
                    System.out.println("\t\t\t\t ** Anda Berhasil Login! **");
                    continue;

                // Price List Hotel
                case 3:
                    System.out.println(
                            "\n=============================================================================================");
                    System.out.println("\t\t\t\t     Price List Hotel");
                    System.out.println(
                            "=============================================================================================");
                    System.out.println("+-----------+--------------+----------------+");
                    System.out.println("|    Bed    |  Aria Hotel  |  Montana Hotel |");
                    System.out.println("+-----------+--------------+----------------+");
                    System.out.println("|   Single  |  Rp 100.000  |   Rp 150.000   |");
                    System.out.println("+-----------+--------------+----------------+");
                    System.out.println("|   Double  |  Rp 300.000  |   Rp 400.000   |");
                    System.out.println("+-----------+--------------+----------------+");
                    System.out.println("|   Queens  |  Rp 400.000  |   Rp 550.000   |");
                    System.out.println("+-----------+--------------+----------------+");
                    System.out.println("|   Kings   |  Rp 600.000  |   Rp 800.000   |");
                    System.out.println("+-----------+--------------+----------------+");

                    System.out.println(
                            "===============================================================================================");
                    System.out.print("\t\t\t   Kembali ke menu (ketik 'Y') : ");
                    backMenu = scanner.next();
                    if (backMenu.equalsIgnoreCase("y")) {
                        continue;
                    }
                    break;

                // Pesan Hotel
                case 4:
                    if (namaLog == "") {
                        System.out.println("\t\t ** Anda Belum Login! Silahkan Login Terlebih Dahulu **");
                        continue;
                    } else
                        System.out.println(
                                "\n=============================================================================================");
                    System.out.println("\t\t\t\t     Daftar Hotel");
                    System.out.println(
                            "=============================================================================================");
                    if (counter == 3) {
                        disc += 0.10f;
                        System.out.println("\t\t *Selamat Anda mendapatkan discount loyalty sebesar 10%*");
                    }
                    System.out.println("Halo " + namaLog + ", Selamat Datang!");
                    System.out.println("1. Aria");
                    System.out.println("2. Montana");
                    System.out.println("Silahkan pilih hotel, Mau nginep dimana? ");
                    option = scanner.nextInt();
                    if (option == 3) {
                        continue;
                    }

                    // Asking Room
                    System.out.println("Silahkan pilih jenis kamar");
                    System.out.println("1. Single Bed");
                    System.out.println("2. Double Bed");
                    System.out.println("3. Queens Bed");
                    System.out.println("4. Kings Bed");
                    System.out.println("Mau jenis kamar yang mana? ");
                    bed = scanner.nextInt();

                    // Asking Date
                    System.out.print("Masukkan Tanggal Pemesanan: ");
                    hari = scanner.nextInt();
                    System.out.print("Masukkan Bulan: ");
                    bulan = scanner.nextInt();
                    System.out.print("Masukkan Tahun: ");
                    tahun = scanner.nextInt();
                    System.out.print("Masukkan Lama Menginap: ");
                    lama = scanner.nextInt();

                    // Case
                    switch (option) {
                        case 1:
                            if (hari == 17 && bulan == 8) {
                                disc += 0.17f;
                            }
                            hotel = "Aria";
                            break;

                        case 2:

                            if (hari == 31 && bulan == 12) {
                                disc += 0.15f;
                            }
                            hotel = "Montana";
                            break;

                        default:
                            System.out.println("\t\t Menu yang anda masukkan salah!");
                            break;
                    }

                    // operation
                    haMa = jenisKamar[option - 1][bed - 1] * lama;
                    haDis = haMa * disc;
                    haTot = haMa - haDis;
                    counter++;
                    System.out.println("*=================================*");
                    System.out.println("| Total Tagihan Anda = " + haTot + " |");
                    System.out.println("*=================================*");

                    // Bayar
                case 5:
                    if (haTot == 0) {
                        System.out.println("\t\t\t ** Anda Tidak Memiliki Tagihan **");
                        continue;
                    } else if (cash == haTot) {
                        System.out.println("\t\t\t ** Tagihan Anda Telah Lunas **");
                        continue;
                    } else
                        System.out.println(
                                "=============================**Silahkan Pilih Metode Pembayaran**=============================");
                    System.out.println("1. Tunai");
                    System.out.println("2. Non Tunai");
                    System.out.println("Metode Pembayaran: ");
                    bayar = scanner.nextInt();
                    switch (bayar) {
                        case 1:
                            System.out.print("Masukkan Nominal Anda: Rp. ");
                            cash = scanner.nextInt();
                            if (cash >= haTot) {
                                kembali = cash - haTot;
                                System.out.println("Total Kembalian: Rp. " + kembali);
                                System.out.println("**Tagihan Anda Telah Lunas**");
                            } else if (cash < haTot) {
                                System.out.println("Nominal Anda Tidak Mencukupi! Silahkan Bayar Ulang");
                            } else
                                System.out.println("**Tagihan Anda Belum Lunas!**");
                            break;
                        case 2:
                            System.out.println("Transfer Bank");
                            System.out.println("BNI/BRI/MANDIRI");
                            System.out.print("Pilih Bank: ");
                            scanner.nextLine();
                            bank = scanner.nextLine();
                            System.out.print("Masukkan No.Rek Anda: ");
                            rek = scanner.nextInt();
                            System.out.print("Masukkan Nominal Anda (Sesuai Tagihan!): Rp. ");
                            cash = scanner.nextInt();
                            if (cash == haTot) {
                                System.out.println("Transfer Bank " + bank + " Dengan No.Rek " + rek
                                        + " Telah Berhasil!");
                                System.out.println("**Tagihan Anda Telah Lunas**");
                            } 
                            else if (cash < haTot) {
                                System.out.println("*Tidak valid! Silahkan Bayar Ulang*");
                                System.out.println("Bayar Ulang (Ketik 'Y') : ");
                                backMenu = scanner.next();
                                if (backMenu.equalsIgnoreCase("y")) {
                                    continue;
                                }
                            }else
                                System.out.println("**Tidak Valid! Tagihan Anda Belum Lunas!**");
                            break;
                    }

                    // Asking for data
                    System.out.println(
                            "===============================================================================================");
                    System.out.print("\t\t   Apakah anda ingin mencetak data pemesanan? (Y/T) : ");
                    cetakData = scanner.next();
                    if (cetakData.equalsIgnoreCase("y")) {
                        // Printing data
                        System.out.println(
                                "\n===============================================================================================");
                        System.out.println("\t\t\t\t Data Pemesanan Hotel");
                        System.out.println(
                                "===============================================================================================");
                        System.out.println("Nama Pemesan\t : " + namaLog);
                        System.out.println("Hotel\t\t : " + hotel);
                        System.out.println("Jenis Kamar\t : " + bed);
                        System.out.println("Waktu Pemesanan\t : " + hari + "/" + bulan + "/" + tahun);
                        System.out.println("Lama Menginap\t : " + lama + " hari");
                        System.out.println("Diskon\t\t : " + disc);
                        System.out.println("Total Tagihan\t : " + "Rp " + haTot);
                        if (bayar == 1) {
                            System.out.println("Metode Pembayaran: Tunai");
                            if (cash >= haTot) {
                                System.out.println("Status Tagihan\t : Lunas");
                                System.out.println(
                                        "===============================================================================================");
                            } else {
                                System.out.println("Status Tagihan\t : Belum Lunas");
                                System.out.println(
                                        "===============================================================================================");
                            }
                            continue;
                        } else {
                            System.out.println("Metode Pembayaran: Non Tunai");
                            System.out.println("Bank\t\t : " + bank);
                            System.out.println("No. Rekening\t : " + rek);
                            if (bayar == 2) {
                                if (cash >= haTot) {
                                    System.out.println("Status Tagihan\t : Lunas");
                                    System.out.println(
                                            "===============================================================================================");
                                } else {
                                    System.out.println("Status Tagihan\t : Belum Lunas");
                                    System.out.println(
                                            "===============================================================================================");
                                }
                            }
                        }
                    } else
                        System.out.println("\t\t\t Data Tidak Dicetak, Terimakasih");

                    // Asking booking again in the same hotel
                    System.out.println(
                            "===============================================================================================");
                    System.out.print("\t\t   Apakah anda ingin memesan lagi? (Y/T) : ");
                    pesanLagi = scanner.next();
                    if (pesanLagi.equalsIgnoreCase("y")) {
                        option = option;
                        continue;
                    } else if (pesanLagi.equalsIgnoreCase("t")) {
                        System.out.println("\t\t Terimakasih Telah Memesan " + "kamar " + hotel + " di Aplikasi Kami");
                    }

                    // Asking back to menu
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

                // Riwayat Pemesanan
                case 6:
                    if (hotel == "") {
                        System.out.println("\t\t\t ** Anda Belum Pernah Booking Hotel **");
                        continue;
                    } else
                        System.out.println(
                                "\n===============================================================================================");
                    System.out.println("\t\t\t\t Riwayat Pemesanan Hotel Terakhir");
                    System.out.println(
                            "===============================================================================================");
                    System.out.println("Nama Pemesan\t : " + namaLog);
                    System.out.println("Hotel\t\t : " + hotel);
                    System.out.println("Jenis Kamar\t : " + bed);
                    System.out.println("Waktu Pemesanan\t : " + hari + "/" + bulan + "/" + tahun);
                    System.out.println("Lama Menginap\t : " + lama + " hari");
                    System.out.println("Diskon\t\t : " + disc);
                    System.out.println("Total Tagihan\t : " + "Rp " + haTot);
                    if (bayar == 1) {
                        System.out.println("Metode Pembayaran: Tunai");
                        if (cash >= haTot) {
                            System.out.println("Status Tagihan\t : Lunas");
                            System.out.println(
                                    "===============================================================================================");
                        } else {
                            System.out.println("Status Tagihan\t : Belum Lunas");
                            System.out.println(
                                    "===============================================================================================");
                        }
                        continue;
                    } else {
                        System.out.println("Metode Pembayaran: Non Tunai");
                        System.out.println("Bank\t\t : " + bank);
                        System.out.println("No. Rekening\t : " + rek);
                        if (bayar == 2) {
                            if (cash >= haTot) {
                                System.out.println("Status Tagihan\t : Lunas");
                                System.out.println(
                                        "===============================================================================================");
                            } else {
                                System.out.println("Status Tagihan\t : Belum Lunas");
                                System.out.println(
                                        "===============================================================================================");
                            }
                        }
                    }
                    continue;

                // Informasi Diskon
                case 7:
                    System.out.println(
                            "\n=============================================================================================");
                    System.out.println("\t\t\t\t     Informasi Diskon");
                    System.out.println(
                            "=============================================================================================");
                    System.out.println(
                            "+---------------------------+------------------------------+---------------------------+");
                    System.out.println(
                            "|      *Diskon Loyalty*     |       *Diskon Merdeka*       |      *Diskon New Year*    |");
                    System.out.println(
                            "+---------------------------+------------------------------+---------------------------+");
                    System.out.println(
                            "| Diskon 10% setiap booking |   Diskon 17% setiap booking  | Diskon 15% setiap booking |");
                    System.out.println(
                            "|  hotel lebih dari 3 kali! | hotel di tanggal 17 Agustus! |   hotel di Akhir Tahun!   |");
                    System.out.println(
                            "+---------------------------+------------------------------+---------------------------+");
                    System.out.println(
                            "===============================================================================================");
                    System.out.print("\t\t\t   Kembali ke menu (ketik 'Y') : ");
                    backMenu = scanner.next();
                    if (backMenu.equalsIgnoreCase("y")) {
                        continue;
                    }
                    break;

                // Exit
                case 8:
                    System.out.println("\t\t\t\t ***Your Now Exit***");
                    System.out.println("\t\t\t\t    **Thank You**");
                    break;
            }
            break;
        } while (option != 9);
    }
}
