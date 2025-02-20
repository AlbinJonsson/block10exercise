package oopd_gu_chalmers.polygons.polygon;

public class PolygonFactory {

    public static Polygon createTriangle(int x, int y) {
        return new Triangle(x, y);
    }

    public static Polygon createRectangle(int x, int y) {
        return new Rectangle(x, y);
    }

    public static Polygon createSquare(int x, int y) {
        return new Square(x, y);
    }
}
// TODO: 1c: Why should this class reside inside the
//  oopd_gu_chalmers.polygons.polygon subpackage, and not in
//  oopd_gu_chalmers.polygons together with DrawPolygons?

//✅ Keeps creation logic separate from usage logic.
//✅ Follows Factory Pattern principles by decoupling object creation.
//✅ Makes code easier to maintain and extend.

// TODO: 1d: Draw a UML class diagram over the new
//  structure for the package. What is the public
//  interface to the polygon subpackage now?

// TODO: 1e: See the concrete subclasses.

// TODO: 1f: Can we make the interface to the subpackage
//  even more abstract, without losing functionality? How?

// TODO: 1g: How do these changes relate to our SOLID principles?
//  Which principles are we striving to adhere to with these changes?

// TODO: 1h: Can you see any drawbacks with introducing
//  a PolygonFactory, instead of exposing the subclasses
//  directly?