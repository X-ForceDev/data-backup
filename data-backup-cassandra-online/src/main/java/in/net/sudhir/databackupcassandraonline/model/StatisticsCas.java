package in.net.sudhir.databackupcassandraonline.model;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

/***
 Package Name: in.net.sudhir.databackupcassandraonline.model
 User Name: SUDHIR
 Created Date: 01-09-2022 at 21:21
 Description:
 */
@Table("statistics")
public class StatisticsCas {
    @PrimaryKeyColumn(name = "id" , type = PrimaryKeyType.PARTITIONED)
    @CassandraType(type = CassandraType.Name.UUID)
    private UUID id = UUID.randomUUID();

    @Column("email_address")
    private String emailAddress;

    @Column("total_count")
    private Long totalCount;

    public StatisticsCas(String emailAddress, Long totalCount) {
        this.emailAddress = emailAddress;
        this.totalCount = totalCount;
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

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
}