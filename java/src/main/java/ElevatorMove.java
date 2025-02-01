public class ElevatorMove implements Call{

    @Override
    public void call(int rFloor, Elevator[] liftsOdd, Elevator[] liftsEven, Elevator[] liftsStaff) throws NoAvailable{
        for (int i = 0; i < 10000; i++) {
            if ((rFloor % 2 == 0) && (i % 20 == 0)) {
                ElevatorOdd currentOdd = elevatorSetOdd(liftsOdd);
            }
        }
    }

    public static ElevatorOdd elevatorSetOdd(Elevator[] lifts) {
        ElevatorOdd lift = new ElevatorOdd();
        boolean flag = true;
        int j = 0;
        while(flag && j < lifts.length) {
            if (lifts[j].status() == Status.STAY) {
                lift = (ElevatorOdd) lifts[j];
                flag = false;
            }
            j++;
        }
        return lift;
    }

    public static ElevatorEven elevatorSetEven(Elevator[] lifts) {
        ElevatorEven lift = new ElevatorEven();
        boolean flag = true;
        int j = 0;
        while(flag && j < lifts.length) {
            if (lifts[j].status() == Status.STAY) {
                lift = (ElevatorEven) lifts[j];
                flag = false;
            }
            j++;
        }
        return lift;
    }

    public static ElevatorStaff elevatorSetStaff(Elevator[] lifts) {
        ElevatorStaff lift = new ElevatorStaff();
        boolean flag = true;
        int j = 0;
        while(flag && j < lifts.length) {
            if (lifts[j].status() == Status.STAY) {
                lift = (ElevatorStaff) lifts[j];
                flag = false;
            }
            j++;
        }
        return lift;
    }
}
