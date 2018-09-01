package uk.co.abstrakt.mapping.converters;

import org.modelmapper.AbstractConverter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import static java.math.BigDecimal.ROUND_HALF_UP;

@Component
public class MetersToMilesConverter extends AbstractConverter<Integer, BigDecimal> {

    @Override
    protected BigDecimal convert(Integer source) {
        return new BigDecimal(source)
            .divide(BigDecimal.valueOf(Constants.METERS_IN_A_MILE), 3, ROUND_HALF_UP);
    }
}
