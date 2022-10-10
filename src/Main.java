import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double pi = 3.14;
	    double dilimalan,alan,cevre,r;
	    int merkezaci;
        Scanner doublescanner = new Scanner(System.in);
        Scanner intscanner = new Scanner(System.in);

        System.out.print("Yarıçapı giriniz: ");
        r = doublescanner.nextDouble();
        System.out.print("Daire diliminin merkez açısının ölçüsünü giriniz: ");
        merkezaci = intscanner.nextInt();

        alan = pi*r*r;
        cevre = 2*pi*r;
        dilimalan = (pi*(r*r)*merkezaci)/360;

        System.out.println("Dairenin Alanı: "+alan);
        System.out.println("Dairenin Çevresi: "+cevre);
        System.out.println("Daire diliminin alanı: "+dilimalan);





    }
}
