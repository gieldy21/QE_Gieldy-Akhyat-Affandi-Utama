package basicprogramming;

public class Enkripsi {

    private static String encrypt(String s) {
        String hasilEnkripsi = "";
        int panjangTeks = s.length();

        for (int i = 0; i < panjangTeks; i++) {
            char huruf = s.charAt(i);
            if (Character.isUpperCase(huruf)) {
                huruf = (char) (((huruf - 'A' + 10) % 26) + 'A');
            } else if (Character.isLowerCase(huruf)) {
                huruf = (char) (((huruf - 'a' + 10) % 26) + 'a');
            }
            hasilEnkripsi += huruf;
        }

       return hasilEnkripsi;
    }
    public static void main(String[] args) {
        System.out.println(encrypt("SEPULSA OKE")); // COZEVCK YUO
        System.out.println(encrypt("ALTERRA ACADEMY")); // KVDOBBK KMKNOWI
        System.out.println(encrypt("INDONESIA")); // SXNYXOCSK
        System.out.println(encrypt("GOLANG")); // QYVKXQ
        System.out.println(encrypt("PROGRAMMER")); // ZBYQBKWWOB
    }
}
