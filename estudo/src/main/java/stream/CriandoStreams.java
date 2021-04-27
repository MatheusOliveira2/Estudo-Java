package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;


public class CriandoStreams {
    public static void main(String[] args) {
        
        Consumer<String> print = System.out::print;

        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);

        String[] maisLangs = {"Python ", "Lisp ", "Perl ", "GO\n"};

        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1 ,3).forEach(print);

        List<String> outrasLangs = Arrays.asList("Python2 ", "Lisp2 ", "Perl2 ", "GO2\n");
        outrasLangs.parallelStream().forEach(print);

    }
}
