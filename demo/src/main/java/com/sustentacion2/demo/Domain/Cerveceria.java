package com.sustentacion2.demo.Domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cervecerias")
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNomenclatura() {
        return nomenclatura;
    }

    public void setNomenclatura(String nomenclatura) {
        this.nomenclatura = nomenclatura;
    }

    public String getMarca_cerveza() {
        return marca_cerveza;
    }

    public void setMarca_cerveza(String marca_cerveza) {
        this.marca_cerveza = marca_cerveza;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
}
