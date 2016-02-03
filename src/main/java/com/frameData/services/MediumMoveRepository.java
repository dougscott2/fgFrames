package com.frameData.services;

import com.frameData.entities.Fighter;
import com.frameData.entities.MediumMove;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by DrScott on 2/2/16.
 */
public interface MediumMoveRepository extends PagingAndSortingRepository<MediumMove, Integer>{
    List<MediumMove> findAllByFighter(Fighter fighter);
    //dd
}
