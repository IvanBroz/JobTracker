package de.htw.ivan.job_tracker_backend.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplicationController {

    @GetMapping(path = "/")
    public ModelAndView showApplicationsPage() {
        return new ModelAndView("applications");
    }
}
