package com.management.contact.contactmanagementapp.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @Column(updatable = false, unique = true, nullable = false)
    private String email;

    private String password;

//    @OneToMany
//    private List<Contact> contact;
}
