import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
public class W3_ex{
    public static void main(String[] args) throws IOException {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader console=new BufferedReader(reader);
        String input=console.readLine();
        ArrayList<String> listString=new ArrayList<String>();
        StringTokenizer tokenizer=new StringTokenizer(input);
        while(tokenizer.hasMoreTokens()){
            String a=tokenizer.nextToken();
            listString.add(a);
        }
        System.out.println(listString);
        for(int i=listString.size()-1;i>=0;i--){
            System.out.println(listString.get(i));
        }
          
        
    }
}
