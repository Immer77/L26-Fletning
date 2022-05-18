package opgave1;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Customer c1 = new Customer("Anders", 24);
        Customer c2 = new Customer("Bent", 24);
        Customer c3 = new Customer("Erik", 24);
        Customer c4 = new Customer("Frederik", 24);
        Customer c5 = new Customer("Hans", 24);
        Customer c6 = new Customer("Morten", 24);
        Customer c7 = new Customer("Niels", 24);
        Customer c8 = new Customer("Peter", 24);

        // 2nd list
        Customer cu1 = new Customer("Charlotte", 24);
        Customer cu2 = new Customer("Dennis", 24);
        Customer cu3 = new Customer("Søren", 24);

        ArrayList<Customer> s1 = new ArrayList<>(Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8));

        ArrayList<Customer> s2 = new ArrayList<>(Arrays.asList(cu1,cu2,cu3));

        System.out.println(fletAlleKunder(s1, s2));

    }

    public static ArrayList fletAlleKunder(ArrayList<Customer> s1, ArrayList<Customer> s2){
        ArrayList<Customer> customers = new ArrayList<>();
        int j = 0;
        int i = 0;
        while (j < s1.size() && i < s2.size()){
            Customer e1 = s1.get(j);
            Customer e2 = s2.get(i);
            if(e1.compareTo(e2) < 0){
                customers.add(e1);
                j++;
            }else{
                customers.add(e2);
                i++;
            }
        }
        while (j < s1.size()){
            customers.add(s1.get(j));
            j++;
        }
        while (i < s2.size()){
            customers.add(s2.get(i));
            i++;
        }
        return customers;
    }
}
