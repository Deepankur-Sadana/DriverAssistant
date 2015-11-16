
package consumer.entities.HealthTips;

import java.util.HashMap;
import java.util.Map;

public class User {

    private UserData data;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The data
     */
    public UserData getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(UserData data) {
        this.data = data;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
