package lidalia.petshop.tests.vets;

import org.junit.Test;

import lidalia.petshop.tests.api.PetClinicTestClient;
import lidalia.petshop.tests.api.Vet;

import static lidalia.petshop.tests.api.Assertions.then;
import static lidalia.petshop.tests.api.TestStrategy.client;
import static lidalia.petshop.tests.api.VetBuilder.aVet;
import static lidalia.petshop.tests.api.TestStrategy.given;
import static lidalia.petshop.tests.api.TestStrategy.when;

public class RegisterVetTests {

    private final PetClinicTestClient client = client();

    @Test
    public void vetJoinsTheClinic() {
        final Vet theVet = aVet().build();

        given(theVet)
                .isRegistered()
                .and()
                .isNotEmployedByTheClinic();

        when(theVet).joinsTheClinic();

        then(client.getTheEmployeeList()).shouldContain(theVet);
    }


}
