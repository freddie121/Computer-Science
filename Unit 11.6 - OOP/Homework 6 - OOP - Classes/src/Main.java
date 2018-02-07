class Member{
    private int annualFee;
    private String surname;
    private String firstname;
    public Member(){}
    public Member (String myFirstname, String mySurname, int myAnnualFee){
        surname = mySurname;
        firstname = myFirstname;
        annualFee = myAnnualFee;
    }
    public void amendDetails (String myFirstname, String mySurname, int myAnnualFee){
        surname = mySurname;
        firstname = myFirstname;
        annualFee = myAnnualFee;
    }
}

class JuniorMember extends Member{

}

public class Main {
    public static void main(String[] args) {
        Member sue = new Member("Sue", "Barker", 20);
        sue.getClass();
    }
}
