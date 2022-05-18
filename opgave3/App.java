package opgave3;

import opgave1.Customer;

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
        Customer cu1 = new Customer("Bent", 24);
        Customer cu2 = new Customer("Charlotte", 24);
        Customer cu3 = new Customer("Peter", 24);

        ArrayList<Customer> s1 = new ArrayList<>(Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8));

        Customer[] customers = {cu1,cu2,cu3};
        System.out.println(goodCustomers(s1, customers));

    }
    /**
     * Returnerer en sorteret ArrayList der indeholder alle
     * customers fra l1 der ikke er i l2
     * Krav: l1 og l2 er sorterede, indeholder ikke dubletter og
     * indeholder ikke tomme pladser
     */
    public static ArrayList goodCustomers(ArrayList<Customer> s1, Customer[] s2){
        ArrayList<Customer> customers = new ArrayList<>();
        int j = 0;
        int i = 0;
        while (j < s1.size() && i < s2.length){
            Customer e1 = s1.get(j);
            Customer e2 = s2[i];
            if(e1.compareTo(e2) < 0){
                j++;
            }else if(e1.compareTo(e2) > 0){
                i++;
            }else{
                customers.add(e1);
                j++;
                i++;
            }
        }
        return customers;
    }

}
