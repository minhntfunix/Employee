public class Employee extends Staff{
    private int ExpInYear;
    private String ProSkill;

    public Employee(String ID, String lastName, String firstName, int DOB, String address, String phoneNum, String email, int type, int expInYear, String proSkill) {
        super(ID, lastName, firstName, DOB, address, phoneNum, email, type);
        ExpInYear = expInYear;
        ProSkill = proSkill;
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }


}
