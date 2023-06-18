package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ExerciciosApplication {
    private static void help() {
        List<String> helpList = Arrays.asList(
                ""
        );
        System.out.println("======================================================"+"\nWellcome to the List of exercicies of programin"+"\n======================================================");
    }

    public static void main(String[] args) {
        System.out.println("OK\n");
        if(Optional.of(args).isPresent() && args.length > 0) {
            for(int x = 0; x < args.length; x++) {
                System.out.println(args[x].toString());
            }
        }
        else {
            help();
        }
    }
}
