
package lk.ijse.salone.Model;


public class AppointmentService {
                private String Ap_ID;
		private String S_ID;
		private double S_Price ;

    public AppointmentService() {
    }

    public AppointmentService(String Ap_ID, String S_ID, double S_Price) {
        this.Ap_ID = Ap_ID;
        this.S_ID = S_ID;
        this.S_Price = S_Price;
    }

    /**
     * @return the Ap_ID
     */
    public String getAp_ID() {
        return Ap_ID;
    }

    /**
     * @param Ap_ID the Ap_ID to set
     */
    public void setAp_ID(String Ap_ID) {
        this.Ap_ID = Ap_ID;
    }

    /**
     * @return the S_ID
     */
    public String getS_ID() {
        return S_ID;
    }

    /**
     * @param S_ID the S_ID to set
     */
    public void setS_ID(String S_ID) {
        this.S_ID = S_ID;
    }

    /**
     * @return the S_Price
     */
    public double getS_Price() {
        return S_Price;
    }

    /**
     * @param S_Price the S_Price to set
     */
    public void setS_Price(double S_Price) {
        this.S_Price = S_Price;
    }

    @Override
    public String toString() {
        return "AppointmentService{" + "Ap_ID=" + Ap_ID + ", S_ID=" + S_ID + ", S_Price=" + S_Price + '}';
    }
                

}
