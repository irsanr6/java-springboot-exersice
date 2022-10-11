package com.irsan.javaexercise.repository;

import com.irsan.javaexercise.entity.ConvertTimeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConvertTimeRepository extends JpaRepository<ConvertTimeEntity, Long> {
}
