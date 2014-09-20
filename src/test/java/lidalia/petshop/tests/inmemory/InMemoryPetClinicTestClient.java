package lidalia.petshop.tests.inmemory;

import com.google.common.collect.ImmutableList;
import lidalia.petshop.tests.Vet;
import lidalia.petshop.tests.PetClinicTestClient;

class InMemoryPetClinicTestClient implements PetClinicTestClient {

    @Override
    public ImmutableList<Vet> getTheEmployeeList() {
        return ImmutableList.of();
    }
}
