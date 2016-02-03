package com.frameData.services;

import com.frameData.entities.Fighter;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by DrScott on 2/2/16.
 */
public interface HeavyMoveRepository extends PagingAndSortingRepository<HeavyMoveRepository, Integer> {
    List<HeavyMoveRepository> findAllByFighter(Fighter fighter);
    //f
}
