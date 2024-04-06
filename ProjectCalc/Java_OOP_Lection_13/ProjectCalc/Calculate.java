package Java_OOP_Lection_13.ProjectCalc;

public class Calculate {
    private IOperation operation;

    public Calculate(IOperation operation) {
        this.operation = operation;
    }

    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        return operation.operation(a, b);
    }

}
