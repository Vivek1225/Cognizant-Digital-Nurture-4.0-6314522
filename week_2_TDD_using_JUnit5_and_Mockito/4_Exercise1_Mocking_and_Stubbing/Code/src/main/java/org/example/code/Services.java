package org.example.code;

public class Services {
    private ExternalApi externalApi;

    public Services(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }
    public String fetchData() {
        return externalApi.getData();
    }
}
