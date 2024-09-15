package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ServiceException  extends Exception {
	
	private static final long serialVersionUID = 2L;
	
	private final String message;
	private final Integer httpStatus;
	
	
	public ServiceException(String message, Integer httpStatus) {
		super();
		this.message = message;
		this.httpStatus = httpStatus;		
	}
	
	public ServiceException(Enum<?> message, Integer httpStatus) {
		super();
		this.httpStatus = httpStatus;
		this.message = message.name();		
	}
	
	
	@Override
	public synchronized Throwable fillInStackTrace() {
		return this;
	}

}
