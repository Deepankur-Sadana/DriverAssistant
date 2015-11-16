
package consumer.entities.ActivePlan;

import java.util.HashMap;
import java.util.Map;

public class ActivePlanAPIResponse {

    private long status;
    private Object message;
    private Data data;
    private Object errors;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The status
     */
    public long getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(long status) {
        this.status = status;
    }

    public ActivePlanAPIResponse withStatus(long status) {
        this.status = status;
        return this;
    }

    /**
     * 
     * @return
     *     The message
     */
    public Object getMessage() {
        return message;
    }

    /**
     * 
     * @param message
     *     The message
     */
    public void setMessage(Object message) {
        this.message = message;
    }

    public ActivePlanAPIResponse withMessage(Object message) {
        this.message = message;
        return this;
    }

    /**
     * 
     * @return
     *     The data
     */
    public Data getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(Data data) {
        this.data = data;
    }

    public ActivePlanAPIResponse withData(Data data) {
        this.data = data;
        return this;
    }

    /**
     * 
     * @return
     *     The errors
     */
    public Object getErrors() {
        return errors;
    }

    /**
     * 
     * @param errors
     *     The errors
     */
    public void setErrors(Object errors) {
        this.errors = errors;
    }

    public ActivePlanAPIResponse withErrors(Object errors) {
        this.errors = errors;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public ActivePlanAPIResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
