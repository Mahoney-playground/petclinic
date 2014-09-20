package lidalia.petshop.tests.inmemory;

import com.google.common.collect.ImmutableList;
import lidalia.petshop.tests.api.Vet;
import lidalia.petshop.tests.api.PetClinicTestClient;

class InMemoryPetClinicTestClient implements PetClinicTestClient {

    @Override
    public ImmutableList<Vet> getTheEmployeeList() {
        return ImmutableList.of();
    }
}
