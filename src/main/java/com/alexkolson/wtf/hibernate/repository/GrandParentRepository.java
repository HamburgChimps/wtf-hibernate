package com.alexkolson.wtf.hibernate.repository;

import com.alexkolson.wtf.hibernate.entity.GrandParent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrandParentRepository extends JpaRepository<GrandParent, Long> {
}
