public class Commission extends Hourly
{
    private double commisionRate;
    private double totalSales= 0;

    public Commission(String eName, String eAddress, String ePhone,
                      String socSecNumber, double rate, double CommissionRate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        commisionRate = CommissionRate;
    }

    public void addSales(double totalSales)
    {
        this.totalSales += totalSales;

    }

    public double pay()
    {
        double payment = super.pay() + totalSales*commisionRate ;
        totalSales =0;

        return payment;
    }

    public String toString()
    {
        String result = super.toString();

        result += "\nTotal Sales: " + totalSales;

        return result;
    }
}
