package opgave6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String filename1 = ".\\L26-Fletning\\src\\opgave6\\heltal1.txt";
        String filename2 = ".\\L26-Fletning\\src\\opgave6\\heltal2.txt";
        String filename3 = ".\\L26-Fletning\\src\\opgave6\\heltalNy.txt";

        try {
            findFællesTal(filename1,filename2,filename3);
        }catch (FileNotFoundException fe){
            System.out.println(fe.getMessage());
        }

    }
    public static void findFællesTal(String filename1, String filename2, String filename3) throws FileNotFoundException {
        Scanner in1 = new Scanner(new File(filename1));
        Scanner in2 = new Scanner(new File(filename2));
        PrintWriter pw = new PrintWriter(filename3);

        int k = in1.nextInt();
        int j = in2.nextInt();

        while (k != Integer.MAX_VALUE && j != Integer.MAX_VALUE){
            if(k < j){
                k = in1.nextInt();
            }else if(k>j){
                j = in2.nextInt();
            }else{
                pw.println(k);
                k = in1.nextInt();
                j = in2.nextInt();
            }
        }
        in1.close();
        in2.close();
        pw.close();
    }
}
