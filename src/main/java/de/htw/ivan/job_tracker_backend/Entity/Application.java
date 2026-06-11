package de.htw.ivan.job_tracker_backend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String company;
    private String position;
    private String status;
    private String jobLink;
    private String applicationDate;

    public Application() {
    }

    public Application(Long id, String company, String position,
                       String status, String jobLink, String applicationDate) {
        this.id = id;
        this.company = company;
        this.position = position;
        this.status = status;
        this.jobLink = jobLink;
        this.applicationDate = applicationDate;
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

    public String getJobLink() {
        return jobLink;
    }

    public String getApplicationDate() {
        return applicationDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setJobLink(String jobLink) {
        this.jobLink = jobLink;
    }

    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }
}