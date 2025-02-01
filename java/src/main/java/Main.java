public class Main {
    public static void main(String[] args) {
        ElevatorOdd lift1 = new ElevatorOdd(Status.STAY, 1, 1);
        ElevatorOdd lift2 = new ElevatorOdd(Status.STAY, 1, 1);
        ElevatorOdd lift3 = new ElevatorOdd(Status.STAY, 1, 1);
        ElevatorEven lift4 = new ElevatorEven(Status.STAY, 1, 1);
        ElevatorEven lift5 = new ElevatorEven(Status.STAY, 1, 1);
        ElevatorEven lift6 = new ElevatorEven(Status.STAY, 1, 1);
        ElevatorStaff lift7 = new ElevatorStaff(Status.STAY, 1, 1);

        Elevator[] lifts = {lift1, lift2, lift3, lift4, lift5, lift6, lift7};

        ElevatorOdd[] liftsOdd = {lift1, lift2, lift3};
        ElevatorEven[] liftsEven = {lift4, lift5, lift6};
        ElevatorStaff[] liftsStaff = {lift7};
        ElevatorMove lift = new ElevatorMove();
        lift.call(lifts, liftsOdd, liftsEven, liftsStaff);
        
    }
}
