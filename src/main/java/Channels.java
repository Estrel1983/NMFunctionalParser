import org.json.JSONArray;
import org.json.JSONObject;

public class Channels {
    private String channelType;
    private String mimeType;
    private String queue;
    private String templateId;
    private String templatePath;
    private Templates [] templates;

    public Channels (JSONObject curChannel){
        this.channelType = curChannel.optString("channelType", "");
        this.mimeType = curChannel.optString("mimeType", "");
        this.queue = curChannel.optString("queue", "");
        this.templateId = curChannel.optString("templateId", "");
        this.templatePath = curChannel.optString("templatePath", "");
        JSONArray templateArray = curChannel.optJSONArray("templates");
        this.templates = new Templates [templateArray.length()];
        for (int i = 0; i < templateArray.length(); i++)
            templates[i] = new Templates (templateArray.getJSONObject(i));
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getTemplatePath() {
        return templatePath;
    }

    public void setTemplatePath(String templatePath) {
        this.templatePath = templatePath;
    }

    public Templates[] getTemplates() {
        return templates;
    }

    public void setTemplates(Templates[] templates) {
        this.templates = templates;
    }
}
