import org.junit.Test;

public class ContTest {

    @Test
    public void testCont(){
        Cont cont = new Cont(45487,659.6);
        cont.setAnualInterestRate(10);
        Cont cont1 = new Cont(45488, 452.3);
        
        System.out.println(cont.getAnualInterestRate());
        cont1.getMonthlyInterestRate();
        cont.getMonthlyInterestRate();
    }
}
