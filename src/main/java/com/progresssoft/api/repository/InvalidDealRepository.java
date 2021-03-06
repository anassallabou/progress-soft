package com.progresssoft.api.repository;

import com.progresssoft.api.dto.InvalidDeal;
import com.progresssoft.api.repository.custom.InvalidDealRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by tristandiaz on 10/29/17.
 */
@Repository
public interface InvalidDealRepository extends JpaRepository<InvalidDeal, String>, InvalidDealRepositoryCustom {

}
