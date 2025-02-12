package com.example.Jobportal.Repositiry;

import com.example.Jobportal.Entitys.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Jobrepo extends JpaRepository<Job, Integer> {
    @Query("SELECT j FROM Job j ORDER BY j.ctc DESC ")
    List<Job> orderByCtc();
}

