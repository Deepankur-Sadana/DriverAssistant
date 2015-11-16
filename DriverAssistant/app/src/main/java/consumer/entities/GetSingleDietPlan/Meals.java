
package consumer.entities.GetSingleDietPlan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Meals {

    private List<consumer.entities.GetSingleDietPlan.Mon> Mon = new ArrayList<consumer.entities.GetSingleDietPlan.Mon>();
    private List<consumer.entities.GetSingleDietPlan.Tue> Tue = new ArrayList<consumer.entities.GetSingleDietPlan.Tue>();
    private List<consumer.entities.GetSingleDietPlan.Wed> Wed = new ArrayList<consumer.entities.GetSingleDietPlan.Wed>();
    private List<consumer.entities.GetSingleDietPlan.Thu> Thu = new ArrayList<consumer.entities.GetSingleDietPlan.Thu>();
    private List<Frus> Fri = new ArrayList<Frus>();
    private List<consumer.entities.GetSingleDietPlan.Sat> Sat = new ArrayList<consumer.entities.GetSingleDietPlan.Sat>();
    private List<consumer.entities.GetSingleDietPlan.Sun> Sun = new ArrayList<consumer.entities.GetSingleDietPlan.Sun>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Mon
     */
    public List<consumer.entities.GetSingleDietPlan.Mon> getMon() {
        return Mon;
    }

    /**
     * 
     * @param Mon
     *     The Mon
     */
    public void setMon(List<consumer.entities.GetSingleDietPlan.Mon> Mon) {
        this.Mon = Mon;
    }

    /**
     * 
     * @return
     *     The Tue
     */
    public List<consumer.entities.GetSingleDietPlan.Tue> getTue() {
        return Tue;
    }

    /**
     * 
     * @param Tue
     *     The Tue
     */
    public void setTue(List<consumer.entities.GetSingleDietPlan.Tue> Tue) {
        this.Tue = Tue;
    }

    /**
     * 
     * @return
     *     The Wed
     */
    public List<consumer.entities.GetSingleDietPlan.Wed> getWed() {
        return Wed;
    }

    /**
     * 
     * @param Wed
     *     The Wed
     */
    public void setWed(List<consumer.entities.GetSingleDietPlan.Wed> Wed) {
        this.Wed = Wed;
    }

    /**
     * 
     * @return
     *     The Thu
     */
    public List<consumer.entities.GetSingleDietPlan.Thu> getThu() {
        return Thu;
    }

    /**
     * 
     * @param Thu
     *     The Thu
     */
    public void setThu(List<consumer.entities.GetSingleDietPlan.Thu> Thu) {
        this.Thu = Thu;
    }

    /**
     * 
     * @return
     *     The Fri
     */
    public List<Frus> getFri() {
        return Fri;
    }

    /**
     * 
     * @param Fri
     *     The Fri
     */
    public void setFri(List<Frus> Fri) {
        this.Fri = Fri;
    }

    /**
     * 
     * @return
     *     The Sat
     */
    public List<consumer.entities.GetSingleDietPlan.Sat> getSat() {
        return Sat;
    }

    /**
     * 
     * @param Sat
     *     The Sat
     */
    public void setSat(List<consumer.entities.GetSingleDietPlan.Sat> Sat) {
        this.Sat = Sat;
    }

    /**
     * 
     * @return
     *     The Sun
     */
    public List<consumer.entities.GetSingleDietPlan.Sun> getSun() {
        return Sun;
    }

    /**
     * 
     * @param Sun
     *     The Sun
     */
    public void setSun(List<consumer.entities.GetSingleDietPlan.Sun> Sun) {
        this.Sun = Sun;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
