
package consumer.entities.DeviceRegister;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Errors {

    private List<String> combined = new ArrayList<String>();
    private Individual individual;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The combined
     */
    public List<String> getCombined() {
        return combined;
    }

    /**
     * 
     * @param combined
     *     The combined
     */
    public void setCombined(List<String> combined) {
        this.combined = combined;
    }

    /**
     * 
     * @return
     *     The individual
     */
    public Individual getIndividual() {
        return individual;
    }

    /**
     * 
     * @param individual
     *     The individual
     */
    public void setIndividual(Individual individual) {
        this.individual = individual;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
