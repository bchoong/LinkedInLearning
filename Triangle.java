public class Triangle {

    static int numOfSides = 3;
    double base;
    double height;
    double sideOne;
    double sideTwo;
    double sideThree;

    public Triangle(double base,
            double height,
            double sideOne,
            double sideTwo,
            double sideThree) {
        this.base = base;
        this.height = height;
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public double findArea() {
        return (this.base * this.height)/2;
    }

}
