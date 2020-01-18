public class CarAdvisor {

    public Vehicle advise(int age) {
        if (age <= 18) {
            return Vehicle.ROWER;
        } else if (age >= 19 && age <= 30) {
            return Vehicle.FIAT;
        } else if (age >= 31 && age <= 40) {
            return  Vehicle.OPEL;
        } else if (age >= 41 && age <= 50) {
            return Vehicle.BMW;
        } else {
            return Vehicle.MERCEDES;
        }
    }
}
