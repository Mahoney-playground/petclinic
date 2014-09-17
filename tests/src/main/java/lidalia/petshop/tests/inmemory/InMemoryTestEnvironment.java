package lidalia.petclinic.tests.inmemory;

import lidalia.petclinic.tests.PetClinicTestClient;
import lidalia.petclinic.tests.TestEnvironment;
import lidalia.petclinic.tests.Vet;
import lidalia.petclinic.tests.VetActions;
import lidalia.petclinic.tests.VetPreconditions;

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
