package com.mercan.anil.receipt.domain;


import javax.persistence.*;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Receipe receipe;

    @Lob
    private String receipeNotes;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Receipe getReceipe() {
        return receipe;
    }

    public void setReceipe(Receipe receipe) {
        this.receipe = receipe;
    }

    public String getReceipeNotes() {
        return receipeNotes;
    }

    public void setReceipeNotes(String receipeNotes) {
        this.receipeNotes = receipeNotes;
    }
}
