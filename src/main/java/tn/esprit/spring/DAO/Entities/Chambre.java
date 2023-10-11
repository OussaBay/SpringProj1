package tn.esprit.spring.DAO.Entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Chambre")
@Data
public class Chambre {

    @Id

    private long idChambre;

    @Column(name="numeroChambre")
    private long numChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
}
