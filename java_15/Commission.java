



public class Commission extends Hourly{

    protected double totalSales;
    protected double commissionRate;


    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comRate) {

        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = comRate;
    }


    public void addSales (double totalSales){

        this.totalSales += totalSales;
    }


    @Override
    public double pay() {

        double totalPay = super.pay() + (totalSales * commissionRate);
        totalSales = 0.0;

        return totalPay;
    }


    @Override
    public String toString() {
        return super.toString() + "\nTotal Sales: " + totalSales;
    }


}


