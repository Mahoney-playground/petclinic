package lidalia.petshop.tests.api;

public interface TestEnvironment {

    public PetClinicTestClient client();
    public VetPreconditions given(Vet vet);
    public VetActions when(Vet vet);
}
