package lidalia.petclinic.tests.vets;

import org.junit.Test;

import lidalia.petclinic.tests.api.PetClinicTestClient;
import lidalia.petclinic.tests.api.Vet;

import static lidalia.petclinic.tests.api.TestStrategy.client;
import static lidalia.petclinic.tests.api.VetBuilder.aRandomVet;
import static lidalia.petclinic.tests.api.TestStrategy.given;
import static lidalia.petclinic.tests.api.TestStrategy.when;
import static org.assertj.core.api.BDDAssertions.then;

public class RegisterVetTests {

    private final PetClinicTestClient client = client();

    @Test
    public void vetNotInClinic() {
        final Vet theVet = aRandomVet().build();

        given(theVet).isNotEmployedByTheClinic();

        then(client.getTheEmployeeList()).doesNotContain(theVet);
    }

    @Test
    public void vetJoinsTheClinic() {
        final Vet theVet = aRandomVet().build();

        given(theVet)
                .isRegistered()
                .and()
                .isNotEmployedByTheClinic();

        when(theVet).joinsTheClinic();

        then(client.getTheEmployeeList()).contains(theVet);
    }
}
