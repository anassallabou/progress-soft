package com.progresssoft.api.repository.custom;

import com.progresssoft.api.dto.InvalidDeal;

import java.util.List;

public interface InvalidDealRepositoryCustom {
    void batchSave(List<InvalidDeal> invalidDeals);
}
