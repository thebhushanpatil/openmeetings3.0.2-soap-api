
package the.bhushan.service.room;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-09-11T01:07:29.715+05:30
 * Generated source version: 3.1.7
 */

@WebFault(name = "ServiceException", targetNamespace = "http://webservice.openmeetings.apache.org/")
public class ServiceException_Exception extends Exception {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private the.bhushan.service.room.ServiceException serviceException;

    public ServiceException_Exception() {
        super();
    }
    
    public ServiceException_Exception(String message) {
        super(message);
    }
    
    public ServiceException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException_Exception(String message, the.bhushan.service.room.ServiceException serviceException) {
        super(message);
        this.serviceException = serviceException;
    }

    public ServiceException_Exception(String message, the.bhushan.service.room.ServiceException serviceException, Throwable cause) {
        super(message, cause);
        this.serviceException = serviceException;
    }

    public the.bhushan.service.room.ServiceException getFaultInfo() {
        return this.serviceException;
    }
}
