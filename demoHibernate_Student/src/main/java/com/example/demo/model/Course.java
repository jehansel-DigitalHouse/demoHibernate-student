package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

//import javax.persistence.*;
import jakarta.persistence.*;

@Entity
@Table(name = "Courses")
@Getter
@Setter
public class Course {

    @Id
    @GeneratedValue
    private Long id;

    private int nota;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;

}
