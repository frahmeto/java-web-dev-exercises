package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {

    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student Fifi = new Student("name", 00000001,1, 3.0 );
        Fifi.setName("Fifi");
        Fifi.setNumberOfCredits(1);
        Fifi.setGpa(4.0);
        System.out.println("Fifi's Name: "  + Fifi.getName());
        System.out.println("Fifi's Credits: "  + Fifi.getNumberOfCredits());
        System.out.println("Fifi's GPA: "  + Fifi.getGpa());
    }
}
