package de.htw.ivan.job_tracker_backend.Controller;

import de.htw.ivan.job_tracker_backend.Entity.Application;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ApplicationController {

    @GetMapping(path = "/applications")
    public ResponseEntity<List<Application>> getApplications() {

        List<Application> applications = List.of(
                new Application(1L, "Siemens", "Junior Developer", "Bewerbung gesendet"),
                new Application(2L, "BMW", "Backend Developer", "Interview"),
                new Application(3L, "SAP", "Software Engineer", "Absage")
        );

        return ResponseEntity.ok(applications);
    }
}