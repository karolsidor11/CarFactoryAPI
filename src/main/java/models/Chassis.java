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
@Table(name = "Podwozie")
public class Chassis {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "Naped")
    private String drive;

    @Column(name = "Hamulce")
    private String brakes;

    @Column(name = "Zawieszenie")
    private String suspension;

    @Column(name = "Układ_kierowniczy")
    private String steering;

}
