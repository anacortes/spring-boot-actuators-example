package hello;

import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MyEndpoint implements Endpoint<Map<String,String>> {

    public String getId() {
        return "myEndpoint";
    }

    public boolean isEnabled() {
        return true;
    }

    public boolean isSensitive() {
        return false;
    }

    public Map<String,String> invoke() {
        Map<String,String> info = new HashMap<>();
        info.put("key1", "value1");
        info.put("key2", "value2");
        return info;
    }
}
