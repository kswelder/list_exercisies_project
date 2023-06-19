package exercisies.make;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import exercisies.model.LanguageModel;

public class MakeFile {
    private List<LanguageModel> listLanguage = Arrays.asList(
            new LanguageModel("Python", "py", "\"\"\""),
            new LanguageModel("Ruby", "rb", "\"\"\""),
            new LanguageModel("JavaScript", "js", "//"),
            new LanguageModel("Java","java", "//"),
            new LanguageModel("C", "c", "//"),
            new LanguageModel("C++", "cpp", "//"),
            new LanguageModel("C#", "cs", "//")
    );
    private static void makeFolder(String folders) {
        File dir = new File(folders);
        if(!dir.exists()) dir.mkdir();
    }
    private LanguageModel findLanguage(String language) {
        LanguageModel languageExample = new LanguageModel();
        this.listLanguage.stream().map(value -> {
            if(value.getLanguage().toLowerCase() == language.toLowerCase()) {
                languageExample.setLanguage(value.getLanguage());
                languageExample.setExtencion(value.getExtencion());
                languageExample.setComment(value.getComment());
            }
            return null;
        });
        return languageExample;
    }
    public void makeFolders(String language, String title, List<String> exercicies) throws IOException {
        LanguageModel languageExample = this.findLanguage(language);
        File file = new File("./dev");
        int count = 1;
        if(! file.exists()) {
            file.mkdirs();
        }
        File lang = new File("./dev/"+language.toString().toLowerCase());
        if(!lang.exists()) {
            lang.mkdirs();
        }
        File subFile = new File("./dev/" + language.toString().toLowerCase() + "/" + title);
        if (!subFile.exists()) {
            subFile.mkdirs();
        }
        for (LanguageModel list : this.listLanguage) {
            if (list.getLanguage().toString().toLowerCase().equals(language.toLowerCase())) {
                for (String exercisie : exercicies) {
                    String pathname = "./dev/" + language.toString().toLowerCase() + "/" + title + "/Ex" + count + "." + list.getExtencion();
                    File archive = new File(pathname.toString());
                    BufferedWriter output = new BufferedWriter(new FileWriter(archive));
                    if (list.getComment() == "//") {
                        output.write("/*" + exercisie + "*/");
                        output.close();
                    } else {
                        output.write(list.getComment() + exercisie + list.getComment());
                        output.close();
                    }
                    count++;
                }
            }
        }
    }
    public void makeFolders(String path, String language, String title, List<String> exercicies) throws IOException {
        LanguageModel languageExample = this.findLanguage(language);
        File file = new File(path+"/dev");
        int count = 1;
        if(! file.exists()) {
            file.mkdirs();
        }
        File lang = new File(path+"/dev/"+language.toString().toLowerCase());
        if(!lang.exists()) {
            lang.mkdirs();
        }
        File subFile = new File(path + "/dev/" + language.toString().toLowerCase() + "/" + title);
        if (!subFile.exists()) {
            subFile.mkdirs();
        }
        for (LanguageModel list : this.listLanguage) {
            if (list.getLanguage().toString().toLowerCase().equals(language.toLowerCase())) {
                for (String exercisie : exercicies) {
                    String pathname = path + "/dev/" + language.toString().toLowerCase() + "/" + title + "/Ex" + count + "." + list.getExtencion();
                    File archive = new File(pathname.toString());
                    BufferedWriter output = new BufferedWriter(new FileWriter(archive));
                    if (list.getComment() == "//") {
                        output.write("/*" + exercisie + "*/");
                        output.close();
                    } else {
                        output.write(list.getComment() + exercisie + list.getComment());
                        output.close();
                    }
                    count++;
                }
            }
        }
    }
}
