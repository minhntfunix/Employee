import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDate;
import java.util.*;

public class Operation {



    public static void AddEmployee(ArrayList<Staff>list){
        Scanner input= new Scanner (System.in);
        System.out.print("Input ID: ");
        String ID= input.nextLine();

        System.out.print("Input Last Name: ");
        String lastName= input.nextLine();

        System.out.print("Input First Name: ");
        String firstName= input.nextLine();
        int year=0;
        while(true) {
            System.out.print("Input DOB: ");
            //ktra tính hợp lệ của DOB
            if (input.hasNextInt()) {
                year = input.nextInt();
                if (isValidDOB(year)) {
                    break;
                } else {
                    System.out.println("DOB must be between 1990 and current year. Enter again:");
                    }
            }else{
                System.out.println("Must enter number between 1990 and current year.");
                input.nextLine();
            }
        }
        input.nextLine();
        System.out.print("Input Address: ");
        String address= input.nextLine();

        String phone;
        do {
            //ktra tính hợp lệ của phone number
            System.out.print("Input phone number: ");
            phone= input.nextLine();
            if (isValidPhoneNum(phone)) {
                break;
            } else{
                System.out.println("Phone number must be at least 10 digits. Enter again:");
            }
        }while(true);

        String email;
        do {
            //ktra tính hợp lệ của email
            System.out.print("Input email: ");
            email= input.nextLine();
            if (isValidEmail(email)) {
                break;
            } else{
                System.out.println("Email form is not valid. Enter again:");
            }
        }while(true);

        int expYear;
        do {

            //ktra tính hợp lệ của experience year
            System.out.print("Input years of experience: ");
            expYear= input.nextInt();

            if (expYear<=100 && expYear>=0 ) {
                break;
            } else{
                System.out.println("Years of experience must be between 0 and 100.Enter again");
            }
        }while(true);
        input.nextLine();
        System.out.print("Enter Professional Skill: ");
        String skill= input.nextLine();

        list.add(new Employee(ID,lastName,firstName,year,address,phone,email,0,expYear,skill));


    }

    public static void AddFresher(ArrayList<Staff>list) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input ID: ");
        String ID = input.nextLine();

        System.out.print("Input Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Input First Name: ");
        String firstName = input.nextLine();
        int year;
        while(true) {
            System.out.print("Input DOB: ");
            //ktra tính hợp lệ của DOB
            if (input.hasNextInt()) {
                year = input.nextInt();
                if (isValidDOB(year)) {
                    break;
                } else {
                    System.out.println("DOB must be between 1990 and current year. Enter again:");
                }
            }else{
                System.out.println("Must enter number between 1990 and current year.Enter again");
                input.nextLine();
            }
        }
        input.nextLine();
        System.out.print("Input Address: ");
        String address = input.nextLine();
        String phone;
        do {
            System.out.print("Input phone number: ");
            phone = input.nextLine();
            if (isValidPhoneNum(phone)) {
                break;
            } else {
                System.out.println("Phone number must be at least 10 digits. Enter again:");
            }
        } while (true);
        String email;
        do {
            System.out.print("Input email: ");
            email = input.nextLine();
            if (isValidEmail(email)) {
                break;
            } else {
                System.out.println("Email form is not valid. Enter again.");
            }
        } while (true);
        //thời gian tốt nghiệp (Graduation_date),
        // Xếp hạng tốt nghiệp (Graduation_rank) và
        // trường đại học sinh viên đã tốt nghiệp (Education)
        String gradDate;
        do {
            System.out.print("Enter Graduate Date: ");
            gradDate = input.nextLine();
            if (validate(gradDate)) {
                break;
            } else {
                System.out.println("Must enter correct date format(dd/mm/yyyy). Enter again.");
            }
        } while (true);
        String rank;
        do {
            System.out.print("Enter Graduate Rank: ");
            rank = input.nextLine();
            if (isValidRank(rank)) {
                break;
            } else {
                System.out.println("Must enter \"Excellent/Great/Good/Poor\" .Enter again.");
            }
        } while (true);

        System.out.print("Enter name of univesity : ");
        String uni= input.nextLine();

