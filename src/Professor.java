public class Professor extends Person {
    private String department;
    private String expertise;

    public Professor(String name, String surname, String personalNumber, String department, String expertise) {
        super(name, surname, personalNumber);
        this.department = department;
        this.expertise = expertise;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }
}