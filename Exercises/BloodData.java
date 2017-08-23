public class BloodData
{
    private String bloodType;
    private char bloodFactor;
    public BloodData()
    {
        bloodType = "O";
        bloodFactor = '+';
    }
    public BloodData(String type, char factor)
    {
        bloodType = type;
        bloodFactor = factor;
    }
    public void getBloodType()
    {
        System.out.println("Blood type is " + bloodType);
    }
    public void getBloodFactor()
    {
        System.out.println("Blood factor is " + bloodFactor);
    }
    public void setBloodType(String type)
    {
        bloodType = type;
    }
    public void setBloodFactor(char factor)
    {
        bloodFactor = factor;
    }
}
