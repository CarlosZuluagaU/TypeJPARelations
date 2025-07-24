package com.jpaRelations.relations.unidirectional.one_to_many;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "uni_one_to_many_department")
@Table(name = "uni_one_to_many_department")
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

    //Para hacer la relacion unidireccional, no es necesario agregar una lista de empleados aquí.
    //y se hace desde el uno, es decir desde los departasmentos hacia los empleados.
     @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
     private List<Employee> employees; // Un departamento puede tener muchos empleados, pero un empleado solo pertenece a un departamento.
}
