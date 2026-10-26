public class BookMain {
   public static void main(String[]args){

    Book book1=new Book("Redbook", 01, "Gerord", 2002);
    Book book2=new Book("Greenbook", 02, "Gaddafi", 1992 );
    Book book3=new Book("bluebook", 03, "Reo",2025);
    
    System.out.println("1st book's name: " + book1.getName());
    System.out.println("2nd book's name: " + book2.getName());
    System.out.println("3rd book's name: " + book3.getName());

    book1.setName("curve");
    System.out.println("1st book's new name: " + book1.getName());
   } 
}
