package co.com.sofka.Banco.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity

public class Genero {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String genero;
}
