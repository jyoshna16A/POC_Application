package generated.com.example.stub;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	/*
	 * public List<String> number;
	 * 
	 * public List<String> getNumber() { if(number == null) { number = new
	 * ArrayList(); } return number; }
	 */
	
	Integer i ;
	List<String> associatedTNs;
	
	public List<String> getAssociatedTNs() {
        if (associatedTNs == null) {
            associatedTNs = new ArrayList<String>();
        }
        return this.associatedTNs;
    }
	public void setI(Integer i) {
		this.i = i;
	}
	public Integer getI() {
		return i;
	}
}
