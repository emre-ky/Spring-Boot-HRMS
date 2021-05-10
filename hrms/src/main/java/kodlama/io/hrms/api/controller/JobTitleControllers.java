package kodlama.io.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.JobTitleService;
import kodlama.io.hrms.entities.concretes.JobTitle;

@RestController
@RequestMapping("api/job-titles/")

public class JobTitleControllers {

	
	private final JobTitleService jobTitleService;

	
	@Autowired
	
	public JobTitleControllers(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}
	
	
	@GetMapping("getall")
	public List<JobTitle> getAll(){
		return jobTitleService.getAll();
	}
	
	
}
