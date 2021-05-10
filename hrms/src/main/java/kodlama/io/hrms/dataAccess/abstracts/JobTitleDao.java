package kodlama.io.hrms.dataAccess.abstracts;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import kodlama.io.hrms.entities.concretes.JobTitle;

//Önceki projeden farklı olarak (6.Dersten) User yerine JobTitle eklemiş olduk.

public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {

}
