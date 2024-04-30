package com.multiplePackage2;
import com.multiplePackage1.Employee;

/**
 * This is example we are trying to import Different Package into this package
 *
 * We are importing "multiplePackage1" in this package
 * To import a class from different package we first need to import the package, we need to make sure that class we are trying to
 * import is 'public' and it has a 'public' constructor to make sure we can create object of the class.
 */
public class MultiplePacakgeTest {

    public static void main(String[] args) {

        // This is the object of the 'Employee' class from Package 'multiplePackage1'
        Employee employeePackage1 = new Employee();
    }
}
