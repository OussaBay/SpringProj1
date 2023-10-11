package tn.esprit.spring.DAO.Entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Reservation")
@Data
public class Reservation {

    @Id

    private String idReservation;

    @Temporal(TemporalType.DATE)
    private Date dateInscription;//java.util

    @Column(name="estValide")
    private boolean estvalide;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiants> etudiants;

}
