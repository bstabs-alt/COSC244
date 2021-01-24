import java.io.*;

public class Caesar{

    public static void main(String[] args){
        InputStream in = System.in;
        OutputStream out = System.out;
        int val = 0;
        int count = 0;

        if(args.length > 0){
            try{
                val = Integer.parseInt(args[0]); 
            } catch(NumberFormatException e){
                System.out.print(args[0] + " Integer required");
                System.exit(1);
            }
        }

        try{
            while((count = in.read()) != -1){
                count += val;
                count %= 256;
                out.write(count);
            }
            out.close();
        } catch(IOException e){
            System.out.println("IOException");
        }  
    }
}
