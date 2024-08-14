package unah.lenguajes.hn.proyecto.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Personas")
@Data
public class Persona {
    @Id
    @Column(name="DNI")
    private String dni;

    @Column(name="primerNombre")
    private String primerNombre;

    @Column(name="segundoNombre")
    private String segundoNombre;

    @Column(name="primerApellido")
    private String primerApellido;

    @Column(name="segundoApellido")
    private String segundoApellido;

    @Column(name="telefono")
    private String telefono;

    @Column(name="correo")
    private String correo;
    
    @JsonIgnore
    @OneToOne(mappedBy = "persona")
    private Orden orden;

    @JsonIgnoreProperties(value = {"persona"})
    @OneToOne(mappedBy = "persona")
    private Usuario usuario;

}
