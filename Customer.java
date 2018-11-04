
import java.util.Date;
import java.util.Calendar;

public class Customer {
    private String name;
    private int items;


    Customer(){

        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.HOUR_OF_DAY,17);
        cal.set(Calendar.MINUTE,30);
        cal.set(Calendar.SECOND,0);
        cal.set(Calendar.MILLISECOND,0);
        this.name = "Customer1";
        this.items = 0;


        Date d = cal.getTime();
    }
    Customer(String name, int items){
        this.name = name;
        this.items = items;
    }

    /******* Getters and Setters  *******/
    /* SETTERS */
    void setName(String name){
        this.name = name;
    }

    void setItems(int items){
        this.items = items;
    }

    /* GETTERS */
    String getName(){
        return name;
    }

    int getItems(){
        return items;
    }





}
