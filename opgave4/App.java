package opgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        String file1 = ".\\L26-Fletning\\src\\opgave4\\talfil.txt";
        try {
            System.out.println(finLineSearch(file1, 29));
        }catch (FileNotFoundException fe){
            System.out.println(fe.getMessage());
        }
    }

    /**
     * Metoden til at tjekke om der findes et target tal i en tekstfil
     * @param fileName
     * @param target
     * @return
     * @throws FileNotFoundException
     */
    public static boolean finLineSearch(String fileName, int target) throws FileNotFoundException {
        // Scanner tekstfilen med det filnavn der er givet i parameteren
        Scanner in = new Scanner(new File(fileName));
        // Boolsk datatype til at tjekke om det er blevet fundet
        boolean found = false;
        // Try-catch fordi det gør vi lige
        try {
            // Så længe vi ikke har fundet vores target && vi i vores fil har en linje mere
            while (!found && in.hasNext()){
                // SOm magrethe snakkede om er det vigtigt at man giver den en værdi ellers når man kalder nextint vil den springe en linje over
                int k = in.nextInt();
                // Hvis k er det samme som det target vi har sat vil found være true og loopet bryder ud
                if(k == target){
                    found = true;
                }
            }
        }catch (InputMismatchException ie){
            throw new RuntimeException("Listen indeholder ikke heltal", ie);
        }finally {
            // Altid husk at lukke filen det er her finally er essential da den altid bliver kørt.
            in.close();
        }
        return found;
    }
}

