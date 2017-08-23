public class TestBloodData
{
    public static void main(String[] args)
    {
       String type = "AB";
       char factor = '-';
       BloodData bloodOne = new BloodData();
       BloodData bloodTwo = new BloodData(type, factor);
       bloodOne.getBloodFactor();
       bloodOne.getBloodType();
       bloodTwo.getBloodFactor();
       bloodTwo.getBloodType();
       bloodOne.setBloodType(type);
       bloodOne.setBloodFactor(factor);
       bloodOne.getBloodFactor();
       bloodOne.getBloodType();
    }
}
