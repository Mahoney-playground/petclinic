package lidalia.petclinic.tests;

public interface TestEnvironment {

    public PetClinicTestClient client();
    public VetPreconditions given(Vet vet);
    public VetActions when(Vet vet);
}
