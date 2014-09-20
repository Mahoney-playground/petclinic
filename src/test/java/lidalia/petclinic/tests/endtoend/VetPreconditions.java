package lidalia.petclinic.tests.endtoend;

import lidalia.petclinic.tests.api.And;
import lidalia.petclinic.tests.api.Vet;

class VetPreconditions implements lidalia.petclinic.tests.api.VetPreconditions {

    private final Vet vet;

    VetPreconditions(Vet vet) {
        this.vet = vet;
    }

    @Override
    public And<? extends lidalia.petclinic.tests.api.VetPreconditions> isRegistered() {

        return new And<>(this);
    }

    @Override
    public And<? extends lidalia.petclinic.tests.api.VetPreconditions> isNotEmployedByTheClinic() {
        return new And<>(this);
    }

}
