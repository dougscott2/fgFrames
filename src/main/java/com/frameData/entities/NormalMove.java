package com.frameData.entities;

import javax.persistence.*;

/**
 * Created by DrScott on 2/3/16.
 */
@Entity
public class NormalMove {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    public int id;

    @Column(nullable = false)
    public String moveName;

    @Column(nullable = false)
    public String input;

    @Column(nullable = false)
    public int startUp;

    @Column(nullable = false)
    public int recovery;

    @Column(nullable = false)
    public int total;

    @Column(nullable = false)
    public int hitStop;

    @Column(nullable = false)
    public int hitAdvantage;

    @Column(nullable = false)
    public int blockAdvantage;

    @Column(nullable = false)
    public int damage;

    @Column(nullable = false)
    public int stun;

    @ManyToOne
    public Fighter fighter;


}

