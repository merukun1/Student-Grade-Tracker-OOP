package StudentGradeTracker;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int studentId;
    private List<Course> courses;
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public int getStudentId() {
        return studentId;
    }
    public List<Course> getCourses() {
        return courses;
    }
    public void AddCourse(Course course){
        courses.add(course);
    }
    public void RemoveCourse(Course course){
        courses.remove(course);
    }
    public double CalculateGPA(){
        double totalCredits = 0.0;
        double totalQualityPoints = 0.0;
        for (Course course : courses) {
            double creditHours = course.getCreditHours();
            double gradePoints = course.calculateGradePoints();
            totalCredits += creditHours;
            totalQualityPoints += creditHours * gradePoints;
        }
        return totalQualityPoints / totalCredits;
    }
    public String generateTranscript() {
        StringBuilder transcript = new StringBuilder();
        transcript.append(String.format("Transcript for %s (ID: %d)\n\n", name, studentId));
        System.out.println("College Course: "+Course.Ccourse);
        for (Course course : courses) {
          transcript.append(String.format("%s: %.2f (%s)\n", course.getName(), course.calculateGradePoints(), course.getLetterGrade()));
        }
        transcript.append(String.format("\nGPA: %.2f", CalculateGPA()));
        return transcript.toString();
      }
    
}
