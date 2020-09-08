
package lk.ijse.salone.Model;


public class Service {
    
    private String Cat_ID; 
    private String S_ID ;
    private String S_Name ;
    private double S_Price; 
    private int S_Duration;

    public Service() {
    }

    public Service(String Cat_ID, String S_ID, String S_Name, double S_Price, int S_Duration) {
        this.Cat_ID = Cat_ID;
        this.S_ID = S_ID;
        this.S_Name = S_Name;
        this.S_Price = S_Price;
        this.S_Duration = S_Duration;
    }

    /**
     * @return the Cat_ID
     */
    public String getCat_ID() {
        return Cat_ID;
    }

    /**
     * @param Cat_ID the Cat_ID to set
     */
    public void setCat_ID(String Cat_ID) {
        this.Cat_ID = Cat_ID;
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
     * @return the S_Name
     */
    public String getS_Name() {
        return S_Name;
    }

    /**
     * @param S_Name the S_Name to set
     */
    public void setS_Name(String S_Name) {
        this.S_Name = S_Name;
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

    /**
     * @return the S_Duration
     */
    public int getS_Duration() {
        return S_Duration;
    }

    /**
     * @param S_Duration the S_Duration to set
     */
    public void setS_Duration(int S_Duration) {
        this.S_Duration = S_Duration;
    }

    @Override
    public String toString() {
        return "Service{" + "Cat_ID=" + Cat_ID + ", S_ID=" + S_ID + ", S_Name=" + S_Name + ", S_Price=" + S_Price + ", S_Duration=" + S_Duration + '}';
    }

   
}
