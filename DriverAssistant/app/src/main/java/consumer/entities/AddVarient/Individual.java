
package consumer.entities.AddVarient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Individual {

    private List<String> package_id = new ArrayList<String>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The package_id
     */
    public List<String> getPackage_id() {
        return package_id;
    }

    /**
     * 
     * @param package_id
     *     The package_id
     */
    public void setPackage_id(List<String> package_id) {
        this.package_id = package_id;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
