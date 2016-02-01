package com.frameData.controllers;

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


    @PostConstruct
    public void init(){
        //populate database if empty

    }

    //pull current selected fighter

    //pull secondary fighter data


}
