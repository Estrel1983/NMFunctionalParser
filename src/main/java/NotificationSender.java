import org.json.JSONObject;

public class NotificationSender {
    private String channelType;
    private String language;
    private String notificationFamily;
    private String notificationType;
    private String sender;
    private int tenantId;

    public NotificationSender(String channelType, String language, String notificationFamily, String notificationType, String sender, int tenantId) {
        this.channelType = channelType;
        this.language = language;
        this.notificationFamily = notificationFamily;
        this.notificationType = notificationType;
        this.sender = sender;
        this.tenantId = tenantId;
    }
    public NotificationSender (JSONObject notificationSender){
        this.channelType = notificationSender.optString("channelType", "");
        this.language = notificationSender.optString("language", "");
        this.notificationFamily = notificationSender.optString("notificationFamily", "");
        this.notificationType = notificationSender.optString("notificationType", "");
        this.sender = notificationSender.optString("sender", "");
        this.tenantId = notificationSender.optInt("tenantId", 0);
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getNotificationFamily() {
        return notificationFamily;
    }

    public void setNotificationFamily(String notificationFamily) {
        this.notificationFamily = notificationFamily;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }
}
