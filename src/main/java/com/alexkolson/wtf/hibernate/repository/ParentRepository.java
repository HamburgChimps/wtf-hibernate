package com.alexkolson.wtf.hibernate.repository;

import com.alexkolson.wtf.hibernate.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepository extends JpaRepository<Parent, Long> {
}
