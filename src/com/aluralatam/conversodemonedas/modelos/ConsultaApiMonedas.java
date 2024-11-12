package com.aluralatam.conversodemonedas.modelos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApiMonedas {
    public Monedas realizaConvercion(String monedaBase, String monedaDeCambio){
        String apiKey = "8de62bb92c9a8cb33afcf545";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+apiKey+"/pair/"+monedaBase+"/"+monedaDeCambio);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        } catch (IOException | InterruptedException  e) {
            throw new RuntimeException("No encontre una o ambas monedas");
        }
    }
}
