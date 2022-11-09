package it.unibo.mvc.view;

import it.unibo.mvc.api.DrawNumberController;
import it.unibo.mvc.api.DrawNumberView;
import it.unibo.mvc.api.DrawResult;

public class DrawNumberStdoutView implements DrawNumberView{

    private DrawNumberController controller;

    public DrawNumberStdoutView(){
    }

    @Override
    public void setController(DrawNumberController observer) {
        this.controller = observer;
    }

    @Override
    public void start() {
    }

    @Override
    public void result(DrawResult res) {
        System.out.println(res.getDescription());        
    }

}