public class Shape {
    private int length;
    private int breadth;

    public Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "length=" + length +
                ", breadth=" + breadth +
                '}';
    }
}
