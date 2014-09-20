package lidalia.petshop.tests;

import static com.google.common.base.Preconditions.checkNotNull;

public class Vet {

    private final String firstName;
    private final String lastName;

    Vet(
            String firstName,
            String lastName) {

        this.firstName = checkNotNull(firstName);
        this.lastName = checkNotNull(lastName);
    }

    String firstName() {
        return firstName;
    }

    String lastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Vet{"+firstName+" "+lastName+'}';
    }
}
