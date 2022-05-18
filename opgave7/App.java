package opgave7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String filename = ".\\L26-Fletning\\src\\opgave7\\personer.txt";

        try {
            System.out.println(linFileSearchPerson(filename, "Hansen"));
        }catch (FileNotFoundException fe){
            System.out.println(fe.getMessage());
        }
    }
    public static String linFileSearchPerson(String filename, String target) throws FileNotFoundException {
        Scanner in1 = new Scanner(new File(filename));
        String result = null;
        boolean found = false;
        while (!found && in1.hasNext()){
            String temp[] = in1.nextLine().split(" ");
            if(temp[2].equalsIgnoreCase(target)){
                result = temp[1] + " " +temp[2];
                found = true;
            }
        }
        return result;
    }
}
