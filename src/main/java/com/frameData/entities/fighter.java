package com.frameData.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.HashMap;

/**
 * Created by DrScott on 2/1/16.
 */
@Entity
public class fighter {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    public int id;

    @Column(nullable = false)
    public String characterName;

    @Column(nullable = false)
    public HashMap<String, Integer> frameData;
}
