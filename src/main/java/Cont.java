import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Cont {
    private int id = 0;
    private double sold = 0;
    //toate conturile au aceeași rată a dobânzii
    private static double anualInterestRate = 0;
    private LocalDate dateCreated;
    Calendar cal = Calendar.getInstance();

    public Cont() {
        this.dateCreated = LocalDate.now();
    }

    public Cont(int id, double sold) {
        this.dateCreated = LocalDate.now();
        this.id = id;
        this.sold = sold;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public double getAnualInterestRate() {
        return anualInterestRate;
    }

    public void setAnualInterestRate(double anual) {
        anualInterestRate = anual;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void getMonthlyInterestRate() {
        System.out.printf("%.2f\n",anualInterestRate / 1200 * this.sold);
    }
}
