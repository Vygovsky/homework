package L7.task4.com.company.details;

/**
 * Created by roman_v on 22.05.17.
 */
public class Driver {
    private String fullname;
    private double experience;

    public Driver(String fullname, double experience) {
        this.setFullname(fullname);
        this.setExperience(experience);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Driver driver = (Driver) o;

        if (Double.compare(driver.experience, experience) != 0) return false;
        return fullname.equals(driver.fullname);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullname='" + fullname + '\'' +
                ", experience=" + experience +
                '}';
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = fullname.hashCode();
        temp = Double.doubleToLongBits(experience);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }
}
