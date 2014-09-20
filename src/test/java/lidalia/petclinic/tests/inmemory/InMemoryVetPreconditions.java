package lidalia.petclinic.tests.inmemory;

import lidalia.petclinic.tests.api.And;
import lidalia.petclinic.tests.api.Vet;
import lidalia.petclinic.tests.api.VetPreconditions;

class InMemoryVetPreconditions implements VetPreconditions {

    private final Vet vet;

    InMemoryVetPreconditions(Vet vet) {
        this.vet = vet;
    }

    @Override
    public And<? extends VetPreconditions> isRegistered() {
        return new And<>(this);
    }

    @Override
    public And<? extends VetPreconditions> isNotEmployedByTheClinic() {
        return new And<>(this);
    }

}
