import java.util.Scanner;
public class Taksi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double sonTutar;

        System.out.println("KM giriniz : ");
        int km = girdi.nextInt();

        double kontrolTutar = km * 2.20;

        if (kontrolTutar<20) {
            sonTutar = 20;
        } else {
            sonTutar = (km * 2.20) + 10;
        }

        System.out.println(sonTutar);


    }
}
