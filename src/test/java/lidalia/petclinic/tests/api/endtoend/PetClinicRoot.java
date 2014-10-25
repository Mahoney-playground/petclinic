package lidalia.petclinic.tests.api.endtoend;

import javax.ws.rs.core.Link;
import java.util.List;

/**
 * Created by Robert on 06/10/2014.
 */
public class PetClinicRoot {

    private final List<Link> links;

    public PetClinicRoot(List<Link> links) {
        this.links = links;
    }

    public Link linkToCorporate() {
        throw new UnsupportedOperationException("Not implemented");
//        return links.stream().filter(link -> link.getType().equals()).findFirst().get();
    }
}
