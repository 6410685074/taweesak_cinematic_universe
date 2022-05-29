import java.util.ArrayList;
public class BookStore {
    private Book[] store;
    private int year;
    private int countbook=0;
    public BookStore(){
        store=new Book[10];
    }
    public void add(Book a){
        if(store.length==countbook){
            Book[] b=new Book[store.length*2];
            System.arraycopy(store, 0, b,0,countbook);
            store=b;
        }
        store[countbook++]=a;
    }
    public void sortYear(){
        int n=0;
        while(n<countbook){
            for (int i =countbook-1; i>0; i--){
                Book bb;
                if(store[i].getYear()<store[i-1].getYear()){
                    bb=store[i];
                    store[i]=store[i-1];
                    store[i-1]=bb;
                }
            }
            n++;
        }
    }
    public String toString(){
        try{
        for(Book a:store){
            if(a.getName()!=null){
            System.out.println(a);
            }
        }
    }catch(NullPointerException e){
    }
        return"";
    }
}
