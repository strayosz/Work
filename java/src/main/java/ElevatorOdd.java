public class ElevatorOdd extends Elevator {

    public ElevatorOdd(Status status, int currentFloor, int requiredFloor) {
        super(status, currentFloor, requiredFloor);
    }

    public ElevatorOdd(){}

    @Override
    public String toString() {
        return "Odd." + status() + " " + getCurrentFloor();
    }


}
