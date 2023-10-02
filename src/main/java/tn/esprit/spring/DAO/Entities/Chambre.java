package tn.esprit.spring.DAO.Entities;


import jakarta.persistence.*;

@Entity
@Table(name = "Chambre")
public class Chambre {

    @Id

    private long idChambre;

    @Column(name="numeroChambre")
    private long numChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
}
