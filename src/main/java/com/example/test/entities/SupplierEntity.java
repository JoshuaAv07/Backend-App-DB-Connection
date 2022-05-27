package com.example.test.entities;

import javax.persistence.*;

@Entity
public class SupplierEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "supplier_seq_gen")
    @SequenceGenerator(name = "supplier_seq_gen", sequenceName = "supplier_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name", columnDefinition = "varchar(150)", nullable = false)
    private String name;

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
}
