package de.hamburgchimps.repository;

import de.hamburgchimps.entity.Child;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildRepository extends JpaRepository<Child, Long> {
}
