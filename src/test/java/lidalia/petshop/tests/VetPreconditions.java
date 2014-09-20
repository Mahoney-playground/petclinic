package lidalia.petshop.tests;

public interface VetPreconditions {
    And<? extends VetPreconditions> isRegistered();

    And<? extends VetPreconditions> isNotEmployedByTheClinic();
}
