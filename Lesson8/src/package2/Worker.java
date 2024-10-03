package package2;

public class Worker {
    private String lastName;
    private String initials;
    private String position;
    private int yearHired;

    public Worker(String lastName, String initials, String position, int yearHired) {
        this.lastName = lastName;
        this.initials = initials;
        this.position = position;
        this.yearHired = yearHired;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearHired() {
        return yearHired;
    }

    public int getExperience(int currentYear) {
        return currentYear - yearHired;
    }

    @Override
    public String toString() {
        return lastName + " " + initials + ", " + position + ", hired in " + yearHired;
    }
}
