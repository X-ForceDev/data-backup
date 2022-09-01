package in.net.sudhir.databackupcassandraonline.repository;

import in.net.sudhir.databackupcassandraonline.model.BlockedEmailIds;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/***
 Package Name: in.net.sudhir.mailprocessor.mailprocessor.repository
 User Name: SUDHIR
 Created Date: 20-08-2022 at 06:36
 Description:
 */

public interface BlockedEmailRepository extends CrudRepository<BlockedEmailIds, Integer> {
    List<BlockedEmailIds> findAll();
}
