package aa.bb.multithread;

import java.util.Objects;

/**
 * Created by sysadmin on 8/8/19.
 */
public class Bank {

    static double money = 1000;
    private void Counter(double money){
        Bank.money -= money;
        System.out.println("Counter qu "+money+"yuan, shengyu "+Bank.money);
    }

    private void ATM(double money){
        Bank.money -= money;
        System.out.println("ATM qu "+money+"yuan , shengyu "+Bank.money);

    }

    public synchronized void outMoney(double money,String mode) throws Exception {

        if(money > Bank.money){
            throw new Exception("余额不足");
        }
        if(Objects.equals(mode,"ATM")){
            ATM(money);

        }else {
            Counter(money);
        }

    }








}
