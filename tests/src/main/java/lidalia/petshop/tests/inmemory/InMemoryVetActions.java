package lidalia.petclinic.tests.inmemory;

import lidalia.petclinic.tests.And;
import lidalia.petclinic.tests.VetActions;
import lidalia.petclinic.tests.Vet;

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
