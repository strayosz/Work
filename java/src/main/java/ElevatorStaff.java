public class ElevatorStaff extends Elevator{
    public ElevatorStaff(Status status, int currentFloor, int requiredFloor) {
        super(status, currentFloor, requiredFloor);
    }

    public ElevatorStaff(){}

    @Override
    public String toString() {
        return "Staff." + status() + " " + getCurrentFloor();
    }
}
