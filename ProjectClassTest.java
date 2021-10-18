public class ProjectClassTest{

    public static void main (String args[]){

        ProjectClass test= new ProjectClass();
        ProjectClass test2= new ProjectClass("First Project");
        ProjectClass test3= new ProjectClass("Second Project", "Second Project Description");
        Portfolio testP = new Portfolio();
        test2.setInitialCost(10.0);
        test3.setInitialCost(50.0);
        System.out.println(test.elevatorPitch());
        System.out.println(test2.elevatorPitch());
        System.out.println(test3.elevatorPitch());
        testP.addProject(test);
        testP.addProject(test2);
        testP.addProject(test3);
        testP.showPortfolio();
        
    }

}