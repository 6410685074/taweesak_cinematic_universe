public class Book {
    private String name;
    private String author;
    private int year;
    
    public Book(String name,String author,int year){
        this.name=name;
        this.author=author;
        this.year=year;
    }
    public int getYear(){
        return year;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public String toString(){
        System.out.println(getName()+":"+getAuthor()+Integer.toString(getYear()));
        return "";
    }
    }
