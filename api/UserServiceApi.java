package api;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import model.AuthRequestDTO;
import model.UserDTO;

import java.util.List;
import java.util.UUID;

@Headers("Content-Type: application/json")
public interface UserServiceApi {

    @RequestLine("POST")
    UserDTO createOrGetUser(AuthRequestDTO authRequestDTO);

    @RequestLine("GET")
    List<UserDTO> getAllUsers();

    @RequestLine("GET /{id}")
    UserDTO getUserById(@Param UUID id);
}
