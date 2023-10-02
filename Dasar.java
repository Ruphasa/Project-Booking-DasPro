import java.util.Scanner;

public class Dasar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int harga, option, lama, haMa, hari, bulan;
            double haTot, haDis;
            float disc;

            {
                System.out.println("Nginep dimana?");
                System.out.println("1. aria");
                System.out.println("2. montana");
                System.out.println("3. grand_Palace");
                System.out.println("4. solaris");
                System.out.println("5. ibis");
                System.out.println("6. Exit");
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("tanggal berapa sekarang ?");
                        hari = scanner.nextInt();
                        System.out.println("bulan berapa sekarang ?");
                        bulan = scanner.nextInt();
                        if (hari==17&&bulan==8) {
                            disc = 0.1f;
                        } else {
                            disc = 1.0f;
                        }
                        harga = 1000000;
                        System.out.println("berapa malam");
                        lama = scanner.nextInt();
                        haMa = harga * lama;
                        haDis = haMa * disc;
                        haTot=haMa - haDis;
                        System.out.println("Total tagihannya "+ haTot);
                        break;
                    case 2:
                        System.out.println("tanggal berapa sekarang ?");
                        hari = scanner.nextInt();
                        System.out.println("bulan berapa sekarang ?");
                        bulan = scanner.nextInt();
                        if (hari==17&&bulan==8) {
                            disc = 0.12f;
                        } else {
                            disc = 1.0f;
                        }
                        harga = 2000000;
                        System.out.println("berapa malam");
                        lama = scanner.nextInt();
                        haMa = harga * lama;
                        haDis = haMa * disc;
                        haTot=haMa - haDis;
                        System.out.println("Total tagihannya "+ haTot);
                        break;
                    case 3:
                        System.out.println("tanggal berapa sekarang ?");
                        hari = scanner.nextInt();
                        System.out.println("bulan berapa sekarang ?");
                        bulan = scanner.nextInt();
                        if (hari==17&&bulan==8) {
                            disc = 0.15f;
                        } else {
                            disc = 1.0f;
                        }
                        harga = 3000000;
                        System.out.println("berapa malam");
                        lama = scanner.nextInt();
                        haMa = harga * lama;
                        haDis = haMa * disc;
                        haTot=haMa - haDis;
                        System.out.println("Total tagihannya "+ haTot);
                        break;
                    case 4:
                        System.out.println("tanggal berapa sekarang ?");
                        hari = scanner.nextInt();
                        System.out.println("bulan berapa sekarang ?");
                        bulan = scanner.nextInt();
                        if (hari==17&&bulan==8) {
                            disc = 0.3f;
                        } else {
                            disc = 1.0f;
                        }
                        harga = 1500000;
                        System.out.println("berapa malam");
                        lama = scanner.nextInt();
                        haMa = harga * lama;
                        haDis = haMa * disc;
                        haTot=haMa - haDis;
                        System.out.println("Total tagihannya "+ haTot);
                        break;
                    case 5:
                        System.out.println("tanggal berapa sekarang ?");
                        hari = scanner.nextInt();
                        System.out.println("bulan berapa sekarang ?");
                        bulan = scanner.nextInt();
                        if (hari==17&&bulan==8) {
                            disc = 0.2f;
                        } else {
                            disc = 1.0f;
                        }
                        harga = 1250000;
                        System.out.println("berapa malam");
                        lama = scanner.nextInt();
                        haMa = harga * lama;
                        haDis = haMa * disc;
                        haTot=haMa - haDis;
                        System.out.println("Total tagihannya "+ haTot);
                        break;
                    case 6:
                        System.out.println("your now exit");
                        break;
            } 
        } 
    }
}
