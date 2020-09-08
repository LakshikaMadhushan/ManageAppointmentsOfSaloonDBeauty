
package lk.ijse.salone.Model;


public class Employee {
            private String Emp_ID; 
	    private String Emp_Name ;
	    private String Emp_Address; 
	    private int Emp_Age; 
	    private int Emp_TP; 

    public Employee() {
    }

    public Employee(String Emp_ID, String Emp_Name, String Emp_Address, int Emp_Age, int Emp_TP) {
        this.Emp_ID = Emp_ID;
        this.Emp_Name = Emp_Name;
        this.Emp_Address = Emp_Address;
        this.Emp_Age = Emp_Age;
        this.Emp_TP = Emp_TP;
    }

    /**
     * @return the Emp_ID
     */
    public String getEmp_ID() {
        return Emp_ID;
    }

    /**
     * @param Emp_ID the Emp_ID to set
     */
    public void setEmp_ID(String Emp_ID) {
        this.Emp_ID = Emp_ID;
    }
     

    /**
     * @return the Emp_Name
     */
    public String getEmp_Name() {
        return Emp_Name;
    }

    /**
     * @param Emp_Name the Emp_Name to set
     */
    public void setEmp_Name(String Emp_Name) {
        this.Emp_Name = Emp_Name;
    }

    /**
     * @return the Emp_Address
     */
    public String getEmp_Address() {
        return Emp_Address;
    }

    /**
     * @param Emp_Address the Emp_Address to set
     */
    public void setEmp_Address(String Emp_Address) {
        this.Emp_Address = Emp_Address;
    }

    /**
     * @return the Emp_Age
     */
    public int getEmp_Age() {
        return Emp_Age;
    }

    /**
     * @param Emp_Age the Emp_Age to set
     */
    public void setEmp_Age(int Emp_Age) {
        this.Emp_Age = Emp_Age;
    }

    /**
     * @return the Emp_TP
     */
    public int getEmp_TP() {
        return Emp_TP;
    }

    /**
     * @param Emp_TP the Emp_TP to set
     */
    public void setEmp_TP(int Emp_TP) {
        this.Emp_TP = Emp_TP;
    }

    @Override
    public String toString() {
        return "Employee{" + "Emp_ID=" + Emp_ID + ", Emp_Name=" + Emp_Name + ", Emp_Address=" + Emp_Address + ", Emp_Age=" + Emp_Age + ", Emp_TP=" + Emp_TP + '}';
    }

   

   
             
        
                       
                       
}