        // Mã ứng viên, Họ, Tên, Ngày sinh, Địa chỉ, Điện thoại, Email
        list.add(new Fresher(ID, lastName, firstName, year, address, phone, email,1, gradDate,rank, uni));


    }


    public static void AddIntern(ArrayList<Staff>list) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input ID: ");
        String ID = input.nextLine();

        System.out.print("Input Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Input First Name: ");
        String firstName = input.nextLine();
        int year;
        while(true) {
            System.out.print("Input DOB: ");
            //ktra tính hợp lệ của DOB
            if (input.hasNextInt()) {
                year = input.nextInt();

                if (isValidDOB(year)) {
                    break;
                } else {
                    System.out.println("DOB must be between 1990 and current year. Enter again");
                }
            }else{
                System.out.println("Must enter number between 1990 and current year.Enter again");
                input.nextLine();
            }
        }
        input.nextLine();
        System.out.print("Input Address: ");
        String address = input.nextLine();
        String phone;
        do {
            System.out.print("Input phone number: ");
            phone = input.nextLine();
            if (isValidPhoneNum(phone)) {
                break;
            } else {
                System.out.println("Phone number must be at least 10 digits. Enter again:");
            }
        } while (true);
        String email;
        do {
            System.out.print("Input email: ");
            email = input.nextLine();
            if (isValidEmail(email)) {
                break;
            } else {
                System.out.println("Email form is not valid. Enter again.");
            }
        } while (true);
        //Chuyên ngành, Học kỳ, Tên trường đại học
        System.out.print("Input the major: ");
        String major = input.nextLine();
        System.out.print("Input the semester: ");
        String semester= input.nextLine();
        System.out.print("Enter name of univesity : ");
        String uni= input.nextLine();

        // Mã ứng viên, Họ, Tên, Ngày sinh, Địa chỉ, Điện thoại, Email
        list.add(new Intern(ID, lastName, firstName, year, address, phone, email,2, major,semester, uni));

    }


    public static void Search(ArrayList<Staff>list){
        if (list.size()==0){
            System.out.println("There is no data. Please enter info.");
            return;
        }

        for (Staff i:list){
            if (i.getType()==0){
                System.out.println("===========ỨNG VIÊN CÓ KINH NGHIỆM============");
                System.out.printf("%s %s\n", i.getLastName(), i.getFirstName());
            }
        }
        for (Staff i:list){
            if (i.getType()==1){
                System.out.println("===========ỨNG VIÊN FRESHER============");
                System.out.printf("%s %s\n", i.getLastName(), i.getFirstName());
            }
        }
        for (Staff i:list){
            if (i.getType()==2){
                System.out.println("===========THỰC TẬP SINH============");
                System.out.printf("%s %s\n", i.getLastName(), i.getFirstName());
            }
        }

        System.out.print("Enter name to search: ");
        Scanner input= new Scanner (System.in);
        String search= input.nextLine();
        System.out.print("Staff category: ");
        int type= input.nextInt();
        input.nextLine();
        boolean x=false;
        //Tên thí sinh (Họ + Tên), Ngày sinh, Địa chỉ, Điện thoại, Email và Loại thí sinh
        for (Staff i:list){
            if (i.getFirstName().contains(search) || i.getLastName().equalsIgnoreCase(search))  {
                if (type==i.getType()) {
                    System.out.printf("%s %s| %d | %s | %s | %s | %d\n", i.getLastName(), i.getFirstName(), i.getDOB(), i.getAddress(), i.getPhoneNum(), i.getEmail(), i.getType());
                    x = true;
                }
            }
        }

        if (x==false){
            System.out.println("This name doesn't exist");
        }
    }



    //Hàm ktra tính hợp lệ của phone number, ít nhất 10 chữ số
    private static boolean isValidPhoneNum(String num){

        String regex = "^\\d{10,}$";
        Pattern p = Pattern.compile(regex);
        if (num == null)
        {
            return false;
        }

        Matcher m = p.matcher(num);
        return m.matches();
    }

    //Hàm ktra tính hợp lệ của DOB
    private static boolean isValidDOB(int year)
    {

        LocalDate currentDate = LocalDate.now();
        return (year>=1990 && year<=currentDate.getYear());
    }

    //Hàm ktra tính hợp lệ của email
    private static boolean isValidEmail(String email)
    {

        String regex = "^[\\w-_\\.]+\\@([\\w]+\\.)+[\\w]+[\\w]$";

        // If the string is empty
        // return false
        if (email == null)
        {
            return false;
        }
        return email.matches(regex);
    }

    //Hàm ktra format date
        public static boolean validate(String s) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            try {
                formatter.parse(s);
                return true;
            } catch (Exception e) {
                return false;
            }
        }

        //Hàm ktra input của xếp loại Tốt nghiệp
        public static boolean isValidRank(String s){
        String []a={"Excellent","Great", "Good", "Poor" };
            for ( String i:a){
                if (s.equals(i)){
                    return true;
                }
            }
            return false;
        }
}
