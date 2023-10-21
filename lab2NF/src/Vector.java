/**
 * <b>Операции с векторами</b>
 * Класс Vector реализует операции над векторами:
 * векторное произведение, скалярное произведение,
 * длина вектора, умножение вектора на число,
 * сумма векторов, разность векторов
 *
 * @author Alexander Shishlonov
 * @version 1.0
 * @since 2023-10-13
 */
public class Vector {
    private double x1 = 0;
    private double y1 = 0;
    private double x2 = 0;
    private double y2 = 0;
    public Vector(){}
    public Vector(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    /**
     * Метод используется для векторного умножения
     */
    public  void vectorMultiplication(){

    }
    /**
     * Метод используется для нахождения
     * скалярного произведения двух векторов
     * @param vector первый параметр(координаты первого вектора)
     *                 метода scalarProduct(тип
     *      *           передваемого значения Vector)
     * @param vector2  второй параметр(координаты второго вектора)
     *                   метода scalarProduct(тип
     *      *            передваемого значения Vector)
     * @return double - тип возращаемого значения скалярного произведения
     */
    public static double scalarProduct(Vector vector, Vector vector2){
        return (vector.getX2() - vector.getX1()) * (vector2.getX2() - vector2.getX1()) + (vector.getY2() - vector.getY1()) * (vector2.getY2() - vector2.getY1());
    }
    /**
     * Метод используется для нахождения
     * длины вектора
     * @param vector   параметр(координаты вектора)
     *                 метода vectorLength(тип
     *                 передваемого значения Vector)
     * @return double - тип возращаемого значения длины вектора
     */
    public static double vectorLength(Vector vector){
        return Math.sqrt(Math.pow(vector.getX2() - vector.getX1(),2) + Math.pow(vector.getY2() - vector.getY1(),2));
    }
    /**
     * Метод используется для нахождения
     * произведения вектора на число
     * @param vector  параметр(координаты вектора)
     *                 метода multiplyingVectorOnNumber
     *                 (тип передваемого значения Vector)
     * @param lambda  параметр(координаты вектора)
     *                 метода multiplyingVectorOnNumber
     *                 (тип передаваемого значения double)
     * @return double - тип возращаемого значения длины вектора
     */
    public static Vector multiplyingVectorOnNumber(Vector vector, double lambda){
        return new Vector(vector.getX1() * lambda,vector.getY1() * lambda, vector.getX2() * lambda, vector.getY2() * lambda);
    }
    /**
     * Метод используется для нахождения
     * суммы двух векторов
     * @param vector первый параметр(координаты первого вектора)
     *                 метода sumVectors(тип передваемого значения Vector)
     * @param vector2 второй параметр(координаты второго вектора)
     *                   метода sumVectors(тип передваемого значения Vector)
     * @return Vector - тип возращаемого значения суммы векторов
     */
    public static Vector sumVectors(Vector vector, Vector vector2){
        return new Vector(vector.getX1() + vector2.getX1(),vector.getY1() + vector2.getY1(), vector.getX2() + vector2.getX2(), vector.getY2() + vector2.getY2());
    }
    /**
     * Метод используется для нахождения
     * разности двух векторов
     * @param vector первый параметр(координаты первого вектора)
     *                 метода minusVectors(тип передваемого значения Vector)
     * @param vector2 второй параметр(координаты второго вектора)
     *                   метода minusVectors(тип передваемого значения Vector)
     * @return Vector - тип возращаемого значения разности векторов
     */
    public static Vector minusVectors(Vector vector, Vector vector2){
        return new Vector(vector.getX1() - vector2.getX1(),vector.getY1() - vector2.getY1(), vector.getX2() - vector2.getX2(), vector.getY2() - vector2.getY2());
    }
    /**
     * Метод используется для вывода на экран координат векторов
     * @param vector  параметр(координаты вектора)
     *                 метода printVector
     *                 (тип передваемого значения Vector)
     */
    public static void printVector(Vector vector){
        System.out.println("Координаты вектора: x1 = " + vector.getX1() + " x2 = " + vector.getX2() + " y1 = " + vector.getY1() + " y2 = " + vector.getY2());
    }
}
