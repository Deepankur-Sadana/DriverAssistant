
package consumer.entities.ActivePlan;

import java.util.HashMap;
import java.util.Map;

public class Data {

    private Plan plan;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The plan
     */
    public Plan getPlan() {
        return plan;
    }

    /**
     * @param plan The plan
     */
    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public Data withPlan(Plan plan) {
        this.plan = plan;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Data withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
