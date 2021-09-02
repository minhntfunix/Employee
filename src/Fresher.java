public class Fresher extends Staff {
    private String GradDate;
    private String GradRank;
    private String Education;


    public Fresher(String ID, String lastName, String firstName, int DOB, String address, String phoneNum, String email, int type, String gradDate, String gradRank, String education) {
        super(ID, lastName, firstName, DOB, address, phoneNum, email, type);
        GradDate = gradDate;
        GradRank = gradRank;
        Education = education;
    }

    public String getGradDate() {
        return GradDate;
    }

    public String getGradRank() {
        return GradRank;
    }

    public String getEducation() {
        return Education;
    }


}
