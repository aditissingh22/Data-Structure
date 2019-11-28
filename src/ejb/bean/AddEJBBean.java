package ejb.bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class AddEJBBean
 * We can create a normal bean class as well, but this is SessionBean class(Stateless)
 * Two types of EJB: Session Bean and Message Driven Bean
 * We are creating SessionBean here(not the normal Bean) because we want the object(without new keyword), and this is possible with EJB.
 * Normal Bean is a class with all private variables and public getter setter
 * EJB Bean class will be having the below annotations
 */
@Stateless
@LocalBean
public class AddEJBBean {

    private int i,j,k;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}
    
    public void add() {
    	k = i+j;
    }

}
