package com.frameData.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by DrScott on 2/2/16.
 */
@Entity
public class Fighter {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    public int id;

    @Column(nullable = false)
    public String characterName;

    @OneToMany
    public List<LightMove> lightMoves;

    @OneToMany
    public List<MediumMove> mediumMoves;

    @OneToMany
    public List<HeavyMove> heavyMoves;


}

