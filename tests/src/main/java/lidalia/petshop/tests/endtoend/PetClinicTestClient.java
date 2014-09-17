package lidalia.petclinic.tests.endtoend;

import com.google.common.collect.ImmutableList;
import lidalia.petclinic.tests.Vet;

class PetClinicTestClient implements lidalia.petclinic.tests.PetClinicTestClient {

    @Override
    public ImmutableList<Vet> getTheEmployeeList() {
        return ImmutableList.of();
    }
}
