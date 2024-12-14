package api;

import feign.RequestLine;

public interface OrderServiceApi {

    @RequestLine("GET /all")
    String getOrders();

    @RequestLine("GET /test")
    String test();
}
