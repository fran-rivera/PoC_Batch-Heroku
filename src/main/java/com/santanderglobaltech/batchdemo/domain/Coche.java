package com.santanderglobaltech.batchdemo.domain;

import javax.persistence.*;

@Entity (name = "coche__c")
@Table(schema = "salesforce", name = "coche__c")
public class Coche {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //private LocalDateTime createddate;
    //private boolean isdeleted;
    private String name;
    //private String systemmodstamp;
    //private String external_id__c;
    @Column(name = "marca__c")
    private String marca;
    @Column(name = "puertas__c")
    private int puertas;
    //private String sfid;
    //private String _hc_lastop;
    //private String _hc_err;

    public Coche() {
    }

    public Coche(String name, String marca, int puertas) {
        this.name = name;
        this.marca = marca;
        this.puertas = puertas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marca='" + marca + '\'' +
                ", puertas=" + puertas +
                '}';
    }
}
