class Complex {
    double real;
    double imag;

    // Default Constructor
    Complex() {
        real = 0;
        imag = 0;
    }

    // Parameterized Constructor
    Complex(double r, double i) {
        real = r;
        imag = i;
    }

    // Addition
    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    // Subtraction
    Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }

    // Multiplication
    Complex multiply(Complex c) {
        double r = (this.real * c.real) - (this.imag * c.imag);
        double i = (this.real * c.imag) + (this.imag * c.real);
        return new Complex(r, i);
    }

    // Display
    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class ComplexDemo {
    public static void main(String[] args) {
        // Creating complex numbers
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, 5);

        // Operations
        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        Complex prod = c1.multiply(c2);

        // Output
        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        System.out.print("Addition: ");
        sum.display();

        System.out.print("Subtraction: ");
        diff.display();

        System.out.print("Multiplication: ");
        prod.display();
    }
}
