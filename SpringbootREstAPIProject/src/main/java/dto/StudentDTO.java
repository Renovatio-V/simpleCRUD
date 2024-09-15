package dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StudentDTO {
	@NotNull
	private String name;
	@NotNull
	private String identificationNumber;
	@NotNull
	private String email;
	@NotNull
	private float percentage;
	@NotNull
	private String branch;
}
