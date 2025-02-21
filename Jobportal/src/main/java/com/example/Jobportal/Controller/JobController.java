package com.example.Jobportal.Controller;


import com.example.Jobportal.Entitys.Job;
import com.example.Jobportal.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class JobController {

    @Autowired
    JobService service;


    @PostMapping("job")
    public void addJob(@RequestBody Job job){
        service.addJob(job);
    }

    @GetMapping("job/{id}")
    public Optional<Job> getJobById(@PathVariable int id){
        return service.getJobById(id);
    }

    @GetMapping("jobs")
    public List<Job> getAllJobs(){
        return service.findAllJobs();

    }

    @GetMapping("jobs/ordered")
    public List<Job> sortByCTC(){
        return service.sortByCTC();
    }

    @DeleteMapping("job/{id}")
    public void deleteById(@PathVariable int id){
        service.deleteJob(id);
    }

    @PutMapping("job/{id}")
    public Optional<Job> updateById(@PathVariable int id, @RequestBody Job job){
        return service.updateById(id,job);
    }

}
