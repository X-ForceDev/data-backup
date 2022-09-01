package in.net.sudhir.databackupcassandraonline;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import in.net.sudhir.databackupcassandraonline.model.BlockedEmailIdCas;
import in.net.sudhir.databackupcassandraonline.model.BlockedEmailIds;
import in.net.sudhir.databackupcassandraonline.model.Statistics;
import in.net.sudhir.databackupcassandraonline.model.StatisticsCas;
import in.net.sudhir.databackupcassandraonline.repository.BlockedEmailIdCasRepository;
import in.net.sudhir.databackupcassandraonline.repository.BlockedEmailRepository;
import in.net.sudhir.databackupcassandraonline.repository.StatisticsCasRepository;
import in.net.sudhir.databackupcassandraonline.repository.StatisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableEncryptableProperties
@EnableJpaRepositories(basePackages = {"in.net.sudhir.databackupcassandraonline"})
public class DataBackupCassandraOnlineApplication {

    @Autowired
    BlockedEmailIdCasRepository blockedEmailIdCasRepository;

    @Autowired
    BlockedEmailRepository blockedEmailRepository;

    @Autowired
    StatisticsCasRepository statisticsCasRepository;

    @Autowired
    StatisticsRepository statisticsRepository;

    public static void main(String[] args) {
        SpringApplication.run(DataBackupCassandraOnlineApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
////            blockedEmailIdCasRepository.deleteAll();
//            List<BlockedEmailIdCas> blockedEmailIdCasList = blockedEmailIdCasRepository.findAll();
//            blockedEmailIdCasList.forEach(email -> {blockedEmailIdCasRepository.delete(email);});
//            List<BlockedEmailIds> blockedEmailIdsList = blockedEmailRepository.findAll();
//
//            blockedEmailIdsList.forEach(email -> {
//                blockedEmailIdCasRepository.save(new BlockedEmailIdCas(email.getBlockedEmailId()));
//            });
//            System.exit(0);

            List<StatisticsCas> statisticsCasList = statisticsCasRepository.findAll();
            statisticsCasList.forEach(email -> {statisticsCasRepository.delete(email);});
            Iterable<Statistics> statisticsList = statisticsRepository.findAll();

            statisticsList.forEach(email -> {
                statisticsCasRepository.save(new StatisticsCas(email.getEmailAddress(), email.getCount()));
            });

            System.exit(0);
        };
    }

}
