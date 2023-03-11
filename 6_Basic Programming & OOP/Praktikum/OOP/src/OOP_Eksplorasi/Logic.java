package OOP_Eksplorasi;

import java.util.ArrayList;
import java.util.UUID;

public class Logic {
    private ArrayList<Book> bookList = new ArrayList<>();
    
    public void inputBuku(Book buku){
        bookList.add(buku);
    }
    
    public void displayAll(){
        for(Book b : bookList){
            System.out.println(b);
        }
    }
    
    public void displayById(String id){
        for(Book b : bookList){
            if(b.getId().equals(UUID.fromString(id))){
                System.out.println(b);
            }
        }
    }
    
    public void editBuku(String id, String judulBaru, String penulisBaru, String jenisBaru){
        for(Book b : bookList){
            if(b.getId().equals(UUID.fromString(id))){
                b.setJudul(judulBaru);
                b.setPenulis(penulisBaru);
                b.setJenis(jenisBaru);
            }
        }
    }
    
    public void deleteBuku(String id){
        for(Book b : bookList){
            if(b.getId().equals(UUID.fromString(id))){
                bookList.remove(b);
            }
        }
    }
}