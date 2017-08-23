public class Billing
{
    public static Double computeBill(double cost)
    {
        double tax = cost * 0.08;
        return cost + tax;
    }
    public static Double computeBill(double cost, int quantity)
    {
        double newCost = cost * quantity;
        double tax = newCost * 0.08;
        return newCost + tax;
    }
    public static Double computeBill(double cost, int quantity, double couponValue) {
        double newCost = ((cost * quantity) * couponValue);
        double tax = newCost * 0.08;
        return newCost + tax;
    }
}
