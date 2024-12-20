package api;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import model.OrderDTO;

import java.util.List;

@Headers("Content-Type: application/json")
public interface OrderServiceApi {

    @RequestLine("POST")
    OrderDTO createOrder(OrderDTO OrderDTO);

    @RequestLine("GET")
    List<OrderDTO> getAllOrders();

    @RequestLine("GET /{id}")
    OrderDTO getOrderById(@Param String id);

    @RequestLine("DELETE /{id}")
    void deleteOrderById(@Param String id);
}
