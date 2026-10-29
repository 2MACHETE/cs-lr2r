public class task7 {
    interface IFigure { double getArea(); }

    static class Apartment {
        double w, h;
        Apartment(double w, double h) { this.w = w; this.h = h; }
        double getArea() { return w * h; }
    }

    static class Client {
        void getArea(IFigure f) {
            System.out.println("Площадь квартиры = " + f.getArea());
        }
    }

    public static void run() {
        Client client = new Client();
        Apartment apt = new Apartment(10, 8);
        IFigure figure = new IFigure() {
            public double getArea() {
                return apt.getArea();
            }
        };
        client.getArea(figure);
    }
}