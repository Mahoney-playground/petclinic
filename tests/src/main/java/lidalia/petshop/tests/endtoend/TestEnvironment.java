package lidalia.petclinic.tests.endtoend;

import lidalia.petclinic.tests.Vet;

public class TestEnvironment implements lidalia.petclinic.tests.TestEnvironment {

    @Override
    public lidalia.petclinic.tests.PetClinicTestClient client() {
        return new PetClinicTestClient();
    }

    @Override
    public lidalia.petclinic.tests.VetPreconditions given(Vet vet) {
        return new VetPreconditions(vet);
    }

    @Override
    public lidalia.petclinic.tests.VetActions when(Vet vet) {
        return new VetActions(vet);
    }
}
