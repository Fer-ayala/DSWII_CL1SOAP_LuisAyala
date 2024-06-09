package pe.edu.cibertec.api_soap_cl1.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Publicacion")
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpublicacion;
    private String titulo;
    private String resumen;
    private String nomautor;
}
