package lidalia.petclinic.tests.endtoend;

import com.google.common.collect.ImmutableList;
import lidalia.petclinic.tests.api.Vet;

class PetClinicTestClient implements lidalia.petclinic.tests.api.PetClinicTestClient {

    @Override
    public ImmutableList<Vet> getTheEmployeeList() {
        return ImmutableList.of();
    }
}
