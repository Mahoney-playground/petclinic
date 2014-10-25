package lidalia.petclinic.tests.api.inmemory;

import com.google.common.collect.ImmutableList;
import lidalia.petclinic.tests.api.Vet;
import lidalia.petclinic.tests.api.PetClinicTestClient;

class InMemoryPetClinicTestClient implements PetClinicTestClient {

    @Override
    public ImmutableList<Vet> getTheEmployeeList() {
        return ImmutableList.of();
    }
}
