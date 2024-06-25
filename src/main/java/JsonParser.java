import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.stream.Stream;

public class JsonParser {
    public static NotificationSender[] parseToNotificationSender(JSONObject nmFunctional) {
        JSONArray notifSenderList = nmFunctional.getJSONArray("NotificationSenderMap");
        NotificationSender[] responce = new NotificationSender[notifSenderList.length()];
        for (int i = 0; i < notifSenderList.length(); i++)
            responce[i] = new NotificationSender(notifSenderList.getJSONObject(i));
        return responce;
    }

    public static Configurations[] parseToConfigurations(JSONObject nmFunctional){
        JSONArray configList = nmFunctional.getJSONArray("configurations");
        Configurations [] responce = new Configurations[configList.length()];
        for (int i = 0; i < configList.length(); i++)
            responce[i] = new Configurations(configList.getJSONObject(i));
        return responce;
    }
}
