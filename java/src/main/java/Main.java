public class Main {
    public static void main(String[] args) {
        ElevatorOdd lift1 = new ElevatorOdd(Status.STAY, 1, 0);
        ElevatorOdd lift2 = new ElevatorOdd(Status.STAY, 1, 0);
        ElevatorOdd lift3 = new ElevatorOdd(Status.STAY, 1, 0);
        ElevatorEven lift4 = new ElevatorEven(Status.STAY, 1, 0);
        ElevatorEven lift5 = new ElevatorEven(Status.STAY, 1, 0);
        ElevatorEven lift6 = new ElevatorEven(Status.STAY, 1, 0);
        ElevatorStaff lift7 = new ElevatorStaff(Status.STAY, 1, 0);

        ElevatorOdd[] liftsOdd = {lift1, lift2, lift3};
        ElevatorEven[] liftsEven = {lift4, lift5, lift6};
        ElevatorStaff[] liftsStaff = {lift7};
    }
}
