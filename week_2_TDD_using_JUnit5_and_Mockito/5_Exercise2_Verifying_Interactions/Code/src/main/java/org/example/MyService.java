package org.example;
public class MyService {

    private final ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public void fetchData() {
        // Calls the external API method
        externalApi.getData();
    }
}