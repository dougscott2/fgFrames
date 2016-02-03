package com.frameData.controllers;

import com.frameData.entities.Fighter;
import com.frameData.entities.NormalMove;
import com.frameData.services.FighterRepository;
import com.frameData.services.NormalMoveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.io.File;
import java.util.Scanner;

/**
 * Created by DrScott on 2/1/16.
 */
@Controller
public class fgFramesController {
    @Autowired
    FighterRepository fighters;

    @Autowired
    NormalMoveRepository normalMoves;




    @PostConstruct
    public void init(){
        if (fighters.count() == 0 ){
            Fighter fighter = new Fighter();
            fighter.characterName = "Cammy";
            fighters.save(fighter);
        }
        if(normalMoves.findAllByFighter(fighters.findOneByName("Cammy")).size() == 0 ){
            Scanner scanner = new Scanner(new File("/Users/DrScott/IdeaProjects/fgFrames/cammyNormals.csv"));
            scanner.nextLine();
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] columns = line.split(",");
                NormalMove n = new NormalMove();

                n.moveName = columns[0];
                n.input = columns[1];



        }



    }

}
