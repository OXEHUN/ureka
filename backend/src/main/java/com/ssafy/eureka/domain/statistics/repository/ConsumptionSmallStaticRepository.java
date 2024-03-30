package com.ssafy.eureka.domain.statistics.repository;

import com.ssafy.eureka.domain.statistics.entity.ConsumptionSmallStaticEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumptionSmallStaticRepository extends JpaRepository<ConsumptionSmallStaticEntity, Integer> {

    ConsumptionSmallStaticEntity findByConsumptionLargeStaticId(int consumptionLargeStaticId);
}
