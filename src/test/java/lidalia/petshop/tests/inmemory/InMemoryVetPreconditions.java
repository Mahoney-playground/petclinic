package lidalia.petshop.tests.inmemory;

import lidalia.petshop.tests.api.And;
import lidalia.petshop.tests.api.Vet;
import lidalia.petshop.tests.api.VetPreconditions;

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
