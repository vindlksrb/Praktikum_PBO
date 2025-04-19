package library.main;

import library.model.Book;
import library.model.Member;
import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {
    private static ArrayList<Book> books = new ArrayList<>();
    private static ArrayList<Member> members = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("=== SISTEM PERPUSTAKAAN ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Tampilkan Daftar Buku");
            System.out.println("4. Tampilkan Daftar Anggota");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1 -> tambahBuku();
                case 2 -> tambahAnggota();
                case 3 -> tampilkanBuku();
                case 4 -> tampilkanAnggota();
                case 5 -> System.out.println("Keluar dari sistem...");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 5);
    }

    private static void tambahBuku() {
        System.out.print("Masukkan judul buku: ");
        String title = scanner.nextLine();
        System.out.print("Masukkan penulis: ");
        String author = scanner.nextLine();
        System.out.print("Masukkan tahun terbit: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        books.add(new Book(title, author, year));
        System.out.println("Buku berhasil ditambahkan!\n");
    }

    private static void tambahAnggota() {
        System.out.print("Masukkan nama anggota: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan ID anggota: ");
        String id = scanner.nextLine();

        members.add(new Member(name, id));
        System.out.println("Anggota berhasil ditambahkan!\n");
    }

    private static void tampilkanBuku() {
        System.out.println("\n=== DAFTAR BUKU ===");
        if (books.isEmpty()) {
            System.out.println("Belum ada buku yang terdaftar.");
        } else {
            for (Book book : books) {
                book.displayInfo();
            }
        }
    }

    private static void tampilkanAnggota() {
        System.out.println("\n=== DAFTAR ANGGOTA ===");
        if (members.isEmpty()) {
            System.out.println("Belum ada anggota yang terdaftar.");
        } else {
            for (Member member : members) {
                member.displayInfo();
            }
        }
    }
}

