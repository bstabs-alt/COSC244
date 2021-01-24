import java.io.*;
import java.util.*;

public class BitLevel{

    public static void main(String[] args){
        int pos = 0;
        int count = 0;
        String k = "";
        
        try{
            FileInputStream in = new FileInputStream(args[0]);
            FileOutputStream out = new FileOutputStream(args[1]); 
            System.out.println("Enter Key: ");
            Scanner sc = new Scanner(System.in);
            k = sc.next();

            while((count = in.read()) != -1){
                if(pos == k.length()){
                    pos = 0;
                }
                out.write(count ^ k.charAt(pos));
                pos++;
            }
            out.close();
            
        } catch(IOException e){
            System.out.println("IOException");
        }   
    }
}
