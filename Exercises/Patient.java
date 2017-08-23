public class Patient
{
    private int idNumber;
    private BloodData bloodInfo;
    public Patient()
    {
        idNumber = 0;
        bloodInfo = new BloodData();
    }
    public Patient(int id, String bloodType, char bloodFactor)
    {
        idNumber = id;
        bloodInfo = new  BloodData(bloodType, bloodFactor);
    }
    public void getIDNumber()
    {
        System.out.println("ID: " + idNumber);
    }
    public void getBloodInfo()
    {
        bloodInfo.getBloodType();
        bloodInfo.getBloodFactor();
    }
    public void setIdNumber(int id)
    {
        idNumber = id;
    }
    public void setBloodInfo(String type, char factor)
    {
        bloodInfo.setBloodType(type);
        bloodInfo.setBloodFactor(factor);
    }
}
