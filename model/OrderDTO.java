package model;

import java.math.BigDecimal;

public record OrderDTO(
        String id,
        BigDecimal total
) {
}
