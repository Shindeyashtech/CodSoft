import java.util.*;

class Grade {

    private int math, science, hindi, english, marathi, evs;

    public Grade() {
    }

    void printMarks() {

        System.out.print("|| English :" + english+" ||");
        System.out.print(" Marathi :" + marathi+" ||");
        System.out.print(" Hindi :" + hindi+" ||");
        System.out.print(" Math :" + math+" ||");
        System.out.print(" Science :" + science+" ||");
        System.out.print(" EVS :" + evs+" ||");
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getHindi() {
        return hindi;
    }

    public void setHindi(int hindi) {
        this.hindi = hindi;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMarathi() {
        return marathi;
    }

    public void setMarathi(int marathi) {
        this.marathi = marathi;
    }

    public int getEvs() {
        return evs;
    }

    public void setEvs(int evs) {
        this.evs = evs;
    }

}

class GradeCalculator {

    Grade grade = new Grade();

    public int calculateTotalMarks(Grade grade) {
        return grade.getEnglish() + grade.getMarathi() + grade.getHindi() + grade.getMath() + grade.getScience()
                + grade.getEvs();
    }

    public int calculateAverageMarks(Grade grade) {
        return calculateTotalMarks(grade) / 6; // assuming there are 6 subjects
    }
}

class Grades {
    // public Object useAverage;

    public String useAverage(double getAverage) {
        if (getAverage >= 90) {
            return "A";
        } else if (getAverage >= 80) {
            return "B";
        } else if (getAverage >= 70) {
            return "C";
        } else if (getAverage >= 60) {
            return "D";
        } else if (getAverage >= 35) {
            return "E";
        } else {
            return "F";
        }
    }
}

public class GradeCal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Student Grade calculator");
        System.out.println("Enter you Name");
        String name = sc.nextLine();
        System.out.println("\nHey!!  " + name + " Please Enter Your Marks\n");

        int englishGrade, marathiGrade, hindiGrade, mathGrade, scienceGrade, evsGrade;

        englishGrade = getValidMarks(sc, "English");
        marathiGrade = getValidMarks(sc, "Marathi");
        hindiGrade = getValidMarks(sc, "Hindi");
        mathGrade = getValidMarks(sc, "Math");
        scienceGrade = getValidMarks(sc, "Science");
        evsGrade = getValidMarks(sc, "EVS");

        sc.close();
        Grade marksObtain = new Grade();
        marksObtain.setEnglish(englishGrade);
        marksObtain.setMarathi(marathiGrade);
        marksObtain.setHindi(hindiGrade);
        marksObtain.setMath(mathGrade);
        marksObtain.setScience(scienceGrade);
        marksObtain.setEvs(evsGrade);

        marksObtain.printMarks();

        GradeCalculator g1Calculator = new GradeCalculator();
        int total = g1Calculator.calculateTotalMarks(marksObtain);
        double average = (double) g1Calculator.calculateAverageMarks(marksObtain);


        System.out.println("Your total marks for the 12th Class are : " + total +", Representing your overall performance throughout the academic year." );
        
        System.out.println("Your cumulative Average for the 12th Class is : " + average + "%" + ", Encompassing all assessments throughout the academic year.");
        

        Grades g = new Grades();
          String showGrade= g.useAverage(average);
          


          switch (showGrade) {
            case "A","B","C","D","E" -> System.out.println("Dear Student,"+name+" After careful evaluation, Your final grade for the course is :"+showGrade+", Indicating Successful Completion.");
    
            default ->  System.out.println("Dear Student,"+name+" After careful evaluation, Your final grade for the course is :"+showGrade+", Indicating that you did not meet the passing criteria.");
            
          }
    }
    public static int getValidMarks(Scanner sc, String subject) {
        int marks;
        do {
            System.out.println("Enter your " + subject + " Marks:");
            marks = sc.nextInt();
            if (marks < 1 || marks > 100) {
                System.out.println("Marks should be between 1 and 100. Please re-enter.");
            }
        } while (marks < 1 || marks > 100);
        return marks;
    }
}
