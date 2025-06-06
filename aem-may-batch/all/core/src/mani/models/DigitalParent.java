package com.adobe.aem.may.batch.core.models;
import java.util.List;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DigitalParent {

    @ValueMapValue
    private String text;

    @ValueMapValue
    private String des;

    @ValueMapValue
    private int num;

    @ValueMapValue
    private String color;

    @ChildResource(name = "bookdetails") 
    private List<DigitalChild> bookdetails;

    public String getText() {
        return text;
    }

    public String getDes() {
        return des;
    }

    public int getNum() {
        return num;
    }

    public String getColor() {
        return color;
    }

    public List<DigitalChild> getBookdetails() {
        return bookdetails;
    }
}
