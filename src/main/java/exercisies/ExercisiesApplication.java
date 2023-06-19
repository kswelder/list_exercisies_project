package exercisies;

import exercisies.make.MakeExercisies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ExercisiesApplication {
    private static void help() {
        List<String> helpList = Arrays.asList(
                "--help",
                "-h         Help\n",
                "--language",
                "-l          Set yout language\n",
                "--path",
                "-p          Set path to make folders to you learn\n"
        );
        System.out.println("======================================================"+"\nWellcome to the List of exercicies of programing"+"\n");
        for(String help: helpList) {
            System.out.println(help);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );
        if(Optional.of(args).isPresent() && args.length > 0) {
            for(int x = 0; x < args.length; x++) {
                System.out.println(args[x].toString());
            }
        }
        else {
            help();
        }
        String language = "";
        System.out.println("Input your language: ");

        language = reader.readLine();
        System.out.println("Your input: [ "+language+" ]");

        MakeExercisies make = new MakeExercisies();
        if(language != "") {
            make.makeNow(language);
        }
        else {
            make.makeNow("Java");
        }

        System.out.println("End process...");
    }
}
