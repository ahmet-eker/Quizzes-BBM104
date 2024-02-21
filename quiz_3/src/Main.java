import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileOutput writer = new FileOutput();
        String allowedchars = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuopasdfghjklizxcvbnm ";
        try {
            File inputFile = new File(args[0]);
            Scanner scanner = new Scanner(inputFile);
            if(!(args.length==1)){
                throw new NewException("There should be only 1 paremeter");
            }
            if(scanner.hasNext()){
                String inputfile = scanner.nextLine();
                if(!containsOtherChars(inputfile,allowedchars)) {
                    writer.writeToFile("output.txt", "The program is running correctly", true, true);
                }
                else{
                    throw new NewException("The input file should not contains unexpected characters");
                }
            }
            else{
                throw new NewException("The input file should not be empty");
            }
        } catch (FileNotFoundException e) {
            writer.writeToFile("output.txt","There should be an input file in the specified path",true,true);
        } catch (NewException e){
            writer.writeToFile("output.txt", e.getMessage(), true,true);
        }
    }

    public static boolean containsOtherChars(String str, String allowedChars) {
        for (char c : str.toCharArray()) {
            if (allowedChars.indexOf(c) == -1) {
                return true;
            }
        }
        return false;
    }
}
