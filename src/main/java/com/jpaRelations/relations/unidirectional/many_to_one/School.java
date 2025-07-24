package com.jpaRelations.relations.unidirectional.many_to_one;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "uni_many_to_one_schools")
@Table(name = "uni_many_to_one_schools")
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

}
