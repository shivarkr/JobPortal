package com.example.Jobportal.Entitys;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@Scope("prototype")
@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private long ctc;
    private String description;
    @ElementCollection
    @Cascade(CascadeType.ALL)
    private List<String> skills;
}
