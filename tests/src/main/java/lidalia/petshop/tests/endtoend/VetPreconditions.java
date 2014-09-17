package lidalia.petclinic.tests.endtoend;

import lidalia.petclinic.tests.And;
import lidalia.petclinic.tests.Vet;

class VetPreconditions implements lidalia.petclinic.tests.VetPreconditions {

    private final Vet vet;

    VetPreconditions(Vet vet) {
        this.vet = vet;
    }

    @Override
    public And<? extends lidalia.petclinic.tests.VetPreconditions> isRegistered() {

        return new And<>(this);
    }

    @Override
    public And<? extends lidalia.petclinic.tests.VetPreconditions> isNotEmployedByTheClinic() {
        return new And<>(this);
    }

}
