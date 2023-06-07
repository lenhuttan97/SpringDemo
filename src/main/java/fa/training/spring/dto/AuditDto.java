package fa.training.spring.dto;


import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;

import fa.training.spring.validation.IdentifierNumber;
import fa.training.spring.validation.Phone;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuditDto {
//	
//	@JsonProperty
//    private Long id;
	
	@JsonProperty
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date auditDate;
	
	@JsonProperty
	private String pic;
	
	@JsonProperty
	private String auditClass; 
	
	@Phone
	private String phone;
	
	@Email
	private String email;
	
	@IdentifierNumber
	private String Identifier;
	
}
