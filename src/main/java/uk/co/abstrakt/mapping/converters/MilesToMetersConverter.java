package uk.co.abstrakt.mapping.converters;

import org.modelmapper.AbstractConverter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import static java.math.BigDecimal.ROUND_HALF_UP;

@Component
public class MilesToMetersConverter extends AbstractConverter<BigDecimal, Integer> {

    @Override
    protected Integer convert(BigDecimal source) {
        return BigDecimal.valueOf(Constants.METERS_IN_A_MILE)
            .multiply(source)
            .setScale(0, ROUND_HALF_UP)
            .intValue();
    }
}
