package basicprogramming;

public class UntungRugi {
     public static void main(String[] args) {
        int hargaBeli = 15000;
        int hargaJual = 30000;
        int hasil;

        System.out.println("harga beli = 15000");
        System.out.println("harga jual = 30000");
        hasil=hargaJual-hargaBeli;
        if (hargaBeli < hargaJual) {
            System.out.println("Untung sebesar : " + hasil);
        } else {
            System.out.println("Rugi Sebesar : " + hasil);
        }
        System.out.println("---------------------------------");


        int hargaBeli1 = 12000;
        int hargaJual1 = 9000;
        int hasil1;

        System.out.println("harga beli = 12000");
        System.out.println("harga jual = 9000");
        hasil1=hargaJual1-hargaBeli1;
        if (hargaBeli1 < hargaJual1) {
            System.out.println("Untung sebesar : " + hasil1);
        } else {
            System.out.println("Rugi sebesar : " + hasil1);
        }
        System.out.println("---------------------------------");


        int hargaBeli2 = 12000;
        int hargaJual2 = 12000;
        int hasil2;

        System.out.println("harga beli = 12000");
        System.out.println("harga jual = 12000");
        hasil2=hargaJual2-hargaBeli2;

        if (hargaBeli2 < hargaJual2) {
            System.out.println("Untung sebesar : " + hasil2);
        } else if (hargaBeli2 > hargaJual2) {
            System.out.println("Rugi sebesar : " + hasil2);
        } else {
            System.out.println("Sama Saja");
        }
    }
}
