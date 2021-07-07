package dev.kameleon.test;

import dev.kameleon.config.ConfigurationResource;
import dev.kameleon.data.KameleonConfiguration;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;
import org.junit.jupiter.api.Assertions;

@QuarkusTest
public class ComponentResourceTest {

    @Inject
    ConfigurationResource configurationResource;

    @Test
    public void testComponents() {
        KameleonConfiguration kc = configurationResource.getKc();
        kc.getTypes().forEach(camelType ->
                camelType.getVersions().forEach(
                        camelVersion -> test(camelType.getName(), camelVersion.getName())
                )
        );
    }

    private void test(String type, String version){
        Response resp = given()
                .pathParam("type", type)
                .pathParam("version", version)
                .when().get("/component/{type}/{version}")
                .then().extract().response();

        List<HashMap<String, String>> list = resp.getBody().jsonPath().getList("");
        Assertions.assertTrue(list.size() >200);
        Assertions.assertTrue(list.stream().filter(c -> c.get("component").contains("activemq")).count() > 0);
        Assertions.assertTrue(list.stream().filter(c -> c.get("component").contains("kafka")).count() > 0);
    }

}