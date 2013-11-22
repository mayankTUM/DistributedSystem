package common.messages;

@SuppressWarnings("serial")
public class KVMessageImpl implements KVMessage, java.io.Serializable {

	private String key;
	private String value;
	private StatusType status;
	
	public void setKey(String key) {
		this.key = key;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public void setStatus(StatusType status) {
		this.status = status;
	}
	
	@Override
	public String getKey() {
		return this.key;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	@Override
	public StatusType getStatus() {
		return this.status;
	}

}
