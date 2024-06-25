import org.json.JSONObject;


import java.nio.file.Files;
import java.nio.file.Paths;


public class JsonMaker {
    public static String fileName = "C:\\Work\\Files\\NM_functional_2.txt";
    public static JSONObject readJSON() {
        try {
            String content = new String(Files.readAllBytes(Paths.get(fileName)));
            JSONObject contentJson = new JSONObject(content);
            return contentJson;
        }catch (Exception e){};
        return null;
    }

}
