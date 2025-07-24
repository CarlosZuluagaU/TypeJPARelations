package com.jpaRelations.relations.bidirectional.many_to_one;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "bi_many_to_one_school") // Renamed for consistency
@Table(name = "bi_many_to_one_school")  // Renamed for consistency
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    @Column(name = "principal_name")
    private String principalName;
    @Column(name = "contact_number")
    private String contactNumber;
    private String email;

    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Student> students;
}