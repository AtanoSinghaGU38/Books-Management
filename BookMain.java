import java.util.ArrayList;

public class BookMain {
   public static void main(String[]args){

    Book book1=new Book("Redbook", 1, "Gerord", 2002);
    Book book2=new Book("Greenbook", 2, "Gaddafi", 1992 );
    Book book3=new Book("bluebook", 3, "Reo",2025);

    //intial operations
    // System.out.println("1st book's name: " + book1.getName());
    // System.out.println("2nd book's name: " + book2.getName());
    // System.out.println("3rd book's name: " + book3.getName());

    // book1.setName("curve");
    // System.out.println("1st book's new name: " + book1.getName());

    //commit 1: creating an arraylist and printing it

    ArrayList<Book> arrL= new ArrayList<>();
    arrL.add(book1);
    arrL.add(book2);
    arrL.add(book3);

    for(Book b:arrL){
        System.out.println(b);
    }
     System.out.println("names of the books are " + book1.getName() + "- " + book2.getName() + "- " + book3.getName());
     System.out.println("number of books " + arrL.size());
    //a fourth book
    Book book4=new Book("Graybook", 4, "Humayun", 2010);
    arrL.add(book4);
     
    //finding books published after 2000
    int target=2000;
    for(Book find:arrL){
        if(find.getYear()>2000){
            System.out.println("name of the book published after 2000 " + find.getName());
        }
    }
    
   } 
}
