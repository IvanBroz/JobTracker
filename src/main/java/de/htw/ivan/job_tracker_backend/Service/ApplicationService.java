package de.htw.ivan.job_tracker_backend.Service;

import de.htw.ivan.job_tracker_backend.Entity.Application;
import de.htw.ivan.job_tracker_backend.Repository.ApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {

    private final ApplicationRepository applicationRepository;

    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }

    public Application saveApplication(Application application) {
        return applicationRepository.save(application);
    }
}