package fa.training.spring.controller;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fa.training.spring.dto.AuditDto;
import fa.training.spring.entities.Audit;
import fa.training.spring.repository.AuditRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/audit")
public class AuditController {

	@Autowired
	private AuditRepository auditRepository;
	
	@GetMapping("/")
    public String hello() {
        return "Hello World";
    }
	
	@GetMapping("/find-all")
    public List<Audit> listAll(Model model) {
        List<Audit> listUsers = auditRepository.findAll();
        return listUsers;
    }
	
	@PostMapping("/")
	public Audit newAudit(@RequestBody @Valid AuditDto newAudit) {
		
		Audit audit = new Audit();
		audit.setAuditClass(newAudit.getAuditClass());
		audit.setAuditDate(newAudit.getAuditDate());
		audit.setEmail(newAudit.getEmail());
		audit.setPhone(newAudit.getPhone());
		audit.setPic(newAudit.getPic());
		audit.setIdentifier(newAudit.getIdentifier());
	    return auditRepository.save(audit);
	    }
	
	@GetMapping("/{id}")
	public Audit one(@PathVariable Long id) {
	    return auditRepository.findById(id)
	      .orElseThrow();
	  }

	  @PutMapping("/{id}")
	  Audit replaceAudit(@RequestBody AuditDto newAuditDto, @PathVariable Long id) throws ParseException {
		  Audit auditNew = new Audit();
//		  if(auditRepository.findById(id).isEmpty()) {
//			  
//		  }
		  auditNew.setAuditClass(newAuditDto.getAuditClass());
//		  auditNew.setAuditDate(
				  
//				  );
		  
		  auditNew.setPic(newAuditDto.getPic());
		  auditNew.setId(id);
		  
		return auditRepository.saveAndFlush(auditNew);
	  }

	  @DeleteMapping("/{id}")
	  public String deleteEmployee(@PathVariable Long id) {
		  auditRepository.deleteById(id);
		return  "Done!!!";
	  }
}
