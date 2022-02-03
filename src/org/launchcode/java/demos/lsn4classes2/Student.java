package org.launchcode.java.demos.lsn4classes2;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO: Uncomment and complete the getGradeLevel method here:
   public static String getGradeLevel(int credits) {
      // Determine the grade level of the student based on numberOfCredits
       if(credits <= 29){
           return  "Freshman";
       }else if (credits >= 30 && credits <= 59){
           return  "Sophomore";
       }else if (credits >= 60 && credits <= 89){
           return "Junior";
       }else {
           return  "Senior";
       }
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        double totalQualityScore = this.gpa * this.numberOfCredits; //calculate their current total quality score
       // totalQualityScore += courseCredits;
        totalQualityScore += courseCredits * grade; //updating total quality score
        this.numberOfCredits += courseCredits; // add course credits from existing class to total for student
        this.gpa = totalQualityScore/this.numberOfCredits; //compute new GPA
    }


    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.
    public String toString(){
        return ("Student:"+name+ " ;StudentID: "+studentId+" ; Current GPA: "+gpa+" ;Current Credits:"+numberOfCredits);
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.
    public boolean equals(Student target){
        if(target == this){
            return true;
        }
        if(target == null){
            return false;
        }
        if(target.getClass() != getClass()){
            return false;
        }

        Student theStudent = (Student)target;
        return theStudent.getStudentId() == getStudentId();

    }

//    public boolean equals (Object  toBrCompared){
//        if(toBrCompared == this){
//            return  true;
//        }
//        if (toBrCompared == null){
//            return false;
//        }
//        //if ( )
//        return  true; // might be wrong code:)
//    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,91,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally.getGradeLevel(sally.getNumberOfCredits()));
        System.out.println(sally.toString());
//        sally.addGrade(12, 3.5);
//        System.out.println(sally);
//        sally.addGrade(25, 3.8);
//        System.out.println(sally);
    }
}
