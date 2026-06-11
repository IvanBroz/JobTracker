package de.htw.ivan.job_tracker_backend.Repository;

import de.htw.ivan.job_tracker_backend.Entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {
}