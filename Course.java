package StudentGradeTracker;

import java.util.ArrayList;
import java.util.List;

public class Course{
    private String name;
    static String Ccourse;
    private int creditHours;
    private List<Grade> grades;

    public Course(String Ccourse, String name, int creditHours) {
        this.name = name;
        this.creditHours = creditHours;
        this.Ccourse = Ccourse;
        this.grades = new ArrayList<>();
    }
    public String getCourse() {
        return Ccourse;
    }
    public int getCreditHours() {
        return creditHours;
    }
    public String getName() {
        return name;
    }
    public List<Grade> getGrades() {
        return grades;
    }
    public void AddGrade(Grade grade){
        grades.add(grade);
    }
    public void RemoveGrade(Grade grade){
        grades.remove(grade);
    }
    public double calculateGradePoints(){
        double totalWeight = 0.0;
        double totalScore = 0.0;
        for (Grade grade : grades) {
            totalWeight += grade.getWeight();
            totalScore += grade.getScore() * grade.getWeight();
        }
        return totalScore / totalWeight;
    }
    public String getLetterGrade() {
        double grade = calculateGradePoints();
        if (grade >= 90) {
          return "A";
        } else if (grade >= 80) {
          return "B";
        } else if (grade >= 70) {
          return "C";
        } else if (grade >= 60) {
          return "D";
        } else {
          return "F";
        }
      }
}
