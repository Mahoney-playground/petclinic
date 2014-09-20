package lidalia.petshop.tests.endtoend;

import lidalia.petshop.tests.Vet;

public class TestEnvironment implements lidalia.petshop.tests.TestEnvironment {

    @Override
    public lidalia.petshop.tests.PetClinicTestClient client() {
        return new PetClinicTestClient();
    }

    @Override
    public lidalia.petshop.tests.VetPreconditions given(Vet vet) {
        return new VetPreconditions(vet);
    }

    @Override
    public lidalia.petshop.tests.VetActions when(Vet vet) {
        return new VetActions(vet);
    }
}
