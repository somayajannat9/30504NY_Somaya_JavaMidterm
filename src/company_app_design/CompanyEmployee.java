package company_app_design;

public class CompanyEmployee {

    /** INSTRUCTIONS
     *
     *  This class has a main method where you will be able to create instances of the EmployeeInfo class in order
     *  to use attributes and methods.
     *
     *  Demonstrate as many methods as possible here. Feel free to show off what you've learned so far.
     *
     *  The goal of this application is to provide basic employee information services
     *  Try to think like a Software Developer
     */
    public static void main(String[] args) {

        EmployeeInfo emily = new EmployeeInfo("emily", 1, 40000);

        System.out.println(emily.name + "'s ID is " + emily.employeeId + " and salary is " + emily.salary);

        EmployeeInfo somaya = new EmployeeInfo("somaya", 2,80000);

        System.out.println(somaya.name + "'s ID is " + somaya.employeeId + " and salary is " + somaya.salary);

        EmployeeInfo fish = new EmployeeInfo("fish", 3, 90000);

        System.out.println(fish.name + "'s ID is " + fish.employeeId + " and salary is " + fish.salary);


    }

}
