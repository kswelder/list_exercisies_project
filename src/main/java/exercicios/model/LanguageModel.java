package exercicios.model;

public class LanguageModel {
    private String language;
    private String extencion;
    private String comment;

    public String getLanguage() {
        return this.language;
    }
    public LanguageModel() {}
    public LanguageModel(String language, String extencion, String comment) {
        this.language = language;
        this.extencion = extencion;
        this.comment = comment;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getExtencion() {
        return this.extencion;
    }

    public void setExtencion(String extencion) {
        this.extencion = extencion;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
