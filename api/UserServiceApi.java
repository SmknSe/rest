package api;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import model.AuthRequestDTO;
import model.UserDTO;

import java.util.List;
import java.util.UUID;

public interface UserServiceApi {

    @RequestLine("POST")
    @Headers("Content-Type: application/json")
    UserDTO createOrGetUser(AuthRequestDTO authRequestDTO);

    @RequestLine("GET")
    List<UserDTO> getAllUsers();

    @RequestLine("GET /{id}")
    UserDTO getUserById(@Param UUID id);
}
