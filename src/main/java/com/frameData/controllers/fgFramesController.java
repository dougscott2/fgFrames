package com.frameData.controllers;

import com.frameData.entities.FrameData;
import com.frameData.entities.fighter;
import com.frameData.services.FrameDataRepository;
import com.frameData.services.fighterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

/**
 * Created by DrScott on 2/1/16.
 */
@Controller
public class fgFramesController {
    @Autowired
    fighterRepository fighters;

    @Autowired
    FrameDataRepository frameDatas;


    @PostConstruct
    public void init(){
        //populate database if empty
        if (fighters.findOneByCharacterName("Cammy") ==null){
            fighter cammy = new fighter();
            cammy.characterName="Cammy";
            fighters.save(cammy);
            FrameData fm = new FrameData();
            fm.moveName = "Standing LP";
            fm.startUp = 3;
            fm.active = 2;
            fm.recovery = 4;
            fm.blockAdvantage =5;
            fm.damage = 10;
            fm.hitAdvantage = 10;
            fm.stun = 100;
            fm.total = fm.startUp + fm.recovery;


        }

    }

    //pull current selected fighter

    //pull secondary fighter data


}
