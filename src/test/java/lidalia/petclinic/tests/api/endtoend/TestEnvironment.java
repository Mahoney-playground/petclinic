package lidalia.petclinic.tests.api.endtoend;

import lidalia.petclinic.tests.api.Vet;

public class TestEnvironment implements lidalia.petclinic.tests.api.TestEnvironment {

    @Override
    public lidalia.petclinic.tests.api.PetClinicTestClient client() {
        throw new UnsupportedOperationException("Not implemented");
//        return new PetClinicTestClient(scheme, applicationLocation);
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
