//Implement your own encapsulating classes

class StudentDetails{
    private String name;
    private String email;
    private String phone_no;

    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhone(String phone){
        this.phone_no = phone;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone(){
        return phone_no;
    }
}

public class Q2 {
    public static void main(String[] args) { 
        StudentDetails db = new StudentDetails();
        db.setName("Sanket Puhan");
        db.setEmail("sanketpuhan@gmail.com");
        db.setPhone("123427895");
        System.out.println("Name : "+db.getName());
        System.out.println("Email : "+db.getEmail());
        System.out.println("Phone : "+db.getPhone());
    }
}
