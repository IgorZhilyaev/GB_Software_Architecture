package Lesson1_hw.ModelElements;


import Lesson1_hw.Stuff.Point3D;

/**
 * модель полигона
 */
public class PoligonalModel {

    public Poligon poligons;
    public Texture textures;

    /**
     * конструктор
     * @param inputTexture
     */
    public PoligonalModel(Texture inputTexture) {
        textures = inputTexture;
        poligons = new Poligon(new Point3D());
    }
}

