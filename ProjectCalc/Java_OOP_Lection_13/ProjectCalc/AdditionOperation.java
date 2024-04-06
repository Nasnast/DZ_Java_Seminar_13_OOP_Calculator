package Java_OOP_Lection_13.ProjectCalc;

public class AdditionOperation implements IOperation {
    public ComplexNumber operation(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() + b.getReal(), a.getImaginary() + b.getImaginary());
    }

}
