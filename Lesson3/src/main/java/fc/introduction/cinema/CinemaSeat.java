package fc.introduction.cinema;

public class CinemaSeat {

    private final int seatNumber;
    private final int rowNumber;
    private boolean isTaken;

    public CinemaSeat(int seatNumber, int rowNumber) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.isTaken = false;
    }

    public boolean isTaken(){
        return this.isTaken;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public int getRowNumber() {
        return this.rowNumber;
    }

    public void setTaken(boolean isTaken) {
        this.isTaken = isTaken;
    }
}
