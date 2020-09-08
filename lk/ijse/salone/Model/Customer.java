
package lk.ijse.salone.Model;


public class Customer {
                private String Cus_ID;
	        private String Cus_Name; 
		private String Cus_Address ;
		private int Cus_TP;

    public Customer() {
    }

    public Customer(String Cus_ID, String Cus_Name, String Cus_Address, int Cus_TP) {
        this.Cus_ID = Cus_ID;
        this.Cus_Name = Cus_Name;
        this.Cus_Address = Cus_Address;
        this.Cus_TP = Cus_TP;
    }

    /**
     * @return the Cus_ID
     */
    public String getCus_ID() {
        return Cus_ID;
    }

    /**
     * @param Cus_ID the Cus_ID to set
     */
    public void setCus_ID(String Cus_ID) {
        this.Cus_ID = Cus_ID;
    }

    /**
     * @return the Cus_Name
     */
    public String getCus_Name() {
        return Cus_Name;
    }

    /**
     * @param Cus_Name the Cus_Name to set
     */
    public void setCus_Name(String Cus_Name) {
        this.Cus_Name = Cus_Name;
    }

    /**
     * @return the Cus_Address
     */
    public String getCus_Address() {
        return Cus_Address;
    }

    /**
     * @param Cus_Address the Cus_Address to set
     */
    public void setCus_Address(String Cus_Address) {
        this.Cus_Address = Cus_Address;
    }

    /**
     * @return the Cus_TP
     */
    public int getCus_TP() {
        return Cus_TP;
    }

    /**
     * @param Cus_TP the Cus_TP to set
     */
    public void setCus_TP(int Cus_TP) {
        this.Cus_TP = Cus_TP;
    }

    @Override
    public String toString() {
        return "Customer{" + "Cus_ID=" + Cus_ID + ", Cus_Name=" + Cus_Name + ", Cus_Address=" + Cus_Address + ", Cus_TP=" + Cus_TP + '}';
    }

   
     
    
      
    
                 
                                    
}                       

 
   


