package model;

import java.math.BigDecimal;
import java.util.UUID;

public record OrderDTO(
        UUID id,
        BigDecimal total
) {
}
