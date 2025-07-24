package com.jpaRelations.relations.unidirectional.one_to_many;


import com.jpaRelations.relations.unidirectional.one_to_one.ParkingSpot;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "uni_one_to_many_employee")
@Table(name = "uni_one_to_many_employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String department;
    private String email;
    private String phoneNumber;


}
