package com.jpaRelations.relations.bidirectional.many_to_many;

// The import for Student has been removed
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.HashSet; // Import HashSet

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "bi_many_to_many_courses") // Renamed for consistency
@Table(name = "bi_many_to_many_courses")  // Renamed for consistency
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String duration;
    private String instructor;
    private String syllabus;

    @ManyToMany(mappedBy = "courses")
    private Set<Students> students = new HashSet<>(); // Corrected type to Set<Students>
}