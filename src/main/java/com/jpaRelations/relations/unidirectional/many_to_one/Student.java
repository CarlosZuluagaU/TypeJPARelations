package com.jpaRelations.relations.unidirectional.many_to_one;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "uni_many_to_one_student")
@Table(name = "uni_many_to_one_student")
public class Student {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "school_id", referencedColumnName = "id")
    private School school;



}
