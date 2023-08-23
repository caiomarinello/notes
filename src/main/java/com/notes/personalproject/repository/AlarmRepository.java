package com.notes.personalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.notes.personalproject.model.Alarm;

public interface AlarmRepository extends JpaRepository<Alarm, Long> {
    // Define custom query methods if needed
}

