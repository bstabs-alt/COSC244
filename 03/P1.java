import java.lang.*;
import java.io.*;

public class P1{

    public static void main(String [] args){
        InputStream in = System.in;
        PrintStream out = System.out;
        int i;
        try{
        while((i = in.read()) != -1){
            out.write(i);
        }
        } catch(Exception e){
         throw new RuntimeException(e);
        }
        System.exit(0);
    }
    
}
