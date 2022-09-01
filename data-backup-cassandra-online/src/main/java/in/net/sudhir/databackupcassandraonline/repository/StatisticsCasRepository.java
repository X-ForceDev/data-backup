package in.net.sudhir.databackupcassandraonline.repository;

import in.net.sudhir.databackupcassandraonline.model.BlockedEmailIdCas;
import in.net.sudhir.databackupcassandraonline.model.Statistics;
import in.net.sudhir.databackupcassandraonline.model.StatisticsCas;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

/***
 Package Name: in.net.sudhir.databackupcassandraonline.repository
 User Name: SUDHIR
 Created Date: 01-09-2022 at 21:21
 Description:
 */
public interface StatisticsCasRepository  extends CassandraRepository<StatisticsCas, UUID> {

}
