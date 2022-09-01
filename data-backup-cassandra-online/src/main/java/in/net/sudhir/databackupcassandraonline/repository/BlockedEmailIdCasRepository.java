package in.net.sudhir.databackupcassandraonline.repository;

import in.net.sudhir.databackupcassandraonline.model.BlockedEmailIdCas;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;
import java.util.UUID;

/***
 Package Name: in.net.sudhir.databackupcassandraonline.repository
 User Name: SUDHIR
 Created Date: 01-09-2022 at 17:20
 Description:
 */

public interface BlockedEmailIdCasRepository extends CassandraRepository<BlockedEmailIdCas, UUID> {

}
