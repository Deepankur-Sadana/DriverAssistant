
package consumer.entities.PatientInfo;

import java.util.HashMap;
import java.util.Map;

public class State {

    private Data__ data;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The data
     */
    public Data__ getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(Data__ data) {
        this.data = data;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
