package co.com.sofka.Banco.dto;

import co.com.sofka.Banco.model.Genero;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

public class PersonaDto {
    private Long idPersona;
    private String nombre;
    private Genero genero;
    private int edad;
    private int documento;
    private String direccion;
    private String telefono;
}
