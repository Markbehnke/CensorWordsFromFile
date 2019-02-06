import java.io.*;
import java.util.*;

public class Q4 {
    public static void main(String[] args) throws Exception{
        String censoredWord[] = {"ABC", "XYZ"};
        //add code (1)
        File source = new File("./src/source.txt");
        Scanner scan = new Scanner(source);
        PrintWriter writer = new PrintWriter("./src/destination.txt");
        String upperLine = "";
        while(scan.hasNext()){
//Sends it to the replaceCensoredWords method and changes it to uppercase, then compares it to censoredWord array.
            upperLine= replaceCensoredWords(scan.nextLine().toUpperCase(), censoredWord);
            writer.println(upperLine);
        }
        System.out.println("File copy complete!");
        writer.close();
        scan.close();



    }

    private static String replaceCensoredWords(String line, String[] censoredWords) {
//Checks the string to see if it contains a certain string. If it does, it replaces it with "..."

        for(int i = 0 ; i < censoredWords.length ; i++){
            if(line.contains(censoredWords[i])){
                line = line.replaceAll(censoredWords[i] , "...");
            }

        }
return line;
    }
}


