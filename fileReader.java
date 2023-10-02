import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

class Student
{
    String lastName;
    String firstName;
    int studentId;
    double a1Mark;
    double a2Mark;
    double a3Mark;
    double totalMarks;
    
    public Student (String lastName,String firstName,int studentId,double a1Marks,double a2Marks,double a3Marks){
        this.lastName = lastName;
        this.firstName = firstName;
        this.studentId = studentId;
        this.a1Mark = a1Mark;    
        this.a2Mark = a2Mark;
        this.a3Mark = a3Mark;
        this.calculateTotalMarks();
    }
    
    public void calculateTotalMarks(){
        this.totalMarks = this.a1Mark + this.a2Mark + this.a3Mark;
    }
    public double getTotalMarks(){
        return this.totalMarks;
    }
    @Override
    public String toString(){
        return "Student("+ " Last name; "+this.lastName+ " First name; "+this.firstName+" Total marks; "+totalMarks;
    }
}
public class fileReader{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String fileName;
        ArrayList<Student> students = new ArrayList<>();
        System.out.print("Enter the file name: ");
        fileName = scanner.nextLine();
        
    }
    
    public static void readFromFile(String fileName, ArrayList<Student> students) throws java.io.IOException {
        String line;
        String splitBy = ",";
        students.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            br.readLine();
            br.readLine();
        }  
class threshold{
    public static List<Student> getStudentsBelowThreshold(List<Student> students, int threshold) {             
   List<Student> studentsBelowThreshold = new ArrayList<>();
  for (Student student : students) {
    int totalMark = 0;
    for (int mark : student.getAssessmentMarks()) {
      totalMark += mark;
    }
    if (totalMark < threshold) {
      studentsBelowThreshold.add(student);
    }
  }
  return studentsBelowThreshold;
}
    }
class List{
public static List<Student> getTop5Students(List<Student> students) {
  List<Student> top5Students = new ArrayList<>();
  for (Student student : students) {
    int totalMark = 0;
    for (int mark : student.getAssessmentMarks()) {
      totalMark += mark;
    }
    if (top5Students.size() < 5) {
      top5Students.add(student);
      top5Students.sort((s1, s2) -> Integer.compare(s2.getTotalMark(), s1.getTotalMark()));
    } else if (totalMark > top5Students.get(0).getTotalMark()) {
      top5Students.remove(0);
      top5Students.add(student);
      top5Students.sort((s1, s2) -> Integer.compare(s2.getTotalMark(), s1.getTotalMark()));
    
  }
  return top5Students;
}
class Scanner{
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int selection;
  do {
    System.out.println("Main Menu");
    System.out.println("1. Calculate total marks");
    System.out.println("2. Print students with total marks less than a threshold");
    System.out.println("3. Print top 5 students with the highest total marks");
    System.out.println("4. Print top 5 students with the lowest total marks");
    System.out.println("5. Exit");
    selection = scanner.nextInt();
    switch (selection) {
      case 1:
        calculateTotalMarks(students);
        break;
      case 2:
        printStudentsBelowThreshold(students);
        break;
      case 3:
        printTop5StudentsWithHighestTotalMarks(students);
        break;
      case 4:
        printTop5StudentsWithLowestTotalMarks(students);
        break;
      case 5:
        System.out.println("Goodbye!");
        System.exit(0);
    }
  } while (selection != 5);
}