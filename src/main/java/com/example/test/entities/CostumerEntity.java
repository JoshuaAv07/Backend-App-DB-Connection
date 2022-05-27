package com.example.test.entities;

import javax.persistence.*;

@Entity
public class CostumerEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "costumer_seq_gen")
    @SequenceGenerator(name = "costumer_seq_gen", sequenceName = "costumer_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name", columnDefinition = "varchar(150)", nullable = false)
    private String name;
    @Column(name = "country", columnDefinition = "varchar(60)", nullable = false)
    private String country;

    public CostumerEntity() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
