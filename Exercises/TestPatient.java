public class TestPatient
{
    public static void main(String[] args)
    {
        int id = 120;
        String type = "AB";
        char factor = '-';
        Patient patientOne = new Patient();
        Patient patientTwo = new Patient(id, type, factor);
        patientOne.getIDNumber();
        patientOne.getBloodInfo();
        patientTwo.getIDNumber();
        patientTwo.getBloodInfo();
        patientOne.setIdNumber(id);
        patientOne.setBloodInfo(type, factor);
        patientOne.getIDNumber();
        patientOne.getBloodInfo();
    }
}
