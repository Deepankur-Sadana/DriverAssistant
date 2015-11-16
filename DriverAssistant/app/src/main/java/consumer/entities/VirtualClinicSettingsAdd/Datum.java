
package consumer.entities.VirtualClinicSettingsAdd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Datum {

    private Integer schedule_id;
    private List<String> days = new ArrayList<String>();
    private String started_at;
    private String ended_at;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The schedule_id
     */
    public Integer getSchedule_id() {
        return schedule_id;
    }

    /**
     * 
     * @param schedule_id
     *     The schedule_id
     */
    public void setSchedule_id(Integer schedule_id) {
        this.schedule_id = schedule_id;
    }

    /**
     * 
     * @return
     *     The days
     */
    public List<String> getDays() {
        return days;
    }

    /**
     * 
     * @param days
     *     The days
     */
    public void setDays(List<String> days) {
        this.days = days;
    }

    /**
     * 
     * @return
     *     The started_at
     */
    public String getStarted_at() {
        return started_at;
    }

    /**
     * 
     * @param started_at
     *     The started_at
     */
    public void setStarted_at(String started_at) {
        this.started_at = started_at;
    }

    /**
     * 
     * @return
     *     The ended_at
     */
    public String getEnded_at() {
        return ended_at;
    }

    /**
     * 
     * @param ended_at
     *     The ended_at
     */
    public void setEnded_at(String ended_at) {
        this.ended_at = ended_at;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
