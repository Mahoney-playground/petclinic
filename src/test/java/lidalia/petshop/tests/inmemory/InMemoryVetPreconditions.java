package lidalia.petshop.tests.inmemory;

import lidalia.petshop.tests.And;
import lidalia.petshop.tests.Vet;
import lidalia.petshop.tests.VetPreconditions;

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
