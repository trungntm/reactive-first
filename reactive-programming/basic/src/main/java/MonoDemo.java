import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoDemo {
    public static void createMono(){
        Mono<String> noData = Mono.empty();

        Mono<String> data = Mono.just("foo");
        System.out.println(data.block());

        Flux<Integer> numbersFromFiveToSeven = Flux.range(5, 3);
    }
}
