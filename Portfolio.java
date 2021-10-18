import java.util.ArrayList;

public class Portfolio{
    ArrayList<ProjectClass> projects = new ArrayList<ProjectClass>();

    public Portfolio(){
    }

    public void addProject(ProjectClass project){
        projects.add(project);
    }

    public void removeProject(int index){
        projects.remove(index);
    }

    public void showPortfolio(){
        for(ProjectClass project: projects){
            System.out.println(project.elevatorPitch());
        }
    }


}