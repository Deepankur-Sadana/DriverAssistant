
package consumer.entities.PatientInfo;

import java.util.HashMap;
import java.util.Map;

public class Data_ {

    private Integer id;
    private String name;
    private Object alt;
    private Object longitude;
    private Object latitude;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The alt
     */
    public Object getAlt() {
        return alt;
    }

    /**
     * 
     * @param alt
     *     The alt
     */
    public void setAlt(Object alt) {
        this.alt = alt;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    public Object getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    public void setLongitude(Object longitude) {
        this.longitude = longitude;
    }

    /**
     * 
     * @return
     *     The latitude
     */
    public Object getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    public void setLatitude(Object latitude) {
        this.latitude = latitude;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
