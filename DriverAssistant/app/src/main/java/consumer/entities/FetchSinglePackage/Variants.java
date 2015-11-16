
package consumer.entities.FetchSinglePackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Variants {

    private List<VariantDetails> data = new ArrayList<VariantDetails>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The data
     */
    public List<VariantDetails> getData() {
        return data;
    }

    /**
     *
     * @param data
     *     The data
     */
    public void setData(List<VariantDetails> data) {
        this.data = data;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
