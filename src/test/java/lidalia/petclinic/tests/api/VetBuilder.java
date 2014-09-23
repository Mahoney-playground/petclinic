package lidalia.petclinic.tests.api;

import java.util.Random;

import static com.google.common.base.Preconditions.checkNotNull;

public class VetBuilder {

    private String firstName = "Joe";
    private String lastName = "Bloggs";

    private VetBuilder() {}

    public static VetBuilder aVet() {
        return new VetBuilder();
    }

    public static VetBuilder aRandomVet() {
        return new VetBuilder()
                .withFirstName(randomFirstName())
                .withLastName(randomLastName());
    }

    private static String randomFirstName() {
        return oneOf("Sarah", "Joe", "Anne", "Mike");
    }

    private static String randomLastName() {
        return oneOf("Smith", "Jones", "Farmer");
    }

    @SafeVarargs
    private static <T> T oneOf(T... options) {
        int chosen = new Random().nextInt(options.length);
        return options[chosen];
    }

    public VetBuilder withFirstName(String firstName) {
        this.firstName = checkNotNull(firstName);
        return this;
    }

    public VetBuilder withLastName(String lastName) {
        this.lastName = checkNotNull(lastName);
        return this;
    }

    public Vet build() {
        return new Vet(
                firstName,
                lastName
        );
    }
}
