package com.example.Jobportal.Service;

import com.example.Jobportal.Entitys.Job;
import com.example.Jobportal.Repositiry.Jobrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    @Autowired
    Jobrepo repo;

    public void addJob(Job job){
        repo.save(job);
    }

    public Optional<Job> getJobById(int id) {
        return repo.findById(id);
    }

    public List<Job> findAllJobs() {
        return repo.findAll();
    }
    public void deleteJob(int id){
        repo.deleteById(id);
    }

    public Optional<Job> updateById(int id, Job job) {
        repo.save(job);
        return repo.findById(id);

    }

    public List<Job> sortByCTC() {
        return repo.orderByCtc();
    }
}
