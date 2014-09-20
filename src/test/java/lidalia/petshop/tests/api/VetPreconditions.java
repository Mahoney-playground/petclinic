package lidalia.petshop.tests.api;

public interface VetPreconditions {
    And<? extends VetPreconditions> isRegistered();

    And<? extends VetPreconditions> isNotEmployedByTheClinic();
}
