package Lab3.Challenges.Challenge6;

public class Builder {
    private String name;
    private String job="";
    private String university="";
    private boolean drivingLicense;
    private boolean isMarried;

    public Builder(String name) {
        this.name = name;
    }



    public Builder setJob(String job) {
        this.job = job;
        return this;
    }

    public Builder setUniversity(String university) {
        this.university = university;
        return this;
    }

    public Builder setDrivingLicense(boolean drivingLicense) {
        this.drivingLicense = drivingLicense;
        return this;
    }

    public Builder setisMarried(boolean isMarried) {
        isMarried = isMarried;
        return this;
    }

    public Person build(){
        return new Person(name,job,university,drivingLicense,isMarried);
    }
}
