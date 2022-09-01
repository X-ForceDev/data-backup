package in.net.sudhir.databackupcassandraonline.model;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.*;

import java.util.UUID;

/***
 Package Name: in.net.sudhir.databackupcassandraonline.model
 User Name: SUDHIR
 Created Date: 01-09-2022 at 17:19
 Description:
 */
@Table("blocked_email_ids")
public class BlockedEmailIdCas {
    @PrimaryKeyColumn(name = "id" , type = PrimaryKeyType.PARTITIONED)
    @CassandraType(type = CassandraType.Name.UUID)
    private UUID id = UUID.randomUUID();

    @Column("email_address")
    private String emailAddress;

    public BlockedEmailIdCas(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}