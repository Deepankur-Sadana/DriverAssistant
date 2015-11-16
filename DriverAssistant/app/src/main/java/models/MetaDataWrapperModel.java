package models;

import java.io.Serializable;

/**
 * Created by Neelanjana on 8/2/15
 */
public class MetaDataWrapperModel implements Serializable {
    private String metaDataString;

    public String getMetaDataString() {
        return metaDataString;
    }

    public void setMetaDataString(String metaDataString) {
        this.metaDataString = metaDataString;
    }
}
