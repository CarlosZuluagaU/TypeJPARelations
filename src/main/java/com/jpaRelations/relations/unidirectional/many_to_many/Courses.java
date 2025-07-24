package com.jpaRelations.relations.unidirectional.many_to_many;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "uni_many_to_many_courses")
@Table(name = "uni_many_to_many_courses")
public class Courses {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String duration;
    private String instructor;
    private String syllabus;
}
