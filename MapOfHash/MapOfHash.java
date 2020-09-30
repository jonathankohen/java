import java.util.*;

public class MapOfHash {
    public static void main(String[] args) {
        HashMap<String, String> tracklist = new HashMap<String, String>();
        tracklist.put("Exeter is Sick", "Exeter is so heckin' sick dude");
        tracklist.put("Teignmouth", "I've got a Teignmouth for you right here!");
        tracklist.put("Liverpool Sucks", "Beatles had it wrong");
        tracklist.put("River Teign", "River Teign, drag me to the sea");
        
        Set<String> keys = tracklist.keySet();
        for(String key : keys) {
            System.out.println(key + ":" + " " + tracklist.get(key));
        }
    }
}
