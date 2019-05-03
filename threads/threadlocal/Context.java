package learn.threads.threadlocal;

public class Context {
	private String transactionId = null;
	public String getTransactionId(){
		return transactionId;
	}
	
	public void setTransactionId(String id){
		this.transactionId=id;
	}
}



