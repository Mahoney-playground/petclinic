package lidalia.petclinic.tests.endtoend;

import lidalia.petclinic.tests.And;
import lidalia.petclinic.tests.Vet;

class VetActions implements lidalia.petclinic.tests.VetActions {

    private final Vet vet;

    VetActions(Vet vet) {
        this.vet = vet;
    }

    @Override
    public And<? extends lidalia.petclinic.tests.VetActions> joinsTheClinic() {
        return new And<>(this);
    }
}
