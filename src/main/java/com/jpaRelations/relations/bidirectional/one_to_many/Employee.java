package com.jpaRelations.relations.bidirectional.one_to_many;


import com.jpaRelations.relations.bidirectional.one_to_one.ParkingSpot; // Esto es de un paquete diferente y parece ser una relación aparte. Asegúrate de su mapeo.
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// No se necesita Set aquí a menos que tengas otra relación Set.
// import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "bi_one_to_many_employee") // Nombre de la entidad para JPQL
@Table(name = "bi_one_to_many_employee") // Nombre de la tabla en la DB
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String department;
    private String email;
    private String phoneNumber;
    @ManyToOne // Un Employee pertenece a un solo Department
    @JoinColumn(name = "department_id") // Esta columna será la clave foránea en la tabla 'bi_one_to_many_employee'
    private Department actualDepartment; // Cambié el nombre del campo para evitar confusión con el String 'department' de arriba.

}