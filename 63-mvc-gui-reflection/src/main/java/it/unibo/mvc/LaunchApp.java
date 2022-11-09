package it.unibo.mvc;

import it.unibo.mvc.api.DrawNumberController;
import it.unibo.mvc.controller.DrawNumberControllerImpl;
import it.unibo.mvc.model.DrawNumberImpl;
import it.unibo.mvc.view.DrawNumberStdoutView;
import it.unibo.mvc.view.DrawNumberSwingView;

/**
 * Application entry-point.
 */
public final class LaunchApp {

    private LaunchApp() { }

    /**
     * Runs the application.
     *
     * @param args ignored
     * @throws ClassNotFoundException if the fetches class does not exist
     * @throws NoSuchMethodException if the 0-ary constructor do not exist
     * @throws InvocationTargetException if the constructor throws exceptions
     * @throws InstantiationException if the constructor throws exceptions
     * @throws IllegalAccessException in case of reflection issues
     * @throws IllegalArgumentException in case of reflection issues
     */

    /* 
    public static void main(final String... args) {
        final var model = new DrawNumberImpl();
        final DrawNumberController app = new DrawNumberControllerImpl(model);
        app.addView(new DrawNumberSwingView());
        app.addView(new DrawNumberSwingView());
        app.addView(new DrawNumberStdoutView());
    }
     */
    
    public static void main(final String... args) {
        //final Class c1 = Class.forName()
        ////final Class<DrawNumberImpl> Model = DrawNumberImpl.class;
        ////final var model = Model.newInstance();
        
        //final DrawNumberController app = new DrawNumberControllerImpl(model);
        ////final Class<DrawNumberControllerImpl> App = DrawNumberControllerImpl.class;
        ////final DrawNumberController app = App.newInstance();
        //app.new
        
        //app.addView(new DrawNumberSwingView());
        //app.addView(new DrawNumberSwingView());
        //app.addView(new DrawNumberStdoutView());
        //final String packView = "it.unibo.mvc.view";


        final var model = new DrawNumberImpl();
        final DrawNumberController app = new DrawNumberControllerImpl(model);
        
        final Class<DrawNumberSwingView> swingV = DrawNumberSwingView.class;
        final Class<DrawNumberStdoutView> stdoutV = DrawNumberStdoutView.class;

        for(int i=0;i<3;i++){
            try {
                app.addView(swingV.newInstance());
                app.addView(stdoutV.newInstance());
            } catch (InstantiationException | IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
           
        }
    
    }
    
    
}
