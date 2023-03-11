package OOP_Eksplorasi;

import java.util.UUID;

public class Book {
    UUID id;
    String judul;
    String penulis;
    String jenis;

    public Book(String judul, String penulis, String jenis) {
        id = UUID.randomUUID();
        this.judul = judul;
        this.penulis = penulis;
        this.jenis = jenis;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "===\nID : " +id+ "\nTitle : " +judul+ "\nAuthor : " +penulis+ "\nCategory : " +jenis+ "\n===\n";
    }
    
    
}