package OOP_Prioritas1;

import java.io.*;

public class MainProduct {
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(r);
        
        // Input user untuk Produk
        System.out.println("Masukan Nama Produk");
        String produk = input.readLine();
        
        // Input user untuk deskripsi
        System.out.println("Masukan Deskripsi Produk");
        String deskripsi = input.readLine();
        
        // Input user untuk harga
        System.out.println("Masukkan Harga Produk");
        int harga = Integer.valueOf(input.readLine());
        
        // Input user untuk stok
        System.out.println("Masukkan Stok Produk");
        int stok = Integer.valueOf(input.readLine());
        
        Product prd = new Product(produk, deskripsi, harga, stok);
        prd.getInfo();
    }
}