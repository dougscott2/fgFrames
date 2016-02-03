package com.frameData.services;

import com.frameData.entities.Fighter;
import com.frameData.entities.LightMove;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by DrScott on 2/2/16.
 */
public interface LightMoveRepository extends PagingAndSortingRepository<LightMove, Integer> {
    List<LightMove> findAllByFighter(Fighter fighter);
    //dd
}
