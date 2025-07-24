package com.jpaRelations.relations.unidirectional.one_to_one;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "uni_one_to_one_parking_spot")
@Table(name = "uni_one_to_one_parking_spot")
public class ParkingSpot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String location;
    private String type;
    @Column(name = "is_available")
    private boolean isAvailable;

}
