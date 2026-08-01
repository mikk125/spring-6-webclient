package guru.springframework.client;

import guru.springframework.model.BeerDTO;
import reactor.core.publisher.Flux;
import tools.jackson.databind.JsonNode;

import java.util.Map;

public interface BeerClient {

    Flux<String> listBeer();

    Flux<Map> listBeerMap();

    Flux<JsonNode> listBeersJsonNode();

    Flux<BeerDTO> listBeerDtos();
}
