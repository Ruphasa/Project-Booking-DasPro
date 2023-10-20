import java.util.Scanner;
public class Dasar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int harga, option, lama, haMa, hari, bulan, counter = 0;
            double haTot, haDis;
            float disc = 0.0f;

            do {
                System.out.println("Nginep dimana?");
                System.out.println("1. aria");
                System.out.println("2. montana");
                System.out.println("3. Exit");
                option = scanner.nextInt();

                if (counter == 3) {
                            disc += 0.03f;
                            System.out.println("Selamat Anda mendapatkan discount loyalty sebesar 3%");
                        }

                switch (option) {
                    case 1:
                        System.out.println("tanggal berapa sekarang ?");
                        hari = scanner.nextInt();
                        System.out.println("bulan berapa sekarang ?");
                        bulan = scanner.nextInt();

                        if (hari == 17 && bulan == 8) {
                            disc += 0.1f;
                        }

                        harga = 1000000;
                        System.out.println("berapa malam?");
                        lama = scanner.nextInt();
                        haMa = harga * lama;
                        haDis = haMa * disc;
                        haTot = haMa - haDis;
                        System.out.println("Total tagihannya "+ haTot);
                        break;

                    case 2:
                        System.out.println("tanggal berapa sekarang ?");
                        hari = scanner.nextInt();
                        System.out.println("bulan berapa sekarang ?");
                        bulan = scanner.nextInt();

                        if (hari == 25 && bulan == 12) {
                            disc += 0.12f;
                        }

                        harga = 2000000;
                        System.out.println("berapa malam?");
                        lama = scanner.nextInt();
                        haMa = harga * lama;
                        haDis = haMa * disc;
                        haTot = haMa - haDis;
                        System.out.println("Total tagihannya "+ haTot);
                        break;

                    case 3:
                        System.out.println("your now exit");
                        break;
                    }
                    counter++; 
        } while (option !=3);
    }
}
