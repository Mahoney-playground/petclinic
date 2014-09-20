package lidalia.petshop.tests.inmemory;

import lidalia.petshop.tests.PetClinicTestClient;
import lidalia.petshop.tests.TestEnvironment;
import lidalia.petshop.tests.Vet;
import lidalia.petshop.tests.VetActions;
import lidalia.petshop.tests.VetPreconditions;

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
