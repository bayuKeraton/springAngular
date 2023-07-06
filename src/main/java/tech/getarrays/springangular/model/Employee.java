package tech.getarrays.springangular.model;

import jakarta.persistence.*;

import java.io.Serializable;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;
    @Column(nullable = false,updatable = false)
    private String employeeCode;

}
