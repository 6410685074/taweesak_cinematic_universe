public class BookStore {
    private Book[] bookList;
    private int numberOfBook;
    public BookStore(){
        bookList=new Book[3];
    }
    public void addNewBook(String title,String author){
        if(bookList.length==numberOfBook){
            Book[] newList=new Book[bookList.length*2];
            System.arraycopy(bookList,0, newList,0,bookList.length);
            bookList=newList;
        }
        bookList[numberOfBook]=new Book(title,author);
        numberOfBook++;

    }
    public void searchAuthor(String author){
        boolean a=false;
        for (int i = 0; i <numberOfBook; i++) {
            if(bookList[i].getAuthor().equals(author)){
                System.out.println(bookList[i]);
            }
        }
    }
    public int countTitle(String title){
        int count=0;
        for (int i = 0; i <numberOfBook; i++) {
            if(bookList[i].getTIttle().contains(title)){
                count++;
            }
        }
        return count;
    }
    public int countBook(){
        return numberOfBook;
    }
    public String toString(){
        for (int j = 0; j <numberOfBook; j++) {
            System.out.println(bookList[j]);
        }
        
        return"";
    }
}
