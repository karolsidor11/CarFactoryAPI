package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Silnik")
public class Engine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "Pojemność")
    private double capacity;

    @Column(name = "Moc")
    private int power;

    @Column(name = "Moment_obrotowy")
    private int torque;
}
