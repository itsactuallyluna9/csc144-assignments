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

    public String toTinyString() {
        return String.format("%s %s (%s, %f)", this.first_name, this.last_name, this.class_level, this.gpa);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s\n", this.first_name, this.last_name));
        sb.append(String.format("Phone: %s\n", this.phone));
        sb.append(String.format("Email: %s\n", this.email));
        sb.append(String.format("Age: %d\n", this.age));
        sb.append("Emergency Contact:\n");
        sb.append(String.format("\tName: %s %s\n", this.emergency_contact.first_name, this.emergency_contact.last_name));
        sb.append(String.format("\tPhone: %s\n", this.emergency_contact.phone));
        sb.append(String.format("\tEmail: %s\n", this.emergency_contact.email));
        sb.append(String.format("\tAge: %d\n", this.emergency_contact.age));
        sb.append(String.format("Class Level: %s\n", this.class_level));
        sb.append(String.format("GPA: %f\n", this.gpa));
        return sb.toString();
    }
}
