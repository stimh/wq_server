package com.stimh.desig.Entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "DMUSER")
public class DMUSER {
    @Id
    @Column(name="ID")
    public int ID;
    @Column(name="USERNAME")
    public String USERNAME;
    @Column(name="PASSWORD")
    public String PASSWORD;
    @Column(name="SEX")
    public String SEX;
    @Column(name="AGE")
    public int AGE;
    @Column(name="NAME")
    public String NAME;
    @Column(name="PHONE")
    public String PHONE;
}
