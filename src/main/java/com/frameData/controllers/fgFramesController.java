package com.frameData.controllers;

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
            //populate via csv file

        }

    }

    //pull current selected fighter

    //pull secondary fighter data


}
