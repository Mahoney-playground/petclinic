package lidalia.petclinic.tests.endtoend;

import lidalia.petclinic.tests.api.Vet;

public class TestEnvironment implements lidalia.petclinic.tests.api.TestEnvironment {

    @Override
    public lidalia.petclinic.tests.api.PetClinicTestClient client() {
        return new PetClinicTestClient();
    }

    @Override
    public lidalia.petclinic.tests.api.VetPreconditions given(Vet vet) {
        return new VetPreconditions(vet);
    }

    @Override
    public lidalia.petclinic.tests.api.VetActions when(Vet vet) {
        return new VetActions(vet);
    }
}
