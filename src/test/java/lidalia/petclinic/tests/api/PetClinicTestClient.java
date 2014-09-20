package lidalia.petclinic.tests.api;

import com.google.common.collect.ImmutableList;

public interface PetClinicTestClient {
    ImmutableList<Vet> getTheEmployeeList();
}
