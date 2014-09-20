package lidalia.petshop.tests.endtoend;

import lidalia.petshop.tests.api.And;
import lidalia.petshop.tests.api.Vet;

class VetActions implements lidalia.petshop.tests.api.VetActions {

    private final Vet vet;

    VetActions(Vet vet) {
        this.vet = vet;
    }

    @Override
    public And<? extends lidalia.petshop.tests.api.VetActions> joinsTheClinic() {
        return new And<>(this);
    }
}
