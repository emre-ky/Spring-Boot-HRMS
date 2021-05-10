package kodlama.io.hrms.dataAccess.concretes;


//imports
import java.util.List;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlama.io.hrms.business.abstracts.JobTitleService;
import kodlama.io.hrms.dataAccess.abstracts.JobTitleDao;
import kodlama.io.hrms.entities.concretes.JobTitle;


@Service
public class JobTitleManager implements JobTitleService {

	private JobTitleDao jobTitlesDao;
	
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitlesDao = jobTitleDao;
	}



	@Override
	public List<JobTitle> getAll() {
		return this.jobTitlesDao.findAll();
	}

}