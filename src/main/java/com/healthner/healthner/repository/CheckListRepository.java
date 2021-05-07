package com.healthner.healthner.repository;

import com.healthner.healthner.domain.CheckList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CheckListRepository extends JpaRepository<CheckList,Long> {

    @Query(value = "select count(gym) from CheckList where gym.id = : gymId")
    Long findByGymId(@Param("gymId") Long id);
}
