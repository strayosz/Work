import java.util.Random;

public class ElevatorMove implements Call {
    Random r = new Random();

    @Override
    public void call(Elevator[] lifts, Elevator[] liftsOdd, Elevator[] liftsEven, Elevator[] liftsStaff) throws NoAvailable {
        for (int i = 0; i < 10000; i++) {
            if (i % 20 == 0) {
                int floor = r.nextInt(17) + 1;
                try {
                    if (floor % 2 == 0) {
                        System.out.println();
                        System.out.println("Вызов четного лифта на " + floor + " этаж");
                        System.out.println();
                        elevatorSetOdd(liftsOdd, floor);
                    } else if (floor % 2 != 0) {
                        System.out.println();
                        System.out.println("Вызов нечетного лифта на " + floor + " этаж");
                        System.out.println();
                        elevatorSetEven(liftsEven, floor);
                    }
                    if (i % 100 == 0) {
                        System.out.println();
                        System.out.println("Вызов лифта для сотрудников на " + floor + " этаж");
                        System.out.println();
                        elevatorSetStaff(liftsStaff, floor);
                    }

                } catch (NoAvailable e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.print(i + " ");
            outElevator(lifts);
            for (Elevator liftOdd : liftsOdd) {
                liftOdd.change();
            }
            for (Elevator liftEven : liftsEven) {
                liftEven.change();
            }
            for (Elevator liftStaff : liftsStaff) {
                liftStaff.change();
            }
        }
    }

    public static void elevatorSetOdd(Elevator[] liftsOdd, int rFloor) throws NoAvailable {
        boolean flag = true;
        int j = 0;
        while (flag && (j < liftsOdd.length)) {
            if (liftsOdd[j].status() == Status.STAY) {
                liftsOdd[j].setRequiredFloor(rFloor);
                flag = false;
            }
            j++;
        }
        if (flag) {
            throw new NoAvailable("Все четные лифты заняты, подождите");
        }
    }

    public static void elevatorSetEven(Elevator[] liftsEven, int rFloor) throws NoAvailable{
        boolean flag = true;
        int j = 0;
        while (flag && (j < liftsEven.length)) {
            if (liftsEven[j].status() == Status.STAY) {
                liftsEven[j].setRequiredFloor(rFloor);
                flag = false;
            }
            j++;
        }
        if (flag) {
            throw new NoAvailable("Все нечетные лифты заняты, подождите");
        }
    }

    public static void elevatorSetStaff(Elevator[] liftsStaff, int rFloor) throws NoAvailable{
        boolean flag = true;
        int j = 0;
        while (flag && (j < liftsStaff.length)) {
            if (liftsStaff[j].status() == Status.STAY) {
                liftsStaff[j].setRequiredFloor(rFloor);
                flag = false;
            }
            j++;
        }
        if (flag) {
            throw new NoAvailable("Все лифты для сотрудников заняты, подождите");
        }
    }

    public static void outElevator(Elevator[] lifts) {
        for (Elevator lift : lifts) {
            System.out.print(lift + " ");
        }
        System.out.println();
    }
}
