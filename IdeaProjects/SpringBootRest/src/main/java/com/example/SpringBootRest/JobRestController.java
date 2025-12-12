package com.example.SpringBootRest;

import com.example.SpringBootRest.model.JobPost;
import com.example.SpringBootRest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
//@RequestMapping("jobpost")
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("jobposts")
    @ResponseBody
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }
    @GetMapping("jobpost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId){

        return service.getJob(postId);
    }
    @PostMapping("jobpost")
    public void addJob(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
    }
    @PutMapping("jobpost/{postId}")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        return service.updateJob(jobPost);

    }
    @DeleteMapping("jobpost/{postId}")
    public String deleteJob(@PathVariable("postId") int postId) {
        service.deleteJob(postId);
        return "Deleted successfully";
    }

        @GetMapping("load")
        public String load() {
            service.load();
            return "Data loaded successfully";
    }
    @GetMapping("/jobpost/keyword/{keyword}")
    public List<JobPost> search(@PathVariable("keyword") String keyword){

        return service.search(keyword);
    }
}


