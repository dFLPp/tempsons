package dto.response.SpaceListReponse;

import java.util.List;

import ibm.space.Space;
import jakarta.json.bind.annotation.JsonbCreator;

public class SpaceListReponse {
    private Integer total_count;
    private Integer limit;
    private PositionObject first;
    private PositionObject next;
    private List<Space> resources;
    
    public Integer getTotal_count() {
        return total_count;
    }
    public Integer getLimit() {
        return limit;
    }
    public PositionObject getFirst() {
        return first;
    }
    public PositionObject getNext() {
        return next;
    }
    public List<Space> getResources() {
        return resources;
    }

    @JsonbCreator
    public SpaceListReponse(Integer total_count, Integer limit, PositionObject first, PositionObject next,
            List<Space> resources) {
        this.total_count = total_count;
        this.limit = limit;
        this.first = first;
        this.next = next;
        this.resources = resources;
    }    
}
