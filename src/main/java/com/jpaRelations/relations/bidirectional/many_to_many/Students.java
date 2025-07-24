package com.jpaRelations.relations.bidirectional.many_to_many;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.HashSet; // Import HashSet

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "bi_many_to_many_students")
@Table(name = "bi_many_to_many_students")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phoneNumber;
    private String address;

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY)
    @JoinTable(
            name = "student_courses",
            joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "course_id", referencedColumnName = "id")
    )
    private Set<Courses> courses = new HashSet<>(); // This is the correctly typed and annotated field
}