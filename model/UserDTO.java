package model;

public record UserDTO(String id,
                      String username,
                      String password
) {
    public UserDTO(String id, String username) {
        this(id, username, null);
    }
}
