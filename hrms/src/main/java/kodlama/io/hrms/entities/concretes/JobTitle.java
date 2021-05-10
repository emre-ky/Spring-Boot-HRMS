package kodlama.io.hrms.entities.concretes;

//Imports

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import kodlama.io.hrms.dataAccess.abstracts.JobTitleDao;
import lombok.Data;

@Data
@Entity
@Table(name="job_titles")


public class JobTitle {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
}
