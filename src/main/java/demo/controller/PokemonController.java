package demo.controller;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PokemonController {

    public Response getPokemon(String pokemonName) {
        Response response = RestAssured
                .given()
                .baseUri("https://pokeapi.co")
                .basePath("/api")
                .log()
                .all()
                .header("Content-type", "application/json")
                .header("Accept", "*/*")
                .get("/v2/pokemon/" + pokemonName);

        return response;
    }
}
