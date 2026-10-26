public class Book{
    private String name;
    private int serial;
    private String writer;
    private int year;
    
    public Book(String name, int serial, String writer, int year){
        this.name=name;
        this.serial=serial;
        this.writer=writer;
        this.year=year;
    }

    public int getSerial(){
        return serial;
    }

    public String getName(){
        return name;
    }

    public String getWriter(){
        return writer;
    }

    public int getYear(){
        return year;
    }

   public void setName(String name){
        this.name=name;
    }

    public void setWriter(String writer){
        this.writer=writer;
    }

    public void setYear(int year){
        this.year=year;
    }

    @Override 
    public String toString(){
        return "Book{name='" + name +
           "', serial=" + serial +
           ", writer='" + writer +
           "', year=" + year + "}";
    }
}