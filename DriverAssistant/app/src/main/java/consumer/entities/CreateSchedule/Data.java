
package consumer.entities.CreateSchedule;

import java.util.HashMap;
import java.util.Map;

public class Data {

    private Data_ data;
    private String fee;
    private Schedules schedules;
    private Integer consultation_fee;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The data
     */
    public Data_ getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(Data_ data) {
        this.data = data;
    }

    /**
     * 
     * @return
     *     The fee
     */
    public String getFee() {
        return fee;
    }

    /**
     * 
     * @param fee
     *     The fee
     */
    public void setFee(String fee) {
        this.fee = fee;
    }

    /**
     * 
     * @return
     *     The schedules
     */
    public Schedules getSchedules() {
        return schedules;
    }

    /**
     * 
     * @param schedules
     *     The schedules
     */
    public void setSchedules(Schedules schedules) {
        this.schedules = schedules;
    }

    /**
     * 
     * @return
     *     The consultation_fee
     */
    public Integer getConsultation_fee() {
        return consultation_fee;
    }

    /**
     * 
     * @param consultation_fee
     *     The consultation_fee
     */
    public void setConsultation_fee(Integer consultation_fee) {
        this.consultation_fee = consultation_fee;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
