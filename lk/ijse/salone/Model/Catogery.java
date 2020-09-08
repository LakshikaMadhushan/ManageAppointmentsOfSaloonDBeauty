
package lk.ijse.salone.Model;


public class Catogery {
   private String  Cat_ID;
   private String  Cat_Name;

    public Catogery() {
    }

    public Catogery(String Cat_ID, String Cat_Name) {
        this.Cat_ID = Cat_ID;
        this.Cat_Name = Cat_Name;
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
     * @return the Cat_Name
     */
    public String getCat_Name() {
        return Cat_Name;
    }

    /**
     * @param Cat_Name the Cat_Name to set
     */
    public void setCat_Name(String Cat_Name) {
        this.Cat_Name = Cat_Name;
    }

    @Override
    public String toString() {
        return "Catogery{" + "Cat_ID=" + Cat_ID + ", Cat_Name=" + Cat_Name + '}';
    }

    
   
}
