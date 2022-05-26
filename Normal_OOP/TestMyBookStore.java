import java.util.Scanner;
public class TestMyBookStore {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    BookStore myStore=new BookStore();
    while(true){
        System.out.println("hi wellcome to myBookStore");
        System.out.println("enter 1 to donate some book");
        System.out.println("enter 2 to search author and their books");
        System.out.println("enter 3 to count tittle");
        System.out.println("enter 4 to show all books");
        System.out.println("enter 5 to logout");
        String a=sc.nextLine();
        if(a.equals("1")){
            System.out.println("enter title and author");
            String title=sc.nextLine();
            String author=sc.nextLine();
            myStore.addNewBook(title, author);
        }else
        if(a.equals("2")){
            System.out.println("search author and their books");
            String author=sc.nextLine();
            myStore.searchAuthor(author);
            
        }
        else
        if(a.equals("3")){
            System.out.println("enter title");
            String title =sc.nextLine();
            System.out.println(myStore.countTitle(title));
        }
        else
        if(a.equals("4")){
            System.out.println(myStore);
        }
        else
        if(a.equals("5")){
            System.out.println("thank you");
            break;
        }
        else{
            System.out.println("no that option");
        }

        
    }
    
 }   
}
