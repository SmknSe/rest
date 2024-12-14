package api;

import feign.RequestLine;

public interface UserServiceApi {

    @RequestLine("GET /all")
    String getUsers();
}
