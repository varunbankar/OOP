public class Room {

    private int height;
    private int length;
    private int width;

    public Room(int d) {
        this(d, d, d);
    }

    public Room(int l, int w, int h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    public int getLateralArea() {
        return 2 * (this.length * this.height + this.width * this.height);
    }

    public int getFloorArea() {
        return this.length * this.width;
    }

}
