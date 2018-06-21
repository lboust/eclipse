package jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="pingpong", eager = true)
@SessionScoped
public class PingPong {
	//instance fields
	String editg = "AAA";
	String editd ="BBB";
	
	//methods
	public void moveR2L() {
		editg=editd;
		editd="";
	}
	public void moveL2R() {
		editd=editg;
		editg="";
	}
	
	public void reset() {
		editg="AAA";
		editd="BBB";
	}
	
	//accessors
	public String getEditg() {
		return editg;
	}
	public void setEditg(String editg) {
		this.editg = editg;
	}
	public String getEditd() {
		return editd;
	}
	public void setEditd(String editd) {
		this.editd = editd;
	}
	
}
