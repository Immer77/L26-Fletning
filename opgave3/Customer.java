package opgave3;

public class Customer implements Comparable<Customer>{
    private String navn;
    private int alder;

    public Customer(String navn, int alder){
        this.navn = navn;
        this.alder = alder;
    }

    @Override
    public int compareTo(Customer o) {
        int comp = navn.compareTo(o.getNavn());
        if(comp == 0){
            comp = alder-o.getAlder();
        }
        return comp;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    @Override
    public String toString(){
        return navn;
    }
}
