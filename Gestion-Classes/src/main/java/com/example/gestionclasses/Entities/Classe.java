package com.example.gestionclasses.Entities;

import javax.persistence.*;
import java.util.Enumeration;

@Entity
public class Classe {
    @Id
    @GeneratedValue
    private int id;
    private String nom;

    @Enumerated(EnumType.ORDINAL)
    private niveau niveau;


}
