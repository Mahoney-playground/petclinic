package lidalia.petshop.tests.inmemory;

import lidalia.petshop.tests.And;
import lidalia.petshop.tests.VetActions;
import lidalia.petshop.tests.Vet;

class InMemoryVetActions implements VetActions {

    private final Vet vet;

    InMemoryVetActions(Vet vet) {
        this.vet = vet;
    }

    @Override
    public And<? extends VetActions> joinsTheClinic() {
        return new And<>(this);
    }
}
