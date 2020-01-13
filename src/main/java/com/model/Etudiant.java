package com.model;

import javax.persistence.*;


@Entity
public class Etudiant
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    public Etudiant()
    {
    }

    public Etudiant(int id)
    {
        this.id = id;
    }

    public Etudiant(String fname, String lname)
    {
        this.firstName = fname;
        this.lastName = lname;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String first_name)
    {
        this.firstName = first_name;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String last_name)
    {
        this.lastName = last_name;
    }
}