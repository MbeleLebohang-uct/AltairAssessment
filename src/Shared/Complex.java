package Shared;

public class Complex {
    private double real;
    private double imag;

    public Complex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    /**
     * Add this complex number to the other complex number
     * @param other
     * @return the sum of the two complex numbers
     */
    public Complex add(Complex other){
        return  new Complex(this.real + other.real, this.imag + other.imag);
    }

    /**
     * Multiply this complex number with the other complex number
     * @param other
     * @return the product of the two complex numbers
     */
    public Complex mul(Complex other){
        // (a + bi)(c + di) = ac + adi + cbi - db
        double newReal = (this.real * other.real) - (this.imag * other.imag);
        double newImag = (this.real * other.imag) + (other.real * this.imag);

        return new Complex(newReal, newImag);
    }

    public double getReal(){
        return real;
    }

    public double getImag(){
        return imag;
    }


    @Override
    public String toString() {
        String sign = (imag < 0) ? "": "+";
        return real +
                sign + imag +
                'i';
    }
}
