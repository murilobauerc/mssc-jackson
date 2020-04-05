package guru.springframework.msscjackson.model;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("snake")
// {"id":"afacf2ed-67b0-42d5-9386-968f79e3c7b4","beer_name":"BeerName","beer_style":"Ale","upc":null,"created_date":"2020-04-05T10:56:26.496-03:00","last_updated_date":"2020-04-05T10:56:26.496-03:00","price":12.99}
@JsonTest
public class BeerDtoSnakeTest extends BaseTest{
    @Test
    void testSnake() throws JsonProcessingException {
        BeerDto dto = getDto();

        String json = objectMapper.writeValueAsString(dto);

        System.out.println(json);
    }
}
