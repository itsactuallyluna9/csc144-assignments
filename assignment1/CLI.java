package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class CLI {
    // right, so.
    // this is a half-baked "cli", if you can even call it that.
    // it just needs to serve the following:
    // 1. add an student or employee
    // 2. get information about a student or employee
    // 3. modify information about a student or employee
    // 4. delete a student or employee (if we can add, it'll be easy to delete)
    
    // it should be noted i'm not really caring about access modifiers here, as
    // this is just a quick and dirty cli to get the job done until a gui is made.
    // (which seems to be assignment 2 based off of the schedule.)

    //
    //         TIP OF THE DAY:
    // "super secret dev command" is an
    // actual command! it enters in some
    // test data for you to play with.
    // 

    Scanner input;
    ArrayList<Student> students;
    ArrayList<Employee> employees;

    public CLI() {
        input = new Scanner(System.in);
        students = new ArrayList<Student>();
        employees = new ArrayList<Employee>();
    }

    // helper functions for easily printing
    public void print(String s) {
        System.out.print(s);
    }

    public void println(String s) {
        System.out.println(s);
    }

    // helper functions for creating students and employees and associated person objects

    private Person createPerson() {
        Person p = null;
        do {
            try {
                print("Enter the person's first name: ");
                String first_name = input.nextLine();
                print("Enter the person's last name: ");
                String last_name = input.nextLine();
                print("Enter the person's phone number: ");
                String phoneNumber = input.nextLine();
                print("Enter the person's email address: ");
                String emailAddress = input.nextLine();
                print("Enter the person's age: ");
                int age = Integer.parseInt(input.nextLine()); // yes i know there's .nextInt() but i need to input a string after this.
                p = new Person(first_name, last_name, phoneNumber, emailAddress, age);
            } catch (Exception e) {
                println("Error: " + e.getMessage());
                println("Please try again.");
            }
        } while (p == null);
        return p;
    }

    private Student createStudent() {
        Student s = null;
        do {
            try {
                print("Enter the student's first name: ");
                String first_name = input.nextLine();
                print("Enter the student's last name: ");
                String last_name = input.nextLine();
                print("Enter the student's phone number: ");
                String phoneNumber = input.nextLine();
                print("Enter the student's email address: ");
                String emailAddress = input.nextLine();
                print("Enter the student's age: ");
                int age = Integer.parseInt(input.nextLine()); // yes i know there's .nextInt() but i need to input a string after this.
                print("Enter the student's class level: ");
                String class_level = input.nextLine();
                print("Enter the student's GPA: ");
                double gpa = Double.parseDouble(input.nextLine()); // yes i know there's .nextDouble() but i need to input a string after this.
                println("Starting emergency contact creation...");
                Person emergency_contact = createPerson();
                s = new Student(first_name, last_name, phoneNumber, emailAddress, age, emergency_contact, class_level, gpa);
            } catch (Exception e) {
                println("Error: " + e.getMessage());
                println("Please try again.");
            }
        } while (s == null);
        return s;
    }

    private Employee createEmployee() {
        Employee e = null;
        do {
            try {
                print("Enter the employee's first name: ");
                String first_name = input.nextLine();
                print("Enter the employee's last name: ");
                String last_name = input.nextLine();
                print("Enter the employee's phone number: ");
                String phoneNumber = input.nextLine();
                print("Enter the employee's email address: ");
                String emailAddress = input.nextLine();
                print("Enter the employee's age: ");
                int age = Integer.parseInt(input.nextLine()); // yes i know there's .nextInt() but i need to input a string after this.
                print("Enter the employee's category (Faculty/Staff): ");
                String category = input.nextLine();
                print("Enter the employee's department: ");
                String department = input.nextLine();
                print("Enter the employee's salary type: ");
                String salary_type = input.nextLine();
                print("Enter the employee's salary: ");
                double salary = Double.parseDouble(input.nextLine()); // yes i know there's .nextDouble() but i need to input a string after this.
                println("Starting emergency contact creation...");
                Person emergency_contact = createPerson();
                e = new Employee(first_name, last_name, phoneNumber, emailAddress, age, emergency_contact, category, department, salary_type, salary);
            } catch (Exception ex) {
                println("Error: " + ex.getMessage());
                println("Please try again.");
            }
        } while (e == null);
        return e;
    }

    // other misc helper functions

    private void startupMessage() {
        println("Welcome!");
        println("This is a simple CLI for managing students and employees.");
        mainLoopHelpMessage();
    }

    private void mainLoopHelpMessage() {
        println("Use the following commands to manage students and employees:");
        println("a / add - add a student or employee");
        println("g / get - get information about a student or employee");
        println("m / modify - modify information about a student or employee");
        println("d / delete - delete a student or employee");
        println("s / save - save the current state of the program to a file");
        println("q / quit - quit the program");
        println("h / help - show this message, or, if you're in a command, show help for that command");
    }

    private void addSubLoop() {
        boolean running = true;
        while (running) {
            print("add> Which type do you want to add? ([S]tudent/[E]mployee/[Q]uit): ");
            String command = input.nextLine().toLowerCase();
            if (command.equals("s") || command.equals("student")) {
                Student s = createStudent();
                students.add(s);
                println("Student added!");
            } else if (command.equals("e") || command.equals("employee")) {
                Employee e = createEmployee();
                employees.add(e);
                println("Employee added!");
            } else if (command.equals("q") || command.equals("quit")) {
                println("Quitting add command and returning to main menu...");
                running = false;
            } else if (command.equals("h") || command.equals("help")) {
                println("Help for add command:");
                println("Use this command to add a student or employee.");
                println("You will be prompted for information about the student or employee.");
                println("You will also be prompted to create an emergency contact for the student or employee.");
                println("You can quit this command by typing 'q' or 'quit', and that will return you to the main menu.");
                println("You can also quit this command by typing 'h' or 'help', and that will show you this help message.");
            } else {
                println("Invalid command. Please try again.");
            }
        }
    }

    private void getSubLoop() {
        // name for this function sucks, i know
        boolean running = true;
        while (running) {
            print("get> Enter a command: ");
            String command = input.nextLine().toLowerCase();
            // commands:
            // ls / list students - list all students
            // le / list employees - list all employees
            // s / student - get info about a student
            // e / employee - get info about an employee
            // q / quit - quit the get command and return to main menu
            // h / help - show help for get command
            if (command.equals("ls") || command.equals("list students")) {
                println("Students:");
                for (Student s : students) {
                    println(s.toTinyString());
                }
            } else if (command.equals("le") || command.equals("list employees")) {
                println("Employees:");
                for (Employee e : employees) {
                    println(e.toTinyString());
                }
            } else if (command.equals("s") || command.equals("student")) {
                print("Enter the student's first name: ");
                String first_name = input.nextLine();
                print("Enter the student's last name: ");
                String last_name = input.nextLine();
                int found = 0;
                for (Student student : students) {
                    if (student.getFirstName().equals(first_name) && student.getLastName().equals(last_name)) {
                        println(student.toString());
                        found++;
                    }
                }
                if (found == 0) {
                    println("Student not found.");
                }
            } else if (command.equals("e") || command.equals("employee")) {
                print("Enter the employee's first name: ");
                String first_name = input.nextLine();
                print("Enter the employee's last name: ");
                String last_name = input.nextLine();
                int found = 0;
                for (Employee employee : employees) {
                    if (employee.getFirstName().equals(first_name) && employee.getLastName().equals(last_name)) {
                        println(employee.toString());
                        found++;
                    }
                }
                if (found == 0) {
                    println("Employee not found.");
                }
            } else if (command.equals("q") || command.equals("quit")) {
                println("Quitting get command and returning to main menu...");
                running = false;
            } else if (command.equals("h") || command.equals("help")) {
                println("Help for get command:");
                println("Use this command to get information about students and employees.");
                println("You can list all students by typing 'ls' or 'list students'.");
                println("You can list all employees by typing 'le' or 'list employees'.");
                println("You can get information about a student by typing 's' or 'student'.");
                println("You can get information about an employee by typing 'e' or 'employee'.");
                println("You can quit this command by typing 'q' or 'quit', and that will return you to the main menu.");
            } else {
                println("Invalid command. Please try again.");
            }
        }
    }

    private void modifyStudent(Student s) {
        println("Modifying student " + s.getFirstName() + " " + s.getLastName() + ".");
        println("Enter a blank line to leave a field unchanged.");
        boolean running = true;
        while (running) {
            try {
                print("Modify the student's first name (currently " + s.getFirstName() + "): ");
                String first_name = input.nextLine();
                if (!first_name.equals("")) {
                    s.setFirstName(first_name);
                }
                print("Modify the student's last name (currently " + s.getLastName() + "): ");
                String last_name = input.nextLine();
                if (!last_name.equals("")) {
                    s.setLastName(last_name);
                }
                print("Modify the student's phone number (currently " + s.getPhone() + "): ");
                String phone = input.nextLine();
                if (!phone.equals("")) {
                    s.setPhone(phone);
                }
                print("Modify the student's email (currently " + s.getEmail() + "): ");
                String email = input.nextLine();
                if (!email.equals("")) {
                    s.setEmail(email);
                }
                print("Modify the student's age (currently " + s.getAge() + "): ");
                String age = input.nextLine();
                if (!age.equals("")) {
                    s.setAge(Integer.parseInt(age));
                }
                print("Modify the student's emergency contact? (y/n): ");
                String modify_emergency_contact = input.nextLine().toLowerCase();
                if (modify_emergency_contact.equals("y") || modify_emergency_contact.equals("yes")) {
                    s.setEmergencyContact(createPerson());
                }
                print("Modify the student's class level (currently " + s.getClassLevel() + "): ");
                String class_level = input.nextLine();
                if (!class_level.equals("")) {
                    s.setClassLevel(class_level);
                }
                print("Modify the student's GPA (currently " + s.getGPA() + "): ");
                String gpa = input.nextLine();
                if (!gpa.equals("")) {
                    s.setGPA(Double.parseDouble(gpa));
                }
                println("Student modified.");
                running = false;
            } catch (Exception e) {
                println("Invalid input. Please try again.");
                println(e.getMessage());
            }
        }
    }

    private void modifyEmployee(Employee e) {
        println("Modifying employee " + e.getFirstName() + " " + e.getLastName() + ".");
        println("Enter a blank line to leave a field unchanged.");
        boolean running = true;
        while (running) {
            try {
                print("Modify the employee's first name (currently " + e.getFirstName() + "): ");
                String first_name = input.nextLine();
                if (!first_name.equals("")) {
                    e.setFirstName(first_name);
                }
                print("Modify the employee's last name (currently " + e.getLastName() + "): ");
                String last_name = input.nextLine();
                if (!last_name.equals("")) {
                    e.setLastName(last_name);
                }
                print("Modify the employee's phone number (currently " + e.getPhone() + "): ");
                String phone = input.nextLine();
                if (!phone.equals("")) {
                    e.setPhone(phone);
                }
                print("Modify the employee's email (currently " + e.getEmail() + "): ");
                String email = input.nextLine();
                if (!email.equals("")) {
                    e.setEmail(email);
                }
                print("Modify the employee's age (currently " + e.getAge() + "): ");
                String age = input.nextLine();
                if (!age.equals("")) {
                    e.setAge(Integer.parseInt(age));
                }
                print("Modify the employee's emergency contact? (y/n): ");
                String modify_emergency_contact = input.nextLine().toLowerCase();
                if (modify_emergency_contact.equals("y") || modify_emergency_contact.equals("yes")) {
                    e.setEmergencyContact(createPerson());
                }
                print("Modify the employee's category (currently " + e.getCategory() + "): ");
                String category = input.nextLine();
                if (!category.equals("")) {
                    e.setCategory(category);
                }
                print("Modify the employee's department (currently " + e.getDepartment() + "): ");
                String department = input.nextLine();
                if (!department.equals("")) {
                    e.setDepartment(department);
                }
                print("Modify the employee's salary type (currently " + e.getSalaryType() + "): ");
                String salary_type = input.nextLine();
                if (!salary_type.equals("")) {
                    e.setSalaryType(salary_type);
                }
                print("Modify the employee's salary (currently " + e.getSalary() + "): ");
                String salary = input.nextLine();
                if (!salary.equals("")) {
                    e.setSalary(Double.parseDouble(salary));
                }
                println("Employee modified.");
                running = false;
            } catch (Exception ex) {
                println("Invalid input. Please try again.");
                println(ex.getMessage());
            }
        }
    }

    private void modifySubLoop() {
        // name for this function sucks, i know
        boolean running = true;
        while (running) {
            print("modify> Enter a command: ");
            String command = input.nextLine().toLowerCase();
            // commands:
            // s / student - modify a student
            // e / employee - modify an employee
            // q / quit - quit the modify command and return to main menu
            // h / help - show help for modify command
            if (command.equals("s") || command.equals("student")) {
                print("Enter the student's first name: ");
                String first_name = input.nextLine();
                print("Enter the student's last name: ");
                String last_name = input.nextLine();
                int found = 0;
                for (Student student : students) {
                    if (student.getFirstName().equals(first_name) && student.getLastName().equals(last_name)) {
                        println(student.toString());
                        found++;
                        print("Would you like to modify this student? (y/n) ");
                        if (input.nextLine().toLowerCase() == "y") {
                            modifyStudent(student);
                            break;
                        }
                    }
                }
                if (found == 0) {
                    println("Student not found.");
                }
            } else if (command.equals("e") || command.equals("employee")) {
                print("Enter the employee's first name: ");
                String first_name = input.nextLine();
                print("Enter the employee's last name: ");
                String last_name = input.nextLine();
                int found = 0;
                for (Employee employee : employees) {
                    if (employee.getFirstName().equals(first_name) && employee.getLastName().equals(last_name)) {
                        println(employee.toString());
                        found++;
                        print("Would you like to modify this employee? (y/n) ");
                        if (input.nextLine().toLowerCase() == "y") {
                            modifyEmployee(employee);
                            break;
                        }
                    }
                }
                if (found == 0) {
                    println("Employee not found.");
                }
            } else if (command.equals("q") || command.equals("quit")) {
                println("Quitting modify command and returning to main menu...");
                running = false;
            } else if (command.equals("h") || command.equals("help")) {
                println("Help for modify command:");
                println("Use this command to modify students and employees.");
                println("You can modify a student by typing 's' or 'student'.");
                println("You can modify an employee by typing 'e' or 'employee'.");
                println("You can quit this command by typing 'q' or 'quit', and that will return you to the main menu.");
            } else {
                println("Invalid command. Please try again.");
            }
        }
    }

    private void deleteSubLoop() {
        // name for this function sucks, i know
        boolean running = true;
        while (running) {
            print("DELETE> Enter a command: ");
            String command = input.nextLine().toLowerCase();
            // commands:
            // s / student - delete a student
            // e / employee - delete an employee
            // q / quit - quit the delete command and return to main menu
            // h / help - show help for delete command
            if (command.equals("s") || command.equals("student")) {
                print("Enter the student's first name: ");
                String first_name = input.nextLine();
                print("Enter the student's last name: ");
                String last_name = input.nextLine();
                int found = 0;
                for (Student student : students) {
                    if (student.getFirstName().equals(first_name) && student.getLastName().equals(last_name)) {
                        println(student.toString());
                        found++;
                        print("Would you like to delete this student? (y/n) ");
                        if (input.nextLine().toLowerCase() == "y") {
                            students.remove(student);
                            println("Student deleted.");
                            break;
                        }
                    }
                }
                if (found == 0) {
                    println("Student not found.");
                }
            } else if (command.equals("e") || command.equals("employee")) {
                print("Enter the employee's first name: ");
                String first_name = input.nextLine();
                print("Enter the employee's last name: ");
                String last_name = input.nextLine();
                int found = 0;
                for (Employee employee : employees) {
                    if (employee.getFirstName().equals(first_name) && employee.getLastName().equals(last_name)) {
                        println(employee.toString());
                        found++;
                        print("Would you like to delete this employee? (y/n) ");
                        if (input.nextLine().toLowerCase() == "y") {
                            employees.remove(employee);
                            println("Employee deleted.");
                            break;
                        }
                    }
                }
                if (found == 0) {
                    println("Employee not found.");
                }
            } else if (command.equals("q") || command.equals("quit")) {
                println("Quitting delete command and returning to main menu...");
                running = false;
            } else if (command.equals("h") || command.equals("help")) {
                println("Help for delete command:");
                println("Use this command to delete students and employees.");
                println("You can delete a student by typing 's' or 'student'.");
                println("You can delete an employee by typing 'e' or 'employee'.");
                println("You can quit this command by typing 'q' or 'quit', and that will return you to the main menu.");
            } else {
                println("Invalid command. Please try again.");
            }
        }
    }

    private void run() {
        // main loop time
        boolean running = true;
        startupMessage();
        while (running) {
            print("Enter a command: ");
            String command = input.nextLine().toLowerCase();
            // don't use a switch statement here
            if (command.equals("a") || command.equals("add")) {
                addSubLoop();
            } else if (command.equals("g") || command.equals("get")) {
                getSubLoop();
            } else if (command.equals("m") || command.equals("modify")) {
                modifySubLoop();
            } else if (command.equals("d") || command.equals("delete")) {
                deleteSubLoop();
            } else if (command.equals("s") || command.equals("save")) {
                println("yeah... that doesn't work here. sorry.");
                // we didn't learn about file i/o yet, nor saving/loading objects of custom classes
                // so this is just a placeholder for now.
                // will it ever be replaced? who knows.
            } else if (command.equals("q") || command.equals("quit")) {
                running = false;
            } else if (command.equals("h") || command.equals("help")) {
                mainLoopHelpMessage();
            } else if (command.equals("super secret dev command")) {
                println("SECRETS!!!!!! MARK IS GREAT"); // src: the stanley parable secret disco
                try {
                    students.add(new Student("Mark", "Smith", "(248) 434-5508", "totallynotmark6@gmail.com", 18, new Person("Caden", "Branchflower", "(555) 432-4125", "caden@starkindustries.com", 19), "Freshman", 3.8));
                    students.add(new Student("Kennedy", "Lightning", "(555) 512-5156", "keny@cornelluniversity.edu", 19, new Person("Walt", "Disney", "(555) 155-4200", "walt@disney.com", 50), "Sophomore", 3.9));
                    employees.add(new Employee("Troy", "Simmons", "(555) 609-2587", "troy.srl@nintendo.jp", 23, new Person("Eevee", "Tomatovich", "(555) 8722-9784", "eevee@pokemon.jp", 25), "Faculty", "Squid Research Labs", "Salaried", 100.00));
                    employees.add(new Employee("Jo-nathan", "tincan", "(555) 152-1527", "jo@nath.an", 20, new Person("Jimmy", "Ryan", "(555) 125-1246", "jimmy.ryan@slimjim.com", 24), "Staff", "Slim Jim", "Hourly", 908.00));
                    println("Added demo students and employees."); // actually useful
                } catch (Exception e) {
                    println("Tip of the Day: Ow."); // src: ultrakill 5-3B terminal
                }
            } else {
                println("Unknown command: " + command);
                println("Please try again.");
            }
        }
        println("Now exiting...");
        println("Goodbye!");
    }

    public static void main(String[] args) {
        CLI cli = new CLI();
        cli.run();
    }
}
