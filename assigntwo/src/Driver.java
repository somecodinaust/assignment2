import sun.text.normalizer.UCharacter;

public class Driver {

    public static void main(String[] args) {
        String Aplus = "A+", A = "A", Aminus = "A-", Bplus = "B+", B = "B", Bminus = "B-", C = "C", D = "D", E = "E", F = "F";

        double average_grade = 89.5;
        double extra_credit = 5.3;
        double full_grade = (average_grade + extra_credit);

        if (full_grade >= 100)
            System.out.println(Aplus + " with a percentage of " + full_grade + "%.");
        else if (full_grade > 97.5)
            System.out.println(A + " with a percentage of " + full_grade + "%.");
        else if (full_grade > 95)
            System.out.println(Aminus + " with a percentage of " + full_grade + "%.");
        else if (full_grade > 90)
            System.out.println(Bplus + " with a percentage of " + full_grade + "%.");
        else if (full_grade > 85)
            System.out.println(B + " with a percentage of " + full_grade + "%.");
        else if (full_grade > 80)
            System.out.println(Bminus + " with a percentage of " + full_grade + "%.");
        else if (full_grade > 70)
            System.out.println(C + " with a percentage of " + full_grade + "%.");
        else if (full_grade > 60)
            System.out.println(D + " with a percentage of " + full_grade + "%.");
        else if (full_grade > 50)
            System.out.println(E + " with a percentage of " + full_grade + "%.");
        else if (full_grade >= 0)
            System.out.println(F + " with a percentage of " + full_grade + "%.");
        else
            System.out.println("Error. Re-enter Results.");
    }
}