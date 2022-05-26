public class Book{
    private String title;
    private String author;
    public Book(String titleVal,String authorVal){
        title=titleVal;
        author=authorVal;
    }
    public String getTIttle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String toString(){
        System.out.printf("author: %s\t tittle: %s",getAuthor(),getTIttle());
        return"";
    }
}