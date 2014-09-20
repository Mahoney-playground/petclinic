package lidalia.petshop.tests.endtoend;

import lidalia.petshop.tests.And;
import lidalia.petshop.tests.Vet;

class VetActions implements lidalia.petshop.tests.VetActions {

    private final Vet vet;

    VetActions(Vet vet) {
        this.vet = vet;
    }

    @Override
    public And<? extends lidalia.petshop.tests.VetActions> joinsTheClinic() {
        return new And<>(this);
    }
}
