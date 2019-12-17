import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

public class Vector2D {

    double vX, vY;

    Vector2D(){
        vX = 1;
        vY = 1;
    }

    Vector2D(double x, double y){
        vX = x;
        vY = y;
    }

    Vector2D(Vector2D v){
        vX = v.vX;
        vY = v.vY;
    }

    public void print(){
        System.out.println(String.format(Locale.US, "(%.2f,%.2f)", vX,vY));
    }

    public void sum(Vector2D v){
        vX += v.vX;
    }
}
