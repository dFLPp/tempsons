package dto.response.SpaceListReponse;

    public class PositionObject {
        private String href;

    public String getHref() {
        return href;
    }
    
    @Override
    public String toString() {
        return "PositionObject [href=" + href + "]";
    }

    public PositionObject() {
    }

    public PositionObject(String href) {
        this.href = href;
    }
    
}
