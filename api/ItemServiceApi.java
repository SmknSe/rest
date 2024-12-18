package api;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import model.ItemDTO;

import java.util.List;

@Headers("Content-Type: application/json")
public interface ItemServiceApi {

    @RequestLine("POST")
    ItemDTO createItem(ItemDTO itemDTO);

    @RequestLine("GET")
    List<ItemDTO> getAllItems();

    @RequestLine("GET /{id}")
    ItemDTO getItemById(@Param String id);

    @RequestLine("DELETE /{id}")
    void deleteItemById(@Param String id);
}
