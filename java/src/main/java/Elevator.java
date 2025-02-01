public abstract class Elevator implements ElevatorStatus, Step {
    private Status status;
    private int currentFloor;
    private int requiredFloor;

    public Elevator() {
    }

    public Elevator(Status status, int currentFloor, int requiredFloor) {
        this.status = status;
        this.currentFloor = currentFloor;
        this.requiredFloor = requiredFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public void setRequiredFloor(int requiredFloor) {
        this.requiredFloor = requiredFloor;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getRequiredFloor() {
        return requiredFloor;
    }

    @Override
    public Status status(){
        return status;
    }

    @Override
    public void change(){
        if (status == Status.UP) {
            currentFloor++;
        } else if(status == Status.DOWN) {
            currentFloor--;
        }
    }
}
