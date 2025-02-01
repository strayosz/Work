public class ElevatorEven extends Elevator{
    public ElevatorEven(Status status, int currentFloor, int requiredFloor) {
        super(status, currentFloor, requiredFloor);
    }

    public ElevatorEven(){}

    @Override
    public String toString() {
        return "Even." + status() + " " + getCurrentFloor();
    }
}
