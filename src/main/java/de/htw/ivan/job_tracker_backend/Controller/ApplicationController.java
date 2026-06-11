package de.htw.ivan.job_tracker_backend.Controller;

import de.htw.ivan.job_tracker_backend.Entity.Application;
import de.htw.ivan.job_tracker_backend.Service.ApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ApplicationController {

    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("/applications")
    public List<Application> getApplications() {
        return applicationService.getAllApplications();
    }

    @PostMapping("/applications")
    public Application createApplication(@RequestBody Application application) {
        return applicationService.saveApplication(application);
    }
}