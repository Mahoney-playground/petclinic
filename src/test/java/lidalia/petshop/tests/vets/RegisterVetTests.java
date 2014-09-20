package lidalia.petshop.tests.vets;

import org.junit.Test;

import lidalia.petshop.tests.PetClinicTestClient;
import lidalia.petshop.tests.Vet;

import static lidalia.petshop.tests.Assertions.then;
import static lidalia.petshop.tests.TestStrategy.client;
import static lidalia.petshop.tests.VetBuilder.aVet;
import static lidalia.petshop.tests.TestStrategy.given;
import static lidalia.petshop.tests.TestStrategy.when;

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
