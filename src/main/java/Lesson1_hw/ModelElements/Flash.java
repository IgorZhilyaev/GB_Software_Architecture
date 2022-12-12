package Lesson1_hw.ModelElements;

import java.awt.*;
import java.util.Collection;

public class Flash {

    private Collection<Point3D> location;
    private Collection<Angle3D> angle;
    private Collection<Color> colors;
    private float power;

    public Collection<Point3D> getLocation() {
        return location;
    }

    public void setLocation(Collection<Point3D> location) {
        this.location = location;
    }

    public Collection<Angle3D> getAngle() {
        return angle;
    }

    public void setAngle(Collection<Angle3D> angle) {
        this.angle = angle;
    }

    public Collection<Color> getColors() {
        return colors;
    }

    public void setColors(Collection<Color> colors) {
        this.colors = colors;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }



    public void moveFlash(Point3D movePoint) {}

    public void rotateFlash(Angle3D rotateAngle) {}
}



