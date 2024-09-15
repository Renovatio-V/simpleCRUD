package dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentResponseDTO {
	
	private String message;
	private Integer studentId;
}
