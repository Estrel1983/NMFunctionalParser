import org.json.JSONArray;
import org.json.JSONObject;

public class Configurations {
    private Channels[] channels;
    private String defaultChannel;
    private String handler;
    private String notificationFamily;
    private String notificationGroup;
    private String notificationType;
    private int priority;

    public Configurations(JSONObject curConfig) {
        JSONArray curChannels = curConfig.getJSONArray("channels");
        this.channels = new Channels[curChannels.length()];
        for (int i = 0; i < curChannels.length(); i++)
            this.channels[i] = new Channels(curChannels.getJSONObject(i));
        this.defaultChannel = curConfig.optString("defaultChannel", "");
        this.handler = curConfig.optString("handler", "");
        this.notificationFamily = curConfig.optString("notificationFamily", "");
        this.notificationGroup = curConfig.optString("notificationGroup", "");
        this.notificationType = curConfig.optString("notificationType", "");
        this.priority = curConfig.optInt("priority", 0);
    }
    public Channels[] getChannels() {
        return channels;
    }

    public void setChannels(Channels[] channels) {
        this.channels = channels;
    }

    public String getDefaultChannel() {
        return defaultChannel;
    }

    public void setDefaultChannel(String defaultChannel) {
        this.defaultChannel = defaultChannel;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public String getNotificationFamily() {
        return notificationFamily;
    }

    public void setNotificationFamily(String notificationFamily) {
        this.notificationFamily = notificationFamily;
    }

    public String getNotificationGroup() {
        return notificationGroup;
    }

    public void setNotificationGroup(String notificationGroup) {
        this.notificationGroup = notificationGroup;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
