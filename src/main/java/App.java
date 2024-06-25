import org.json.JSONObject;

public class App {
    public static void main(String[] args) {
        JSONObject fileContent = JsonMaker.readJSON();
        if (fileContent == null) {return;}
        NotificationSender [] notifSender = JsonParser.parseToNotificationSender(fileContent);
        Configurations [] configurations = JsonParser.parseToConfigurations(fileContent);
        return;
    }
}
