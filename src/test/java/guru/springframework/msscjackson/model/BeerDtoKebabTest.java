package guru.springframework.msscjackson.model;


import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("kebab")
// {"id":"c0f531b9-4057-4b89-a77f-b599e48fadcc","beerName":"BeerName","beerStyle":"Ale","upc":null,"createdDate":"2020-04-05T10:55:45.562-03:00","lastUpdatedDate":"2020-04-05T10:55:45.562-03:00","price":12.99}
@JsonTest
public class BeerDtoKebabTest extends BaseTest {

    @Test
    void testKebab() throws JsonProcessingException {
        BeerDto dto = getDto();

        String json = objectMapper.writeValueAsString(dto);

        System.out.println(json);
    }
}
