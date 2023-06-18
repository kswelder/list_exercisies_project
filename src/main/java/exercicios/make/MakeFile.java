package exercicios.make;

import exercicios.model.LanguageModel;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class MakeFile {
    private List<LanguageModel> listLanguage = Arrays.asList(
            new LanguageModel("Python", "py", "\"\"\""),
            new LanguageModel("Ruby", "rb", "\"\"\""),
            new LanguageModel("JavaScript", "js", "\\**\\"),
            new LanguageModel("Java","java", "\\**\\"),
            new LanguageModel("C", "c", "\\**\\"),
            new LanguageModel("C++", "cpp", "\\**\\"),
            new LanguageModel("C#", "cs", "\\**\\")
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
    public void makeFolders(String language, String title, List<String> exercicies) {
        LanguageModel languageExample = this.findLanguage(language);
    }
    public static void makeFolders(String language, String title, List<String> exercicies, String path) {}
}
