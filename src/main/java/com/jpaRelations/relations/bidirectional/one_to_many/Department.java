package com.jpaRelations.relations.bidirectional.one_to_many;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "bi_one_to_many_department")
@Table(name = "bi_one_to_many_department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    @Column(name = "head_of_department")
    private String headOfDepartment;
    @Column(name = "contact_number")
    private String contactNumber;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Employee> employees; // Bidirectional relationship with Employee
    // Un departamento puede tener muchos empleados, pero un empleado solo pertenece a un departamento.
}