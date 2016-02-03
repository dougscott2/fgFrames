package com.frameData.controllers;

import com.frameData.entities.Fighter;
import com.frameData.entities.LightMove;
import com.frameData.services.FighterRepository;
import com.frameData.services.HeavyMoveRepository;
import com.frameData.services.LightMoveRepository;
import com.frameData.services.MediumMoveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

/**
 * Created by DrScott on 2/1/16.
 */
@Controller
public class fgFramesController {
    @Autowired
    FighterRepository fighters;

    @Autowired
    LightMoveRepository lightMoves;

    @Autowired
    MediumMoveRepository mediumMoves;

    @Autowired
    HeavyMoveRepository heavyMoves;

    @PostConstruct
    public void init(){
        if (fighters.count() == 0 ){
            Fighter fighter = new Fighter();
            fighter.characterName = "Cammy";
            fighters.save(fighter);
        }
        if (lightMoves.count() == 0){
            LightMove lightMove = new LightMove();
            lightMove.moveName = "Stand LP";
            lightMove.input = "lp";
            lightMove.startup = 5;
            lightMove.recovery = 10;
            lightMove.total = lightMove.startup + lightMove.recovery;
            lightMove.hitStop = 8;
            lightMove.hitAdvantage = 4;
            lightMove.blockAdvantage = 3;
            lightMove.damage = 30;
            lightMove.stun = 90;
            lightMove.fighter = fighters.findOneByName("Cammy");
            lightMoves.save(lightMove);
        }


    }

}
