import org.json.JSONObject;

public class Templates {
    private String language;
    private String name;

    public Templates(JSONObject curTemplate) {
        this.language = curTemplate.optString("language", "");
        this.name = curTemplate.optString("name", "");
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
