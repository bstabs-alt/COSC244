import java.util.*;
import java.io.*;

public class frequency_words{

    public static void main(String [] args){
        try{
        File file = new File("freq_test.txt");
        Scanner sc = new Scanner(file);
        String s = "";
        int freq = 1;
        ArrayList<String> words = new ArrayList<String>();     

        while(sc.hasNextLine()){
            s += sc.nextLine();           
        }
        s = s.replace(".", " ");
        s = s.toLowerCase();
        words.addAll( Arrays.asList(s.split(" ")));
        Collections.sort(words);
        String temp = "";
        for(int i = 0; i < words.size()-1; i++){
            temp = words.get(i);
            while(words.get(i) == temp && i < words.size()){
                freq++;
                words.remove(i);
            }
            System.out.println(freq + " " + words.get(i));
                freq = 1;
        }
        } catch(IOException ex){
            System.out.println("ERROR");
        }
        System.exit(1);
    }       
}
