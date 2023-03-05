package kindergarten;

public class Child {
    private String firstName;
    private String lastName;
    private int age;
    private String parentName;
    private String contactNumber;

    public Child(String firstName, String lastName, int age, String parentName, String contactNumber) {
        this.age = age;
        this.firstName = firstName;
        this.parentName = parentName;
        this.contactNumber = contactNumber;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Child: " + getFirstName() + " " + getLastName()
                + ", Age: " + getAge() + ", Contact info: " + getParentName() + " - " + getContactNumber();
    }

    public int getAge() {
        return this.age;
    }

    public String getContactNumber() {
        return this.contactNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getParentName() {
        return this.parentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

}
