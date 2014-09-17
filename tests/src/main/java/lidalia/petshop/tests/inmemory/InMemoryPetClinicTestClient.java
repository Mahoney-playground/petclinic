package lidalia.petclinic.tests.inmemory;

import com.google.common.collect.ImmutableList;
import lidalia.petclinic.tests.Vet;
import lidalia.petclinic.tests.PetClinicTestClient;

class InMemoryPetClinicTestClient implements PetClinicTestClient {

    @Override
    public ImmutableList<Vet> getTheEmployeeList() {
        return ImmutableList.of();
    }
}
