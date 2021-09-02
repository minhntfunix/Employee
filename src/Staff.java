import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Staff {
    //Mã ứng viên, Họ, Tên, Ngày sinh, Địa chỉ, Điện thoại, Email và Loại ứng viên
    protected String ID;
    protected String lastName;
    protected String firstName;
    protected int DOB;
    protected String address;
    protected String phoneNum;
    protected String email;
    protected int type;

    public Staff(String ID, String lastName, String firstName, int DOB, String address, String phoneNum, String email, int type) {
        this.ID = ID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.DOB = DOB;
        this.address = address;
        this.phoneNum = phoneNum;
        this.email = email;
        this.type = type;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        firstName = firstName;
    }

    public int getDOB() {
        return DOB;
    }

    public void setDOB(int DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getType() { return type; }
}
