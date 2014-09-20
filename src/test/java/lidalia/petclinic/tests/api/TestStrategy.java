package lidalia.petclinic.tests.api;

import lidalia.petclinic.tests.inmemory.InMemoryTestEnvironment;

public class TestStrategy {

    private static TestEnvironment testEnvironment = new InMemoryTestEnvironment();

    public static PetClinicTestClient client() {
        return testEnvironment.client();
    }

    public static VetPreconditions given(Vet vet) {
        return testEnvironment.given(vet);
    }

    public static VetActions when(Vet vet) {
        return testEnvironment.when(vet);
    }
}
