/* this is a stub for the Cafe class */
public class Cafe extends Building{

    // the number of ounces of coffee remaining in inventory
    private int nCoffeeOunces; 
    // the number of sugar packets remaining in inventory
    private int nSugarPackets; 
    // the number of "splashes" of cream remaining in inventory
    private int nCreams; 
    // the number of cups remaining in inventory
    private int nCups; 

    // constructor for creating a new Cafe instance
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        // call the superclass constructor (Building)
        super(name, address, nFloors);
        // initialize inventory with default values
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
    }

    // method to sell coffee and update inventory
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if (this.nCoffeeOunces >= size && this.nCreams >= nCreams && this.nSugarPackets >= nSugarPackets && this.nCups > 0){
            this.nCoffeeOunces -= size;
            this.nCreams -= nCreams;
            this.nSugarPackets -= nSugarPackets;
            this.nCups--;
        } else {
            restock();
        } 
    }

    // method to restock inventory
    private void restock(){
        this.nCoffeeOunces = 100;
        this.nSugarPackets = 100;
        this.nCreams = 100;
        this.nCups = 100; 
    }
    
    //public static void main(String[] args) {
        //new Cafe();
    //}
}
