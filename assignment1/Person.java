package assignment1;

public class Person {
    protected String first_name;
    protected String last_name;
    protected String phone;
    protected String email;
    // No emergency contact here, too easy to require that an emerency contact requires an emerency contact.
    // Which is a philosophical question rather than a computer science question.
    // see the class `PersonWithEmergencyContact`, which is this (via subclass) with an emergency contact.
    protected int age;

    public Person(String first_name, String last_name, String phone, String email, int age) throws Exception {
        setFirstName(first_name);
        setLastName(last_name);
        setPhone(phone);
        setEmail(email);
        setAge(age);
    }

    // Getters and Setters~
    public String getFirstName() {
        return this.first_name;
    }

    public void setFirstName(String first_name) throws Exception {
        // only check: string has at least one character.
        if (first_name.length() > 0) {
            this.first_name = first_name;
        } else {
            throw new Exception("First name must have at least one character.");
        }
    }

    public String getLastName() {
        return this.last_name;
    }

    public void setLastName(String last_name) throws Exception {
        // only check: string has at least one character.
        if (last_name.length() > 0) {
            this.last_name = last_name;
        } else {
            throw new Exception("Last name must have at least one character.");
        }
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) throws Exception {
        // only check: string has at least one character.
        // TODO: check that the string is a valid phone number.
        if (phone.length() > 0) {
            this.phone = phone;
        } else {
            throw new Exception("Phone number must have at least one character.");
        }
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) throws Exception {
        // only check: string has at least one character.
        // TODO: check that the string is a valid email address.
        if (email.length() > 0) {
            this.email = email;
        } else {
            throw new Exception("Email address must have at least one character.");
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) throws Exception {
        // only check: age is positive.
        // stuff can be said about the actual min/max age, but considering Cornell has summer programs (which decrease the min age)... yeah.
        if (age > 0) {
            this.age = age;
        } else {
            throw new Exception("Age must be positive.");
        }
    }
}
