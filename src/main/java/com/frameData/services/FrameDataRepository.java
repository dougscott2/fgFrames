package com.frameData.services;

import com.frameData.entities.FrameData;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by DrScott on 2/1/16.
 */
public interface FrameDataRepository extends PagingAndSortingRepository<FrameData, Integer> {

}
