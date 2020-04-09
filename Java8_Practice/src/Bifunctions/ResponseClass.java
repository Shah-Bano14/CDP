package Bifunctions;

public class ResponseClass {

	String reponseBody;
	public ResponseClass(String reponseBody, String statusCode, String responseType) {
		super();
		this.reponseBody = reponseBody;
		this.statusCode = statusCode;
		this.responseType = responseType;
	}
	@Override
	public String toString() {
		return "ResponseClass [reponseBody=" + reponseBody + ", statusCode=" + statusCode + ", responseType="
				+ responseType + "]";
	}
	String statusCode;
	public String getReponseBody() {
		return reponseBody;
	}
	public void setReponseBody(String reponseBody) {
		this.reponseBody = reponseBody;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getResponseType() {
		return responseType;
	}
	public void setResponseType(String responseType) {
		this.responseType = responseType;
	}
	String responseType;
	
}
