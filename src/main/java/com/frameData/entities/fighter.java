package com.frameData.entities;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;

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


    @OneToMany
    public List<FrameData> moves;
}
