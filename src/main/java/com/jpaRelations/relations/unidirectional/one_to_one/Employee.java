package com.jpaRelations.relations.unidirectional.one_to_one;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "uni_one_to_one_employee")
@Table(name = "uni_one_to_one_employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String department;
    private String email;
    private String phoneNumber;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "parking_spot_id", referencedColumnName = "id")
    private ParkingSpot parkingSpot;


}
