package com.frameData.services;

import com.frameData.entities.Fighter;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by DrScott on 2/2/16.
 */
public interface FighterRepository extends PagingAndSortingRepository<Fighter, Integer> {
    Fighter findOneByName(String name);
    Fighter findOneById(int id);
    //fasdf
}
