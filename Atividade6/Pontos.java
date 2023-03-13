package Atividade6;

public class Pontos {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Pontos(int a, int b, int c, int y1, int y2) {
        Bhaskara calculateRoots = new Bhaskara(a, b, c);
        this.x1 = calculateRoots.getR1();
        this.x2 = calculateRoots.getR2();
        this.y1 = y1;
        this.y2 = y2;
    }
    

}
