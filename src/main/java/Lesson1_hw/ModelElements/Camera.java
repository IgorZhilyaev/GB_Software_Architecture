package Lesson1_hw.ModelElements;

import java.util.Collection;

public class Camera {

    private Collection<Point3D> location;
    private Collection<Angle3D> angle;

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

    public void rotateCamera(Angle3D rotateAngle){}
    public void moveCamera(Point3D movePoint){}

}
