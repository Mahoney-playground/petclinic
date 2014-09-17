package lidalia.petclinic.tests;

import lidalia.petclinic.tests.And;

public interface VetPreconditions {
    And<? extends VetPreconditions> isRegistered();

    And<? extends VetPreconditions> isNotEmployedByTheClinic();
}
