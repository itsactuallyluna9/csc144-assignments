package assignment1;

public class PersonWithEmergencyContact extends Person {
    // why?
    // because both students and employees have emergency contacts.
    // but an emergency contact doesn't need an emergency contact.
    // (that's quite strange, isn't it?)
    // so, as a compromise, we have this class that adds a field to Person which is an emergency contact.
    // and then Student and Employee extend this class.
    // this way, we can have an emergency contact for both students and employees, without having to add it to Person.
    // (and risk having an emergency contact for an emergency contact, which, again, is just silly)
    protected Person emergency_contact;

    public PersonWithEmergencyContact(String first_name, String last_name, String phone, String email, int age, Person emergency_contact) throws Exception {
        super(first_name, last_name, phone, email, age);
        setEmergencyContact(emergency_contact);
    }

    public Person getEmergencyContact() {
        return this.emergency_contact;
    }

    public void setEmergencyContact(Person emergency_contact) throws Exception {
        // only check: emergency contact is not null.
        if (emergency_contact != null) {
            this.emergency_contact = emergency_contact;
        } else {
            throw new Exception("Emergency contact cannot be null.");
        }
    }
}
