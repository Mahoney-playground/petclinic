package lidalia.petclinic.tests.vets;

import org.junit.Test;

import lidalia.petclinic.tests.PetClinicTestClient;
import lidalia.petclinic.tests.Vet;

import static lidalia.petclinic.tests.Assertions.then;
import static lidalia.petclinic.tests.TestStrategy.client;
import static lidalia.petclinic.tests.VetBuilder.aVet;
import static lidalia.petclinic.tests.TestStrategy.given;
import static lidalia.petclinic.tests.TestStrategy.when;

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
