
package lk.ijse.salone.Model;


public class Payment {
                private String Ap_ID;
		private String P_ID ;
		private String P_Date;
		private String P_Time;
		private Double Pay_Amount;
		private Double Balance;
		private Double Total_Cost;

    public Payment(String Ap_ID, String P_ID, String P_Date, String P_Time, Double Pay_Amount, Double Balance, Double Total_Cost) {
        this.Ap_ID = Ap_ID;
        this.P_ID = P_ID;
        this.P_Date = P_Date;
        this.P_Time = P_Time;
        this.Pay_Amount = Pay_Amount;
        this.Balance = Balance;
        this.Total_Cost = Total_Cost;
    }

    public Payment() {
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
     * @return the P_ID
     */
    public String getP_ID() {
        return P_ID;
    }

    /**
     * @param P_ID the P_ID to set
     */
    public void setP_ID(String P_ID) {
        this.P_ID = P_ID;
    }

    /**
     * @return the P_Date
     */
    public String getP_Date() {
        return P_Date;
    }

    /**
     * @param P_Date the P_Date to set
     */
    public void setP_Date(String P_Date) {
        this.P_Date = P_Date;
    }

    /**
     * @return the P_Time
     */
    public String getP_Time() {
        return P_Time;
    }

    /**
     * @param P_Time the P_Time to set
     */
    public void setP_Time(String P_Time) {
        this.P_Time = P_Time;
    }

    /**
     * @return the Pay_Amount
     */
    public Double getPay_Amount() {
        return Pay_Amount;
    }

    /**
     * @param Pay_Amount the Pay_Amount to set
     */
    public void setPay_Amount(Double Pay_Amount) {
        this.Pay_Amount = Pay_Amount;
    }

    /**
     * @return the Balance
     */
    public Double getBalance() {
        return Balance;
    }

    /**
     * @param Balance the Balance to set
     */
    public void setBalance(Double Balance) {
        this.Balance = Balance;
    }

    /**
     * @return the Total_Cost
     */
    public Double getTotal_Cost() {
        return Total_Cost;
    }

    /**
     * @param Total_Cost the Total_Cost to set
     */
    public void setTotal_Cost(Double Total_Cost) {
        this.Total_Cost = Total_Cost;
    }

    @Override
    public String toString() {
        return "Payment{" + "Ap_ID=" + Ap_ID + ", P_ID=" + P_ID + ", P_Date=" + P_Date + ", P_Time=" + P_Time + ", Pay_Amount=" + Pay_Amount + ", Balance=" + Balance + ", Total_Cost=" + Total_Cost + '}';
    }

}
