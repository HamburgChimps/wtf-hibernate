package com.alexkolson.wtf.hibernate.repository;

import com.alexkolson.wtf.hibernate.entity.Child;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildRepository extends JpaRepository<Child, Long> {
}
