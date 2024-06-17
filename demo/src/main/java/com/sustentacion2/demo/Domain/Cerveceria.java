package com.sustentacion2.demo.Domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cervecerias")
@Data
public class Cerveceria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "departamento")
    private String departamento;
    @Column(name = "municipio")
    private String municipio;
    @Column(name = "nomenclaturura")
    private String nomenclatura;
    @Column(name = "marca cerveza")
    private String marca_cerveza;
    @Column(name = "cantidad stock")
    private String stock;

    public Cerveceria(String name, String departamento, String municipio, String nomenclatura,
            String marca_cerveza, String stock) {
        this.nombre = name;
        this.departamento = departamento;
        this.municipio = municipio;
        this.nomenclatura = nomenclatura;
        this.marca_cerveza = marca_cerveza;
        this.stock = stock;
    }

    public Cerveceria() {
    }


}
