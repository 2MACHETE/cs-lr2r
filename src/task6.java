public class task6 {
    interface IFigure { double getArea(); }

    static class Circle implements IFigure {
        double r;
        Circle(double r) { this.r = r; }
        public double getArea() { return Math.PI * r * r; }
    }

    static class Rectangle implements IFigure {
        double w, h;
        Rectangle(double w, double h) { this.w = w; this.h = h; }
        public double getArea() { return w * h; }
    }

    static class Table {
        double w, h;
        Table(double w, double h) { this.w = w; this.h = h; }
        double calculateArea() { return w * h; }
    }

    static class TableAdapter implements IFigure {
        private final Table table;
        TableAdapter(Table table) { this.table = table; }
        public double getArea() { return table.calculateArea(); }
    }

    static class Client {
        void getArea(IFigure f) {
            System.out.println("Площадь = " + f.getArea());
        }
    }

    public static void run() {
        Client client = new Client();
        client.getArea(new Circle(5));
        client.getArea(new Rectangle(3, 4));
        client.getArea(new TableAdapter(new Table(2, 3)));
    }
}