package Org.APIAutomate;

public class CreatedUserDetails {

    private String name;
    private String job;
    private String id;
    private String createdAT;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAT() {
        return createdAT;
    }

    public void setCreatedAT(String createdAT) {
        this.createdAT = createdAT;
    }

    @Override
    public String toString() {
        return "CreatedUserDetails{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", id='" + id + '\'' +
                ", createdAT='" + createdAT + '\'' +
                '}';
    }
}

