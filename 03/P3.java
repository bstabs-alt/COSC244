import java.util.*;
import java.lang.*;
import java.io.*;

public class P3{

    public static void main(String [] args){
        PrintStream out = System.out;
        Scanner sc = new Scanner(System.in);
        String line;
        try{
            while(sc.hasNextLine()){
                line = sc.nextLine();
                line = line.toUpperCase();
                out.println(line);
            }
        } catch(Exception e){
            System.out.println("Error");
            System.exit(1);
        }
        System.exit(0);
    }
    
}
