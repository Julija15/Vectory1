public class Vector1 {
    private double x;
    private double y;
    private double z;
    private double x1;
    private double y1;
    private double z1;
    private double name;
    private double a;

    public Vector1(double v, double v1, double v2) {
    }

//    public static Vector1[] generate(int i) {
//        Vector1[] vector1s = new Vector1[0];
//        return vector1s;
//    }

    public void Vector(double x, double y, double z, double x1, double y1, double z1) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.x = x1;
        this.y = y1;
        this.z = z1;
        this.a = a;
    }


    // Длинна вектора
    public double dlinna() {
        a = Math.sqrt((this.x1 - this.x) * (this.x1 - this.x) + (this.y1 - this.y) * (this.y1 - this.y) + (this.z1 - this.z) * (this.z1 - this.z));
        System.out.println(a);
        return Math.sqrt((this.x1 - this.x) * (this.x1 - this.x) + (this.y1 - this.y) * (this.y1 - this.y) + (this.z1 - this.z) * (this.z1 - this.z));
    }

    public void name1(double name) {
        this.name = a;
        System.out.println("Длинна вектора" + name);
    }


    // Склярное произведение
    public double scalarProizvedenie(Vector1 vector) {
        double a;
        a = this.x * vector.x1 + this.y * vector.y1 + this.z * vector.z1;
        System.out.println(a);
        return a;
    }

    public void setName(double name) {
        this.name = a;
        System.out.println("Склярное произведение" + name);
    }

    //векторное произведение
    public Vector1 vectoryProizvedenie(Vector1 vector) {
        return new Vector1(
                (this.y1 - this.y) * vector.z - (this.z1 - this.z) * vector.y,
                (this.z1 - this.z) * vector.y - (this.x1 - this.x) * vector.z,
                (this.x1 - this.x) * vector.y - (this.y1 - this.y) * vector.x);
    }


    // косинус угла между векторами
    public double cos(Vector1 vector) {
        a = scalarProizvedenie(vector) / (dlinna() * vector.dlinna());
        return scalarProizvedenie(vector) / (dlinna() * vector.dlinna());
    }

    public void name2(double name) {
        this.name = a;
        System.out.println(" косинус угла между векторами" + name);
    }

    // метод для суммы
    public Vector1 add(Vector1 vector) {
        return new Vector1(
                this.x1 - this.x + vector.x,
                this.y1 - this.y + vector.y,
                this.z1 - this.z + vector.z);
    }

    public void name3(double name) {
        this.name = a;
        System.out.println(" метод для суммы" + name);
    }

    // метод для вычитания - subtraction
    public Vector1 subtraction(Vector1 vector) {
        return new Vector1(
                this.x1 - this.x - vector.x,
                this.y1 - this.y - vector.y,
                this.z1 - this.z - vector.z);
    }

    public void name(double name) {
        this.name = a;
        System.out.println(" метод для вычитания" + name);
    }


    //статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N
    public static Vector1[] generate(int n) {
        Vector1[] vectors = new Vector1[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector1(Math.random(),Math.random(),Math.random());
            return vectors;
        }
        public String toString() {
            return "Vector1{" +
                    "x=" + v +
                    ", y=" + v1 +
                    ", z=" + v2+
                    ", x1=" + x1 +
                    ", y1=" + y1 +
                    ", z1=" + z1 +
                    '}';
        }
    }
}

