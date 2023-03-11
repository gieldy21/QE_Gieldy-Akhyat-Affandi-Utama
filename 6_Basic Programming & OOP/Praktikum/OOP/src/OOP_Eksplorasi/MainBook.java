package OOP_Eksplorasi;

import java.io.*;
import java.util.*;

public class MainBook {

    static Logic logic = new Logic();
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int opsi;
        boolean stop = false;
        do {
            System.out.println("Menu Pilihan");
            System.out.println("1. Create a new book\n"
                    + "2. Get all books\n"
                    + "3. Get book by ID\n"
                    + "4. Update book\n"
                    + "5. Delete book\n"
                    + "6. Exit");
            opsi = Integer.parseInt(input.readLine());

            switch (opsi) {
                case 1:
                    inputBuku();
                    break;
                case 2:
                    displaySemuaBuku();
                    break;
                case 3:
                    displayBookID();
                    break;
                case 4:
                    editBuku();
                    break;
                case 5:
                    deleteBuku();
                    break;
                case 6:
                    System.out.println("Bye...");
                    stop = true;
                    break;

            }
        } while (stop == false);
    }
    
    private static void inputBuku() throws IOException{
        System.out.println("Enter title");
        String judul = input.readLine();
        
        System.out.println("Enter author");
        String penulis = input.readLine();
        
        System.out.println("Enter category");
        String jenis = input.readLine();
        
        
        Book buku = new Book(judul, penulis, jenis);
        logic.inputBuku(buku);
    }
    
    private static void displaySemuaBuku(){
        logic.displayAll();
    }
    
    private static void displayBookID() throws IOException{
        System.out.println("Enter book ID");
        String id = input.readLine();
        
        logic.displayById(id);
    }
    
    private static void editBuku() throws IOException{
        System.out.println("Enter book ID");
        String id = input.readLine();
        
        System.out.println("Enter new title");
        String judulBaru = input.readLine();
        
        System.out.println("Enter new author");
        String penulisBaru = input.readLine();
        
        System.out.println("Enter new category");
        String jenisBaru = input.readLine();
        
        logic.editBuku(id, judulBaru, penulisBaru, jenisBaru);
    }
    
    private static void deleteBuku() throws IOException{
        System.out.println("Enter book ID");
        String id = input.readLine();
        
        logic.deleteBuku(id);
    }
}