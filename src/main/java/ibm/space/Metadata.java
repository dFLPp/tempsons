package ibm.space;

import java.util.Date;

public class Metadata {
    private String id;
    private String url;
    private String creator_id;
    private Date created_at;
    private Date updated_at;

    
    @Override
    public String toString() {
        return "Metadata [id=" + id + ", url=" + url + ", creator_id=" + creator_id + ", created_at=" + created_at
                + ", updated_at=" + updated_at + "]";
    }
    public Metadata() {
    }
    public String getId() {
        return id;
    }
    public String getUrl() {
        return url;
    }
    public String getCreator_id() {
        return creator_id;
    }
    public Date getCreated_at() {
        return created_at;
    }
    public Date getUpdated_at() {
        return updated_at;
    }
    public Metadata(String id, String url, String creator_id, Date created_at,
            Date updated_at) {
        this.id = id;
        this.url = url;
        this.creator_id = creator_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
}
