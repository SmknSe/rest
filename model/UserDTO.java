package model;

import java.util.UUID;

public record UserDTO(
        UUID id,
        String name
) {
}
