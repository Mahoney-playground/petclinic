package lidalia.petshop.tests.endtoend;

import com.google.common.collect.ImmutableList;
import lidalia.petshop.tests.Vet;

class PetClinicTestClient implements lidalia.petshop.tests.PetClinicTestClient {

    @Override
    public ImmutableList<Vet> getTheEmployeeList() {
        return ImmutableList.of();
    }
}
