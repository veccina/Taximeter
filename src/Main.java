import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total, startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Distance in Kilometers : ");
        km = input.nextInt();

        total =  (km * perKm);
        total += startPrice;
        total = (total< 20) ? 20 : total;
        System.out.println("Total Amaount : " + total);
    }
}