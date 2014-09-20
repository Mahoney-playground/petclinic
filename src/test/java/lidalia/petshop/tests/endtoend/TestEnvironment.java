package lidalia.petshop.tests.endtoend;

import lidalia.petshop.tests.api.Vet;

public class TestEnvironment implements lidalia.petshop.tests.api.TestEnvironment {

    @Override
    public lidalia.petshop.tests.api.PetClinicTestClient client() {
        return new PetClinicTestClient();
    }

    @Override
    public lidalia.petshop.tests.api.VetPreconditions given(Vet vet) {
        return new VetPreconditions(vet);
    }

    @Override
    public lidalia.petshop.tests.api.VetActions when(Vet vet) {
        return new VetActions(vet);
    }
}
