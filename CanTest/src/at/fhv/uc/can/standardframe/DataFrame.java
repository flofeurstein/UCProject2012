package at.fhv.uc.can.standardframe;

public class DataFrame {
	protected int m_type;

	public DataFrame(){
		
	}
	
	public DataFrame(int type){
		m_type = type;
	}
	
	public int getType() {
		return m_type;
	}

	public void setType(int type) {
		this.m_type = type;
	}
	
	public String toString(){
		return "not a valid Dataframe";
	}
}
