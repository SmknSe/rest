package model;

import java.math.BigDecimal;
import java.util.UUID;

public record ItemDTO(
        UUID id,
        String name,
        String description,
        BigDecimal price
) {
}
