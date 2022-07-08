
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Patika.dev egitim kampi proje odevidir.
        //if else dongu kullanilmadan yapilmasi istenmektedir.

        double tutar, kdvOran, kdvTutar, kdvliTutar;

        Scanner inp = new Scanner(System.in);

        System.out.println("Tutari giriniz = ");

        tutar = inp.nextDouble();

        boolean control = tutar>0;

        String str = control ? "Girilen tutar gecerli " : "Girilen tutar gecersiz";

        System.out.println(str);

        boolean kdvControl = tutar>1000;

       kdvOran = kdvControl ?  0.08 : 0.18;

        kdvTutar = tutar * kdvOran;

        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar = " + tutar);
        System.out.println("KDV Orani = " + kdvOran);
        System.out.println("KDV Tutari = " + kdvTutar);
        System.out.println("KDV'li Tutar = " + kdvliTutar);









    }

}
