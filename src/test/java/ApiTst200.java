import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;

public class ApiTst200 {
    @Test
    public void Check200() {
        given()
                .contentType(ContentType.JSON)
                .when()
                .post("https://demoqa.com/text-box")
                .then()
                .statusCode(200);
    }
}