package lidalia.petclinic.tests.inmemory;

import lidalia.petclinic.tests.api.PetClinicTestClient;
import lidalia.petclinic.tests.api.TestEnvironment;
import lidalia.petclinic.tests.api.Vet;
import lidalia.petclinic.tests.api.VetActions;
import lidalia.petclinic.tests.api.VetPreconditions;

public class InMemoryTestEnvironment implements TestEnvironment {

    @Override
    public PetClinicTestClient client() {
        return new InMemoryPetClinicTestClient();
    }

    @Override
    public VetPreconditions given(Vet vet) {
        return new InMemoryVetPreconditions(vet);
    }

    @Override
    public VetActions when(Vet vet) {
        return new InMemoryVetActions(vet);
    }
}
