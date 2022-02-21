package com.progresssoft.api.service;

import com.progresssoft.api.dto.InvalidDeal;
import com.progresssoft.api.dto.ValidDeal;

import java.util.List;

public interface DealService {

    ValidDeal findValidDealByDealId(String dealId);

    void saveValidDeals(List<ValidDeal> validDeals);

    void saveInvalidDeals(List<InvalidDeal> invalidDeals);

}
