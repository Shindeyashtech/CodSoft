1.**Import Statements:**

-import java.util.*;

-This imports all classes from the `java.util` package, including `Scanner`, which is used for user input.

2.**Grade Class:**

-class Grade {

-This class represents the grades of a student.

    -private int math, science, hindi, english, marathi, evs;

-These private integer variables store the marks of the student in different subjects.
    
    -public Grade() {}

-This constructor initializes objects of the `Grade` class.

    -void printMarks() {
-This method prints the marks obtained in each subject.
        System.out.print(" \n|| English : 100/" + english + " ||");
        System.out.print(" Marathi : 100/" + marathi + " ||");
        System.out.print(" Hindi : 100/" + hindi + " ||");
        System.out.print(" Math : 100/" + math + " ||");
        System.out.print(" Science : 100/" + science + " ||");
        System.out.print(" EVS : 100/" + evs + " ||\n");
-These lines print the marks obtained in each subject in the format `Subject : 100/Marks`.
    -public int getMath() {
        return math; }
- This method returns the marks obtained in the Math subject.
    -public void setMath(int math) {
        this.math = math; }
- This method sets the marks obtained in the Math subject.
    // Similar getter and setter methods are provided for other subjects (Science, Hindi, English, Marathi, EVS)
-Getter and setter methods provide access to the private fields of the `Grade` class.
3.**GradeCalculator Class:**
-class GradeCalculator {
-This class is used to calculate the total and average marks.
    -Grade grade = new Grade();
This line creates an instance of the `Grade` class.
    -public int calculateTotalMarks(Grade grade) {
     return grade.getEnglish() + grade.getMarathi() + grade.getHindi() + grade.getMath() + grade.getScience() + grade.getEvs();}
    -public int calculateAverageMarks(Grade grade) {
     return calculateTotalMarks(grade) / 6;} // assuming there are 6 subjects
    // Methods to calculate total and average marks
-These methods calculate the total and average marks obtained by the student.
4.**Grades Class:**
-class Grades {
-This class determines the grade based on the average marks.
    // Method to determine grade based on average marks
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
-This method takes the average marks as input and returns the corresponding grade.
5.**Main Class (GradeCal):**
-public class GradeCal {
-This class contains the `main` method and serves as the entry point of the program.
        -Scanner sc = new Scanner(System.in);
-This line creates a `Scanner` object to read user input from the console.
- Prompting user to enter name and marks for each subject
       -System.out.println("Welcome to Student Grade Calculator");
        System.out.println("Enter you Name : ");
        String name = sc.nextLine();
        -int englishGrade, marathiGrade, hindiGrade, mathGrade, scienceGrade, evsGrade;
-This section prompts the user to enter their name and marks for each subject.
       - Grade marksObtain = new Grade();
        marksObtain.setEnglish(englishGrade);
        marksObtain.setMarathi(marathiGrade);
        marksObtain.setHindi(hindiGrade);
        marksObtain.setMath(mathGrade);
        marksObtain.setScience(scienceGrade);
        marksObtain.setEvs(evsGrade);
        // Creating an instance of the Grade class and setting marks
-This section creates an instance of the `Grade` class and sets the marks obtained in each subject.
        -GradeCalculator g1Calculator = new GradeCalculator();
        int total = g1Calculator.calculateTotalMarks(marksObtain);
        double average = (double) g1Calculator.calculateAverageMarks(marksObtain);
        // Calculating total and average marks
-This section calculates the total and average marks obtained by the student.
-This section determines the grade based on the average marks obtained.
        - Grades g = new Grades();
        String showGrade = g.useAverage(average);
        // Determining grade based on average marks
        switch (showGrade) {
        case "A", "B", "C", "D", "E" ->System.out.println("\nDear " + name + ", After careful evaluation, Your final grade for the course is : [ "+ showGrade + " ], Indicating Successful Completion.\n");
        default -> System.out.println("\nDear " + name + ", \nAfter careful Evaluation, Your final grade for the course is : ["+ showGrade + "], Indicating that you did not meet the passing criteria.\n"); }
        // Printing final grade
-This section prints the final grade for the student.
        public static int getValidMarks(Scanner sc, String subject) {
        int marks;
        do {
        System.out.println("Enter your " + subject + " Marks:");
        marks = sc.nextInt();
        if (marks < 1 || marks > 100) {
         System.out.println("Marks should be between 1 and 100. Please re-enter.");}
        } while (marks < 1 || marks > 100);
        return marks;}
    // Method to ensure valid marks input (between 1 and 100)
This method ensures that the entered marks for each subject are between 1 and 100.
6.**Resource Cleanup:**
        sc.close();
This line closes the `Scanner` object to release system resources.
