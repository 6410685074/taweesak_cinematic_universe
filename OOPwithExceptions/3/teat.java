public class teat{
    public static void main(String[] args) {
        NewBook a=new NewBook("august", "august", 2022);
        BookStore b=new BookStore();
        System.out.println(a);
        b.add(a);
        b.add(new Book("gg", "jaja", 2023));
        b.add(new Book("my name", "c", 1990));
        b.sortYear();
        System.out.println(b);
    }
}
