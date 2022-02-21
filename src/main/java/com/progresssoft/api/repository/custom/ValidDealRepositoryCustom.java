package com.progresssoft.api.repository.custom;

import com.progresssoft.api.dto.ValidDeal;

import java.util.List;

public interface ValidDealRepositoryCustom {
    void batchSave(List<ValidDeal> validDeals);
}
