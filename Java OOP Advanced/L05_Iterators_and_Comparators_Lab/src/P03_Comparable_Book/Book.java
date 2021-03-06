package P03_Comparable_Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 class Book implements Comparable<Book> {
   private String title;
   private int year;
   private List<String> authors;

   public Book(String title, int year,String...authors) {
       this.title = title;
       this.year = year;
       setAuthors(authors);
   }

   private void setAuthors(String[] authors) {
       if (authors.length==0)
       {
           this.authors=new ArrayList<>();
       }
       else
       {
        this.authors=new ArrayList<>(Arrays.asList(authors));
       }
   }

   public String getTitle() {
       return title;
   }

   public int getYear() {
       return year;
   }

   public List<String> getAuthors() {
       return authors;
   }

   private void setTitle(String title) {
       this.title = title;
   }

   private void setYear(int year) {
       this.year = year;
   }

   public int compareTo(Book book)
   {
       return this.title.compareTo(book.title);
   }
}
