package com.progresssoft.api.service;

import com.progresssoft.api.dto.CurrencyCode;
import com.progresssoft.api.dto.DealDto;
import org.springframework.stereotype.Component;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

import static org.hibernate.type.InstantType.FORMATTER;

@Component("dealsValidator")
public class DealsValidatorImpl implements DealsValidator {

    @Override
    public boolean valid(DealDto dealDto) {

        if (StringUtils.isEmpty(dealDto.getDealId())) {
            return false;
        }

        if (StringUtils.isEmpty(dealDto.getToCurrency())) {
            return false;
        } else {
            if (!CurrencyCode.ISO_CURRENCY_CODES.contains(dealDto.getToCurrency())) {
                return false;
            }
        }

        if (StringUtils.isEmpty(dealDto.getFromCurrency())) {
            return false;
        } else {
            if (!CurrencyCode.ISO_CURRENCY_CODES.contains(dealDto.getFromCurrency())) {
                return false;
            }
        }

        if (StringUtils.isEmpty(dealDto.getDateTime())) {
            return false;
        } else {
            try {
                LocalDateTime.parse(dealDto.getDateTime(), FORMATTER);
            } catch (DateTimeParseException e) {
                return false;
            }
        }

        if (StringUtils.isEmpty(dealDto.getAmount())) {
            return false;
        } else {
            try {
                new BigDecimal(dealDto.getAmount());
            } catch (NumberFormatException e) {
                return false;
            }
        }

        return true;
    }
}
