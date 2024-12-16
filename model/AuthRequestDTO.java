package model;

import java.util.UUID;

public record AuthRequestDTO(
        UUID id,
        String name
) {
}
