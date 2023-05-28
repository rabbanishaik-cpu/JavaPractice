//Mostly used in Encapsulation( Data hiding) , it gives us more control over data.
package PracticeCodes;

public class GettersAndSetters {
    private String Name;
    public void setName(String text){
        this.Name= text;
    }
    public String getName(){
        return this.Name;
    }
}
class secondClass{
    public static void main(String[] args) {
        GettersAndSetters getSet = new GettersAndSetters();
        getSet.setName("Harika");
        System.out.println(getSet.getName());
    }
}
