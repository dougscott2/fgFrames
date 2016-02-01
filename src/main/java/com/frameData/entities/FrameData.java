package com.frameData.entities;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;

/**
 * Created by DrScott on 2/1/16.
 */
@Entity
public class FrameData {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    public int id;

    @Column(nullable = false)
    public String moveName;

    @Column(nullable = false)
    public int startUp;

    @Column(nullable = false)
    public int active;

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
    fighter character;
}
