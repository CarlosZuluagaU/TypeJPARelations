package com.jpaRelations.relations.unidirectional.many_to_many;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.HashSet; // Import HashSet

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "uni_many_to_many_students")
@Table(name = "uni_many_to_many_students")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    // The redundant "String course" field has been removed.

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinTable(
            name = "uni_student_courses", // Use a distinct name for this join table
            joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "course_id", referencedColumnName = "id")
    )
    private Set<Courses> courses = new HashSet<>(); // Annotations are now on the correct Set field.
}