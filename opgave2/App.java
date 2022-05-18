package opgave2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        int[] s1 = {2, 4, 6, 8, 10, 12, 14};
        int[] s2 = {1, 2, 4, 5, 6, 9, 12, 17};
        System.out.println(fællesTal(s1, s2));


    }
    public static ArrayList<Integer> fællesTal(int[] s1, int[] s2){
        ArrayList<Integer> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;
        while (i1 < s1.length && i2 < s2.length){
            if(s1[i1] < s2[i2]){
                i1++;
            }else if(s1[i1] > s2[i2]){
                i2++;
            }else{
                result.add(s1[i1]);
                i1++;
                i2++;
            }
        }
        return result;
    }
}
