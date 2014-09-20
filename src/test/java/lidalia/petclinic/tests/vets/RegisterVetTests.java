package lidalia.petclinic.tests.vets;

import org.junit.Test;

import lidalia.petclinic.tests.api.PetClinicTestClient;
import lidalia.petclinic.tests.api.Vet;

import static lidalia.petclinic.tests.api.Assertions.then;
import static lidalia.petclinic.tests.api.TestStrategy.client;
import static lidalia.petclinic.tests.api.VetBuilder.aVet;
import static lidalia.petclinic.tests.api.TestStrategy.given;
import static lidalia.petclinic.tests.api.TestStrategy.when;

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
