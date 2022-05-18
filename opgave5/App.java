package opgave5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String filename1 = ".\\L26-Fletning\\src\\opgave5\\heltalfil1.txt";
        String filename2 = ".\\L26-Fletning\\src\\opgave5\\heltalfil2.txt";
        String filenameNy = ".\\L26-Fletning\\src\\opgave5\\heltalfilNy.txt";

        try {
            fletAlleHeltal(filename1,filename2,filenameNy);
        }catch (FileNotFoundException ie){
            System.out.println("Filen blev ikke fundet");
        }


    }
    public static void fletAlleHeltal(String filename1, String filename2, String filenameNy) throws FileNotFoundException {
        Scanner in1 = new Scanner(new File(filename1));
        Scanner in2 = new Scanner(new File(filename2));
        PrintWriter pw = new PrintWriter(filenameNy);

        int k = in1.nextInt();
        int j = in2.nextInt();

        while (k != Integer.MAX_VALUE && j != Integer.MAX_VALUE){
            if(k < j){
                pw.println(k);
                k = in1.nextInt();
            }else if(k > j){
                pw.println(j);
                j = in2.nextInt();
            }else {
                pw.println(k);
                pw.println(j);
                k = in1.nextInt();
                j = in2.nextInt();
            }
        }
        in1.close();
        in2.close();
        pw.close();

    }
}
