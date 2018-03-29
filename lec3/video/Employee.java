public class Employee{
    String name;
    Employee supervisor;

    public static void main(String[] args){
        Employee emp = new Employee();
        emp.supervisor = null;
        emp.name = "xiaoliushu";

        process(emp);
    }

    public static void process(Employee emp){
        if ( emp.supervisor == null) {
            System.out.println( emp.name + " is the boss!");
        }
        else {
            Employee runner; // for "running " up the chain of compy
            runner = emp.supervisor;
            if ( runner.supervisor == null) {
                System.out.println( emp.name + " reports directly to the boss. ");
            }
            else {
                int count = 0;
                while( runner.supervisor != null) {
                    count++;
                    runner = runner.supervisor; // move up to the next level.
                }
                System.out.println( "There are " + count +
                                                " supervisor between " + emp.name
                                                + " and the boss. ");
            } // end of else
        } // end of else
    }



}