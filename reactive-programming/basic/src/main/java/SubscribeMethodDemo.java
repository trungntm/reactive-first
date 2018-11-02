import reactor.core.publisher.Flux;

public class SubscribeMethodDemo {
    public static void subscribe(){
        Flux<Integer> ints = Flux.range(1, 3);
        ints.subscribe();
        System.out.println(ints.subscribe().isDisposed());
    }
}
