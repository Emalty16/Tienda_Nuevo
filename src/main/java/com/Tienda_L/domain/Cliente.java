package com.Tienda_L.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name="cliente")

public class Cliente implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente; //Hibernate lo convierte en id_cliente
    String nombre;
    String apellidos;
    String correo;
    String telefonos;

    @JoinColumn(name="id_credito", referencedColumnName = "id_credito")
    @ManyToOne
    private Credito credito;
    
    public Cliente(String nombre, String apellidos, String correo, String telefonos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefonos = telefonos;
    }
    
    public Cliente() {
    }

    public Cliente(Long idCliente, String nombre, String apellidos, String correo, String telefonos, Credito credito) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefonos = telefonos;
        this.credito = credito;
    }
    
    
 
    
    
}
