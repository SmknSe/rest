package model;

import java.math.BigDecimal;

public record ItemDTO(
        String name,
        String description,
        BigDecimal price
) {
}
