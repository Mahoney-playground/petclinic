package lidalia.petclinic.tests.api.endtoend;

import lidalia.petclinic.tests.api.And;
import lidalia.petclinic.tests.api.Vet;

class VetActions implements lidalia.petclinic.tests.api.VetActions {

    private final Vet vet;

    VetActions(Vet vet) {
        this.vet = vet;
    }

    @Override
    public And<? extends lidalia.petclinic.tests.api.VetActions> joinsTheClinic() {
        return new And<>(this);
    }
}
