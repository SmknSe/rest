package model;

import util.GrantedAuthorityDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.springframework.security.core.GrantedAuthority;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

public record AuthRequestDTO(
        UUID id,
        String name,
        Map<String, Object> attributes,
        @JsonDeserialize(contentUsing = GrantedAuthorityDeserializer.class)
        Set<GrantedAuthority> authorities
) {
}
