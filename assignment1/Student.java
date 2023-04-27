package assignment1;

public class Student extends PersonWithEmergencyContact {
    protected String class_level;
    protected double gpa;

    public Student(String first_name, String last_name, String phone, String email, int age, Person emergency_contact, String class_level, double gpa) throws Exception {
        super(first_name, last_name, phone, email, age, emergency_contact);
        setClassLevel(class_level);
        setGPA(gpa);
    }

    // Getters and Setters~

    public String getClassLevel() {
        return this.class_level;
    }

    public void setClassLevel(String class_level) throws Exception {
        // check: Freshman, Sophomore, Junior, Senior
        // there's also people who go to summer classes (both high school and college)
        // idk how to handle that yet.
        // TODO: above!~
        if (class_level.equals("Freshman") || class_level.equals("Sophomore") || class_level.equals("Junior") || class_level.equals("Senior")) {
            this.class_level = class_level;
        } else {
            throw new Exception("Class level must be Freshman, Sophomore, Junior, or Senior.");
        }
    }

    public double getGPA() {
        return this.gpa;
    }

    public void setGPA(double gpa) throws Exception {
        // only check: gpa is between 0 and 4.
        // as it's the standard for GPAs.
        // (0 to 5 does exist, but it's mainly high schools that use it for honors)
        if (gpa >= 0 && gpa <= 4) {
            this.gpa = gpa;
        } else {
            throw new Exception("GPA must be between 0 and 4.");
        }
    }
}
