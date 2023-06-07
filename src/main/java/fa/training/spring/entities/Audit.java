package fa.training.spring.entities;


import java.sql.Date;
import java.util.Objects;

import fa.training.spring.validation.IdentifierNumber;
import fa.training.spring.validation.Phone;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Audit {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	
	private Date auditDate;
	

	private String pic;
	

	private String auditClass;

	@Phone
	private String phone;
	
	@Email
	private String email;
	
	@IdentifierNumber
	private String identifier;
	@Override
	public int hashCode() {
		return Objects.hash(auditClass, auditDate, id, pic);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Audit other = (Audit) obj;
		return Objects.equals(auditClass, other.auditClass) && Objects.equals(auditDate, other.auditDate)
				&& Objects.equals(id, other.id) && Objects.equals(pic, other.pic);
	}


	@Override
	public String toString() {
		return "Audit [id=" + id + ", auditDate=" + auditDate + ", pic=" + pic + ", auditClass=" + auditClass + "]";
	}
	
	
	
}
