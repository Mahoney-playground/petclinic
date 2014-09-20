package lidalia.petshop.tests.api;

import com.google.common.collect.ImmutableCollection;

import static com.google.common.base.Preconditions.checkNotNull;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.assertThat;

public class Assertions {

    public static <T> CollectionAssertions<T> then(ImmutableCollection<T> collection) {
        return new CollectionAssertions<>(collection);
    }

    public static class CollectionAssertions<T> {

        private final ImmutableCollection<T> collection;

        private CollectionAssertions(ImmutableCollection<T> collection) {
            this.collection = checkNotNull(collection);
        }

        public void shouldContain(T element) {
            assertThat(collection, contains(element));
        }
    }
}
