
package lk.ijse.salone.Model;

import java.util.ArrayList;


public class Appointment {
                private String Cus_ID ;
		private String Emp_ID; 
		private String Ap_ID ;
		private String Ap_Date ;
		private String Ap_Time ;
                private String Actual_Service_Date; 
		private String Actual_Service_Time; 
                private int Duration; 
                private ArrayList<AppointmentService> list;

    public Appointment() {
    }

    public Appointment(String Cus_ID, String Emp_ID, String Ap_ID, String Ap_Date, String Ap_Time, String Actual_Service_Date, String Actual_Service_Time, int Duration, ArrayList<AppointmentService> list) {
        this.Cus_ID = Cus_ID;
        this.Emp_ID = Emp_ID;
        this.Ap_ID = Ap_ID;
        this.Ap_Date = Ap_Date;
        this.Ap_Time = Ap_Time;
        this.Actual_Service_Date = Actual_Service_Date;
        this.Actual_Service_Time = Actual_Service_Time;
        this.Duration = Duration;
        this.list = list;
    }

    public Appointment(String Cus_ID, String Emp_ID, String Ap_ID, String Ap_Date, String Ap_Time, String Actual_Service_Date, String Actual_Service_Time, int Duration) {
         this.Cus_ID = Cus_ID;
        this.Emp_ID = Emp_ID;
        this.Ap_ID = Ap_ID;
        this.Ap_Date = Ap_Date;
        this.Ap_Time = Ap_Time;
        this.Actual_Service_Date = Actual_Service_Date;
        this.Actual_Service_Time = Actual_Service_Time;
        this.Duration = Duration;
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
     * @return the Ap_Date
     */
    public String getAp_Date() {
        return Ap_Date;
    }

    /**
     * @param Ap_Date the Ap_Date to set
     */
    public void setAp_Date(String Ap_Date) {
        this.Ap_Date = Ap_Date;
    }

    /**
     * @return the Ap_Time
     */
    public String getAp_Time() {
        return Ap_Time;
    }

    /**
     * @param Ap_Time the Ap_Time to set
     */
    public void setAp_Time(String Ap_Time) {
        this.Ap_Time = Ap_Time;
    }

    /**
     * @return the Actual_Service_Date
     */
    public String getActual_Service_Date() {
        return Actual_Service_Date;
    }

    /**
     * @param Actual_Service_Date the Actual_Service_Date to set
     */
    public void setActual_Service_Date(String Actual_Service_Date) {
        this.Actual_Service_Date = Actual_Service_Date;
    }

    /**
     * @return the Actual_Service_Time
     */
    public String getActual_Service_Time() {
        return Actual_Service_Time;
    }

    /**
     * @param Actual_Service_Time the Actual_Service_Time to set
     */
    public void setActual_Service_Time(String Actual_Service_Time) {
        this.Actual_Service_Time = Actual_Service_Time;
    }

    /**
     * @return the Duration
     */
    public int getDuration() {
        return Duration;
    }

    /**
     * @param Duration the Duration to set
     */
    public void setDuration(int Duration) {
        this.Duration = Duration;
    }

    /**
     * @return the list
     */
    public ArrayList<AppointmentService> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(ArrayList<AppointmentService> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Appointment{" + "Cus_ID=" + Cus_ID + ", Emp_ID=" + Emp_ID + ", Ap_ID=" + Ap_ID + ", Ap_Date=" + Ap_Date + ", Ap_Time=" + Ap_Time + ", Actual_Service_Date=" + Actual_Service_Date + ", Actual_Service_Time=" + Actual_Service_Time + ", Duration=" + Duration + ", list=" + list + '}';
    }
  
}
