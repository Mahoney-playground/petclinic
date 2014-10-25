package lidalia.petclinic.tests.api.endtoend;

import com.google.common.collect.ImmutableList;
import lidalia.petclinic.tests.api.Vet;

import javax.json.JsonObject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON_TYPE;

class PetClinicTestClient implements lidalia.petclinic.tests.api.PetClinicTestClient {

    private final Client client = ClientBuilder.newClient();
    private final String schemeHostAndPort;

    PetClinicTestClient(String schemeHostAndPort) {
        this.schemeHostAndPort = schemeHostAndPort;
    }

    @Override
    public ImmutableList<Vet> getTheEmployeeList() {
        JsonObject rootResource = getRootResource();
        throw new UnsupportedOperationException("Not implemented");
    }

    private JsonObject getRootResource() {
        URI root = UriBuilder
                .fromUri(schemeHostAndPort)
                .path("/")
                .build()
                ;

        return client
                .target(root)
                .request(APPLICATION_JSON_TYPE)
                .get()
                .readEntity(JsonObject.class);
    }
}
