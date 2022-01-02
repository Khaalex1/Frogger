package GraphicalElements;

import GameCommons.Main;
import MovingElements.Frog;
import MovingElements.Obstacle;
import processing.core.PApplet;
import processing.core.PImage;

import java.util.ArrayList;

public class Element extends PApplet implements IFroggerGraphics {

    PApplet P;
    PImage im_frog;

    public Element(PApplet P){
        this.P = P;
    }

    @Override
    public void create_case(float x, float y, float w, float h, float r, float g, float b) {
        P.fill(r,g,b);
        //P.noStroke();
        P.rectMode(P.CORNERS);
        P.rect(x, y, w, h);
    }


    @Override
    public void show_frog(Frog frog, PImage icon) {
        //im_frog = P.loadImage("C:\\Users\\alexa\\IdeaProjects\\FroggerV2\\src\\main\\java\\Images\\frog2.png");
        try {
            this.P.image(icon, frog.getLeft(), frog.getBottom(), frog.getWidth(), frog.getHeight());
        }
        catch (NullPointerException e){
            System.out.println("Le chemin de l'image pour la(les) grenouille(s) n'est pas le bon");
        }
    }

    @Override
    public void show_car(PImage im_car, Obstacle.Car car) {
        //create_case(car.getLeft(), car.getTop(), car.getRight(), car.getBottom(), 255, 0, 0);
        //PImage im_car = P.loadImage("src\\main\\java\\Images\\Car.png");
        try {
            this.P.image(im_car, car.getLeft(), car.getBottom(), car.getWidth(), car.getHeight());
        }
        catch (NullPointerException e){
            System.out.println("Le chemin de l'image pour la voiture n'est pas le bon");
        }


    }
    @Override
    public void show_trunk(PImage im_trunk, Obstacle.Trunk trunk) {
        //create_case(trunk.getLeft(), trunk.getTop(), trunk.getRight(), trunk.getBottom(), 88, 41, 0);
        //PImage im_trunk = P.loadImage("src\\main\\java\\Images\\Log.png");
        try {
            this.P.image(im_trunk, trunk.getLeft(), trunk.getBottom(), trunk.getWidth(), trunk.getHeight());
        }
        catch (NullPointerException e){
            System.out.println("Le chemin de l'image pour le tronc n'est pas le bon");
        }
    }

    @Override
    public void create_text(String text, int size, int x, int y, int r, int g, int b) {
        P.fill(r, g, b);
        P.textSize(size);
        P.text(text, x, y);
    }
    }

