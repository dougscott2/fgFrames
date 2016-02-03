package com.frameData.services;

import com.frameData.entities.Fighter;
import com.frameData.entities.NormalMove;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by DrScott on 2/3/16.
 */
public interface NormalMoveRepository extends PagingAndSortingRepository<NormalMove, Integer> {
    List<NormalMove> findAllByFighter(Fighter fighter);
}
