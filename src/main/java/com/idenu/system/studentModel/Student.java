package com.idenu.system.studentModel;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "First_Name")
    String firstName;
    @Column(name = "Last_Name")
    String lastName;
    @Column(name = "Email")
    String email;
    @Column(name = "Major")
    String major;
}
