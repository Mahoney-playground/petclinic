package lidalia.petshop.tests;

import static com.google.common.base.Preconditions.checkNotNull;

public class VetBuilder {

    private String firstName = "Joe";
    private String lastName = "Bloggs";

    private VetBuilder() {}

    public static VetBuilder aVet() {
        return new VetBuilder();
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
