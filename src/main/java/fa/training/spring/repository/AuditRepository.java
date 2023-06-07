package fa.training.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fa.training.spring.entities.Audit;

public interface AuditRepository extends JpaRepository<Audit, Long>{

}
