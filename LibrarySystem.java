public class LibrarySystem {

    // Base Class
    static class Book {
        String title;
        String author;
        int year;

        Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        void displayInfo() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Year: " + year);
        }
    }

    // Child Class 1
    static class PrintedBook extends Book {
        int pages;

        PrintedBook(String title, String author, int year, int pages) {
            super(title, author, year);
            this.pages = pages;
        }

        int readingTime() {
            return pages * 2;
        }

        @Override
        void displayInfo() {
            super.displayInfo();
            System.out.println("Pages: " + pages);
            System.out.println("Reading Time: " + readingTime() + " minutes");
        }
    }

    // Child Class 2
    static class EBook extends Book {
        double fileSize;

        EBook(String title, String author, int year, double fileSize) {
            super(title, author, year);
            this.fileSize = fileSize;
        }

        double downloadTime(double speed) {
            return fileSize / speed;
        }

        @Override
        void displayInfo() {
            super.displayInfo();
            System.out.println("File Size: " + fileSize + " MB");
        }
    }

    // Main Method
    public static void main(String[] args) {

        // 2 PrintedBook objects
        PrintedBook pb1 = new PrintedBook("Java Programming", "James Smith", 2022, 250);
        PrintedBook pb2 = new PrintedBook("Clean Code", "Robert Martin", 2008, 431);

        // 2 EBook objects
        EBook eb1 = new EBook("AI Basics", "Sarah Lee", 2023, 40);
        EBook eb2 = new EBook("Data Science 101", "Emily Clark", 2021, 25);

        // Display PrintedBook info
        System.out.println("=== Printed Books ===");
        pb1.displayInfo();
        System.out.println();
        pb2.displayInfo();
        System.out.println();

        // Display EBook info
        System.out.println("=== EBooks ===");
        eb1.displayInfo();
        System.out.printf("Download Time at 10 MB/s: %.0f seconds%n", eb1.downloadTime(10));
        System.out.println();
        eb2.displayInfo();
        System.out.printf("Download Time at 10 MB/s: %.0f seconds%n", eb2.downloadTime(10));
    }
}