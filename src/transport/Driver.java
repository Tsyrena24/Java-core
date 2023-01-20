package transport;

import java.util.Objects;

public abstract class Driver {
    private String fullName;
    private boolean driverLicense;
    private int experienceYear;

    public Driver(String fullName, boolean driverLicense, int experienceYear) {
        this.fullName = fullName;
        this.driverLicense = driverLicense;
        this.experienceYear = experienceYear;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }
    public abstract void startMoving();

    public abstract void stay();

    public abstract void refuel();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driverLicense == driver.driverLicense && experienceYear == driver.experienceYear && Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, driverLicense, experienceYear);
    }

    @Override
    public String toString() {
        return "Водитель " +
                  fullName +
                ", наличие водительских прав - " + (driverLicense? "имеется":"отсутствует") +
                ", стаж" + experienceYear;
    }
}