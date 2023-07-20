package ug.co.absa.testapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ug.co.absa.testapp.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
