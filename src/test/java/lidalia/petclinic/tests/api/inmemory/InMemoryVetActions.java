package lidalia.petclinic.tests.api.inmemory;

import lidalia.petclinic.tests.api.And;
import lidalia.petclinic.tests.api.VetActions;
import lidalia.petclinic.tests.api.Vet;

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
