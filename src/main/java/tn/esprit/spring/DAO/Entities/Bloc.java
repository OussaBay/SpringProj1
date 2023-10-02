package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Bloc")
public class Bloc {

    @Id
    private long idBloc;

    @Column(name="nomBloc")
    private String nomBloc;


    @Column(name="capaciteBloc")
    private long capaciteBloc;
}
