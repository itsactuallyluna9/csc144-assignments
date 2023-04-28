package assignment1;

public class Employee extends PersonWithEmergencyContact {
    protected String category; // Faculty or Staff
    protected String department;
    protected String salary_type;
    protected double salary;

    public Employee(String first_name, String last_name, String phone, String email, int age, Person emergency_contact, String category, String department, String salary_type, double salary) throws Exception {
        super(first_name, last_name, phone, email, age, emergency_contact);
        setCategory(category);
        setDepartment(department);
        setSalaryType(salary_type);
        setSalary(salary);
    }

    // Getters and Setters~

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) throws Exception {
        if (category.equals("Faculty") || category.equals("Staff")) {
            this.category = category;
        } else {
            throw new Exception("Category must be either Faculty or Staff.");
        }
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) throws Exception {
        // only check: string has at least one character.
        if (department.length() > 0) {
            this.department = department;
        } else {
            throw new Exception("Department must have at least one character.");
        }
    }

    public String getSalaryType() {
        return this.salary_type;
    }

    public void setSalaryType(String salary_type) throws Exception {
        // only check: string is hourly or salaried.
        if (salary_type.equals("Hourly") || salary_type.equals("Salaried")) {
            this.salary_type = salary_type;
        } else {
            throw new Exception("Salary type must be either Hourly or Salaried.");
        }
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) throws Exception {
        // only check: salary is positive.
        // i can't assume cornell college is paying people minimum wage.
        if (salary > 0) {
            this.salary = salary;
        } else {
            throw new Exception("Salary must be positive.");
        }
    }

    public String toTinyString() {
        return String.format("%s %s (%s, %s, %s)", this.first_name, this.last_name, this.category, this.department, this.salary_type);
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
        sb.append(String.format("Category: %s\n", this.category));
        sb.append(String.format("Department: %s\n", this.department));
        sb.append(String.format("Salary Type: %s\n", this.salary_type));
        sb.append(String.format("Salary: %f\n", this.salary));
        return sb.toString();
    }
}
