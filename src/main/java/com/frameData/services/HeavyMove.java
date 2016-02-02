package com.frameData.services;

import com.frameData.entities.Fighter;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by DrScott on 2/2/16.
 */
public interface HeavyMove extends PagingAndSortingRepository<HeavyMove, Integer> {
    List<HeavyMove> findAllByFighter(Fighter fighter);
}
