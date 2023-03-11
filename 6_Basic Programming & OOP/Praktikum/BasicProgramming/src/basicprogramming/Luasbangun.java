package basicprogramming;

public class Luasbangun {
    public static void main(String[] args) {
        // segitiga
        float alas = 20;
        float tinggi = 25;
        double luassegitiga;


        System.out.println("Alas : 20 ");
        System.out.println("Tinggi : 25 ");
        luassegitiga=0.5*alas*tinggi;
        System.out.println("Luas Segitiganya adalah : "+luassegitiga);
        System.out.println("----------------------------------------");


        // persegi panjang
        float panjang = 40;
        float lebar = 6;
        double luaspp;

        System.out.println("Panjang : 40 ");
        System.out.println("Lebar : 6 ");
        luaspp=0.5*panjang*lebar;
        System.out.println("Luas persegi panjangnya adalah : "+luaspp);
        System.out.println("----------------------------------------");


        // lingkaran
        double jari2 = 7;
        double luaslingkaran;

        System.out.println("jari-jari : 7 ");
        luaslingkaran=3.14*jari2*jari2;
        System.out.println("Luas lingkarannya adalah : "+luaslingkaran);
    }
}
