package in.net.sudhir.databackupcassandraonline.model;

import javax.persistence.*;

/***
 Package Name: in.net.sudhir.databackupcassandraonline.model
 User Name: SUDHIR
 Created Date: 01-09-2022 at 17:22
 Description:
 */
@Entity
public class BlockedEmailIds {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "BLOCKED_EMAIL_ID", nullable = false)
    private String blockedEmailId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBlockedEmailId() {
        return blockedEmailId;
    }

    public void setBlockedEmailId(String blockedEmailId) {
        this.blockedEmailId = blockedEmailId;
    }
}
