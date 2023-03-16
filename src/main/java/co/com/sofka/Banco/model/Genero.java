package co.com.sofka.Banco.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity

public class Genero {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String genero;
}
