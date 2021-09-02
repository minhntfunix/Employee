public class Intern extends Staff{
    //Chuyên ngành, Học kỳ, Tên trường đại học
    private String major;
    private String semester;
    private String school;


    public Intern(String ID, String lastName, String firstName, int DOB, String address, String phoneNum, String email, int type, String major, String semester, String school) {
        super(ID, lastName, firstName, DOB, address, phoneNum, email, type);
        this.major = major;
        this.semester = semester;
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public String getSemester() {
        return semester;
    }

    public String getSchool() {
        return school;
    }


}
