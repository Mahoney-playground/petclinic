package lidalia.petshop.tests.inmemory;

import lidalia.petshop.tests.api.And;
import lidalia.petshop.tests.api.VetActions;
import lidalia.petshop.tests.api.Vet;

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
