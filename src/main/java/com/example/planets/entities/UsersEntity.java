package com.example.planets.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@Table(name="users")
public class UsersEntity {
    @Id
    @Column(name="seq")
    private Integer seq;
    @Column(name="name")
    private String name;
    public UsersEntity() {
    }
    public UsersEntity(int seq, String name) {
        this.name = name;
        this.seq = seq;
    }

}
