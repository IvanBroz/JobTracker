package de.htw.ivan.job_tracker_backend.Controller;

import de.htw.ivan.job_tracker_backend.Entity.Application;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ApplicationController {

    @GetMapping(path = "/")
    public ResponseEntity<List<Application>> getApplications() {
        List<Application> applications = List.of(
                new Application(1L, "Siemens", "Junior Developer", "Bewerbung gesendet"),
                new Application(2L, "BMW", "Backend Developer", "Interview"),
                new Application(3L, "SAP", "Software Engineer", "Absage")
        );

        return ResponseEntity.ok(applications);
    }
}
