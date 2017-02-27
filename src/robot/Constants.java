package robot;

/**
 * Constants used in this package.
 *
 * @author Suyash Lakhotia
 */

// @TODO: Range for short range & long range sensors?

public class Constants {
    public static final int GOAL_ROW = 18;                          // row no. of goal cell
    public static final int GOAL_COL = 13;                          // col no. of goal cell
    public static final int START_ROW = 1;                          // row no. of start cell
    public static final int START_COL = 1;                          // col no. of start cell
    public static final int MOVE_COST = 10;                         // cost of FORWARD, BACKWARD movement
    public static final int TURN_COST = 20;                         // cost of RIGHT, LEFT movement
    public static final int UTURN_COST = 30;                        // cost of UTURN movement
    public static final DIRECTION START_DIR = DIRECTION.NORTH;      // start direction
    public static final int SENSOR_SHORT_RANGE = 2;                 // range of short range sensor (cells)
    public static final int SENSOR_LONG_RANGE = 4;                  // range of long range sensor (cells)

    public enum DIRECTION {
        NORTH, EAST, SOUTH, WEST;

        public static DIRECTION getNext(DIRECTION curDirection) {
            return values()[(curDirection.ordinal() + 1) % values().length];
        }

        public static DIRECTION getPrevious(DIRECTION curDirection) {
            return values()[(curDirection.ordinal() + values().length - 1) % values().length];
        }

        public static DIRECTION fromString(String direction) {
            return valueOf(direction.toUpperCase());
        }
    }

    public enum MOVEMENT {
        FORWARD, BACKWARD, RIGHT, LEFT, UTURN;

        public static char print(MOVEMENT m) {
            switch (m) {
                case FORWARD:
                    return 'F';
                case BACKWARD:
                    return 'B';
                case RIGHT:
                    return 'R';
                case LEFT:
                    return 'L';
                case UTURN:
                    return 'U';
                default:
                    return 'E';
            }
        }
    }
}