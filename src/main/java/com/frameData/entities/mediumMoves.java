package com.frameData.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by DrScott on 2/2/16.
 */
@Entity
public class mediumMoves {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    public int id;

    @Column(nullable = false)
    public String moveName;

    @Column(nullable = false)
    public String input;

    @Column(nullable = false)
    public int startup;

    @Column(nullable = false)
    public int recovery;

    @Column(nullable = false)
    public int total = startup + recovery;

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
}

