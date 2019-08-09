package aa.bb.multithread;

/**
 * Created by sysadmin on 8/8/19.
 */
public class Mainclass {
    public static void main(String[] args) {
        Bank bank = new Bank();
        PersonA a = new PersonA(bank, "Counter");
        PersonB b = new PersonB(bank, "ATM");
        a.start();
        b.start();
    }
}
