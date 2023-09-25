import java.util.Scanner;

public class Dasar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int harga, option, haTot, lama;
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
                        harga = 1000000;
                        System.out.println("berapa malam");
                        lama = scanner.nextInt();
                        haTot = harga * lama;
                        System.out.println("Total tagihannya "+ haTot);
                        break;
                    case 2:
                        harga = 2000000;
                        System.out.println("berapa malam");
                        lama = scanner.nextInt();
                        haTot = harga * lama;
                        System.out.println("Total tagihannya "+ haTot);
                        break;
                    case 3:
                        harga = 3000000;
                        System.out.println("berapa malam");
                        lama = scanner.nextInt();
                        haTot = harga * lama;
                        System.out.println("Total tagihannya "+ haTot);
                        break;
                    case 4:
                        harga = 1500000;
                        System.out.println("berapa malam");
                        lama = scanner.nextInt();
                        haTot = harga * lama;
                        System.out.println("Total tagihannya "+ haTot);
                        break;
                    case 5:
                        harga = 1250000;
                        System.out.println("berapa malam");
                        lama = scanner.nextInt();
                        haTot = harga * lama;
                        System.out.println("Total tagihannya "+ haTot);
                        break;
                    case 6:
                        System.out.println("your now exit");
                        break;
            } 
        } 
    }
}
