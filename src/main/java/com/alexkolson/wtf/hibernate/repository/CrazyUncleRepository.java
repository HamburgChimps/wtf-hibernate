package com.alexkolson.wtf.hibernate.repository;

import com.alexkolson.wtf.hibernate.entity.CrazyUncle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrazyUncleRepository extends JpaRepository<CrazyUncle, Long> {
}
