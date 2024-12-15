package api;

import feign.Param;
import feign.RequestLine;
import model.ItemDTO;

import java.util.List;

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
