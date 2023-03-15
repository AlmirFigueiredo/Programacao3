package Atividade6;

public class Points {
    private double x;
    private double y;
    private Circle circum;
    private double distance;

    public Points(int a, int b, int c, Circle circum) {
        Bhaskara bhask = new Bhaskara(a, b, c);
        this.x = bhask.getR1();
        this.y = bhask.getR2();
        this.circum = circum;
    }
    //Getters:
        public Circle getCircum() {
            return circum;
        }
        public double getDistance() {
            return distance;
        }
        public double getX() {
            return x;
        }
        public double getY() {
            return y;
        }
}

