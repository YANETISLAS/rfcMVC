
package main;
import models.ModelRfc;
import views.ViewRfc;
import controllers.ControllerRfc;

public class Main {
    private static ViewRfc viewRfc;
    private static ModelRfc modelRfc;
    private static ControllerRfc controllerRfc;
   
    public static void main(String[] args) {
         ModelRfc modelRfc = new ModelRfc();
         ViewRfc viewRfc = new ViewRfc();
         ControllerRfc controllerRfc = new ControllerRfc(modelRfc, viewRfc);
    }
    
}
