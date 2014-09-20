package lidalia.petshop.tests.endtoend;

import lidalia.petshop.tests.api.And;
import lidalia.petshop.tests.api.Vet;

class VetPreconditions implements lidalia.petshop.tests.api.VetPreconditions {

    private final Vet vet;

    VetPreconditions(Vet vet) {
        this.vet = vet;
    }

    @Override
    public And<? extends lidalia.petshop.tests.api.VetPreconditions> isRegistered() {

        return new And<>(this);
    }

    @Override
    public And<? extends lidalia.petshop.tests.api.VetPreconditions> isNotEmployedByTheClinic() {
        return new And<>(this);
    }

}
