import java.util.*;
class Grade {

    private double math, science, hindi, english, marathi, evs;

    public Grade() {
    }

    void printMarks() {
        System.out.println(" English" + english);
        System.out.println(" Marathi" + marathi);
        System.out.println(" hindi" + hindi);
        System.out.println(" Math" + math);
        System.out.println(" Science" + science);
        System.out.println(" EVS" + evs);
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getScience() {
        return science;
    }

    public void setScience(double science) {
        this.science = science;
    }

    public double getHindi() {
        return hindi;
    }

    public void setHindi(double hindi) {
        this.hindi = hindi;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getMarathi() {
        return marathi;
    }

    public void setMarathi(double marathi) {
        this.marathi = marathi;
    }

    public double getEvs() {
        return evs;
    }

    public void setEvs(double evs) {
        this.evs = evs;
    }

}



public class GradeCal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to student Grade calculator");
        System.out.println("Enter you Name");
        String name = sc.next();
        System.out.println("Hey!!  " + name + " Welcome to Grade Calculator");

        System.out.println("Enter your English Marks");
        double englishGrade = sc.nextDouble();

        System.out.println("Enter your  Marathi Marks");
        double marathiGrade = sc.nextDouble();

        System.out.println("Enter your  Hindi Marks");
        double hindiGrade = sc.nextDouble();

        System.out.println("Enter your  Math Marks");
        double mathGrade = sc.nextDouble();

        System.out.println("Enter your  Science Marks");
        double scienceGrade = sc.nextDouble();

        System.out.println("Enter your  EVS Marks");
        double evsGrade = sc.nextDouble();

        sc.close();
        Grade marksObtain = new Grade();
        marksObtain.setEnglish(englishGrade);
        marksObtain.setMarathi(marathiGrade);
        marksObtain.setHindi(hindiGrade);
        marksObtain.setMath(mathGrade);
        marksObtain.setScience(scienceGrade);
        marksObtain.setEvs(evsGrade);

        marksObtain.printMarks();

    }}

