package A.Ifelse;

public class condition {

    public static void main(String[] args) {

        //System.out.println("Enter the age of candidate" + a1);
    int age = 25;
        if(age==18)
        {
        System.out.println("Candidate is eligible for voting");

    } else if(age>18)
        {
            System.out.println("Candidate is eligible for voting as over 18");

        }
        else
        {
        System.out.println("Candidate is not eligible for voting as under 18");
        }
    }
}
