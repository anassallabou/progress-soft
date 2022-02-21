package com.progresssoft.api.repository;

import com.progresssoft.api.dto.ValidDeal;
import com.progresssoft.api.repository.custom.ValidDealRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by tristandiaz on 10/29/17.
 */
@Repository
public interface ValidDealRepository extends JpaRepository<ValidDeal, String>, ValidDealRepositoryCustom {

    ValidDeal findByDealId(@Param("dealId") String dealId);
}
