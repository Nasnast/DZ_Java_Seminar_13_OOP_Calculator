package Java_OOP_Lection_13.ProjectCalc;

public interface InterfaceOperation {
    IOperation createAdditionOperation();

    IOperation createDivisionOperation();

    IOperation createMultiplicationOperation();

    IOperation createSubtractionOperation();

}
