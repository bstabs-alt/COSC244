import java.lang.*;
import java.io.*;

public class P2{

    public static void main(String [] args){
        BufferedReader buffin = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;
        String line;
        try{
            while((line = buffin.readLine()) != null){
                StringBuilder b = new StringBuilder();
                b.append(line);
                b.reverse();
                out.print(b);
        }
        } catch(Exception e){
            System.out.println("Error");
            System.exit(1);
        }
       
        System.exit(0);
    }
    
}
