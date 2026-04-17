package de.htw.ivan.job_tracker_backend.Entity;

public class Application {
    private Long id;
    private String company;
    private String position;
    private String status;

    public Application(Long id, String company, String position, String status) {
        this.id = id;
        this.company = company;
        this.position = position;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }

    public String getStatus() {
        return status;
    }
}
