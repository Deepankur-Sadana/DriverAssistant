
package consumer.entities.DeviceRegister;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Individual {

    private List<String> os = new ArrayList<String>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The os
     */
    public List<String> getOs() {
        return os;
    }

    /**
     * 
     * @param os
     *     The os
     */
    public void setOs(List<String> os) {
        this.os = os;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
