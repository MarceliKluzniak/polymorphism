package pl.mkluzniak;

public class Main {

    public static void main(String[] args) {
        // polymorphism = greek word for ply - "many", morph - "form"
        //                the ability of an object to identify as more than one type

        Car car = new Car(); //creating new car,bicycle,boat object
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat}; // to store different object we have to find sth common and there is vehicle calss thats why we have array of vehicle

        for (Vehicle x : racers) { //loop  to iterate throught all elements of array vehicle
            x.go(); //loop search for all elements that are in vehicle class and print it
        }
    }
}
