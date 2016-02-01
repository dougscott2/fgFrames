package com.frameData.services;

import com.frameData.entities.fighter;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by DrScott on 2/1/16.
 */
public interface fighterRepository extends PagingAndSortingRepository<fighter, Integer> {

}
