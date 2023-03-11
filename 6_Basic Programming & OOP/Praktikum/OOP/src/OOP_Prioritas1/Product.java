package OOP_Prioritas1;

public class Product {
    String produk;
    String deskripsi;
    int harga;
    int stok;

    public Product(String produk, String deskripsi, int harga, int stok) {
        this.produk = produk;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.stok = stok;
    }

    public String getProduk() {
        return produk;
    }

    public void setProduk(String produk) {
        this.produk = produk;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    public void getInfo(){
        System.out.println("===\n"
                + "nama : " +produk+ "\ndeskripsi : " +deskripsi+ "\nharga : " +harga+ "\njumlah stok : " +stok+ "\n===");
    }
}
