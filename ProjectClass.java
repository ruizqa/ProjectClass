public class ProjectClass{
    private String name;
    private String description;
    private double initialCost;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public double getInitialCost(){
        return initialCost;
    }

    public void setInitialCost(double initialCost){
        this.initialCost = initialCost;
    }
    
    public ProjectClass(){}
    public ProjectClass(String name){
        this.name = name;
    }
    public ProjectClass(String name, String description){
        this.name= name;
        this.description = description;
    }

    public String elevatorPitch(){
        return(String.format("%s (%.2f): %s", this.name, this.initialCost, this.description));
    }



}