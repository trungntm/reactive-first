import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

public class FluxDemo {
    public static void createFlux(){
        Flux<String> seq1 = Flux.just("foo", "bar", "foobar"); // create a flux from objects. At here, I create from some strings
        List<String> iterable = Arrays.asList("foo", "bar", "foobar");
        Flux<String> seq2 = Flux.fromIterable(iterable); // convert to flux from list
    }
}
