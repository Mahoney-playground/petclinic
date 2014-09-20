package lidalia.petshop.tests.endtoend;

import lidalia.petshop.tests.And;
import lidalia.petshop.tests.Vet;

class VetPreconditions implements lidalia.petshop.tests.VetPreconditions {

    private final Vet vet;

    VetPreconditions(Vet vet) {
        this.vet = vet;
    }

    @Override
    public And<? extends lidalia.petshop.tests.VetPreconditions> isRegistered() {

        return new And<>(this);
    }

    @Override
    public And<? extends lidalia.petshop.tests.VetPreconditions> isNotEmployedByTheClinic() {
        return new And<>(this);
    }

}
