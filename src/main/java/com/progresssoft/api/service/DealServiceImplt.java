package com.progresssoft.api.service;

import com.progresssoft.api.dto.InvalidDeal;
import com.progresssoft.api.dto.ValidDeal;
import com.progresssoft.api.repository.InvalidDealRepository;
import com.progresssoft.api.repository.ValidDealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("dealService")
public class DealServiceImplt implements DealService {

    private InvalidDealRepository invalidDealRepository;

    private ValidDealRepository validDealRepository;

    @Autowired
    public void setInvalidDealRepository(InvalidDealRepository invalidDealRepository) {
        this.invalidDealRepository = invalidDealRepository;
    }

    @Autowired
    public void setValidDealRepository(ValidDealRepository validDealRepository) {
        this.validDealRepository = validDealRepository;
    }

    @Override
    @Transactional
    public void saveInvalidDeals(List<InvalidDeal> invalidDeals) {
        invalidDealRepository.batchSave(invalidDeals);
    }

    @Override
    @Transactional
    public void saveValidDeals(List<ValidDeal> validDeals) {
        validDealRepository.batchSave(validDeals);
    }


    @Override
    public ValidDeal findValidDealByDealId(String dealId) {
        return validDealRepository.findByDealId(dealId);
    }
}
