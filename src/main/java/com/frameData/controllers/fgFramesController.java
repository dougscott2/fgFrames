package com.frameData.controllers;

import com.frameData.entities.Fighter;
import com.frameData.entities.NormalMove;
import com.frameData.services.FighterRepository;
import com.frameData.services.NormalMoveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileNotFoundException;
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
    public void init() throws FileNotFoundException {
        if (fighters.count() == 0) {
            Fighter fighter = new Fighter();
            fighter.characterName = "Cammy";
            fighters.save(fighter);
        }
        if (normalMoves.findAllByFighter(fighters.findOneByName("Cammy")).size() == 0) {
           // File cammyNorm = new File("cammyNormals.csv");
            Scanner scanner = new Scanner(new File("cammyNormals.csv"));
            scanner.nextLine();
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] columns = line.split(",");
                NormalMove n = new NormalMove();

                n.moveName = columns[0];
                n.input = columns[1];
                n.startUp = Integer.valueOf(columns[2]);
                n.recovery = Integer.valueOf(columns[3]);
                n.total = Integer.valueOf(columns[4]);
                n.hitStop = Integer.valueOf(columns[5]);
                n.hitAdvantage = Integer.valueOf(columns[6]);
                n.blockAdvantage = Integer.valueOf(columns[7]);
                n.damage = Integer.valueOf(columns[8]);
                n.stun = Integer.valueOf(columns[9]);
                n.fighter = fighters.findOneByName("Cammy");
                normalMoves.save(n);
            }



        }

    }//end init
}
