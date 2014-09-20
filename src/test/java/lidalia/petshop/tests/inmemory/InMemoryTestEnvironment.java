package lidalia.petshop.tests.inmemory;

import lidalia.petshop.tests.api.PetClinicTestClient;
import lidalia.petshop.tests.api.TestEnvironment;
import lidalia.petshop.tests.api.Vet;
import lidalia.petshop.tests.api.VetActions;
import lidalia.petshop.tests.api.VetPreconditions;

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
