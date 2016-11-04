package fh.java.geometry;

import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.curved.Circle;
import fh.java.geometry.model.quadrilateral.Rectangle;
import fh.java.geometry.model.trilateral.RightTriangle;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        main.doIt();
    }

    private void doIt() {

        List<GeometricShape> shapeList = new ArrayList<>();

        fillList(shapeList);

        printList(shapeList);

        List<Circle> circleList = new ArrayList<>();
        for (GeometricShape shape : shapeList) {
            if (shape instanceof Circle) {
                //circleList.add((Circle)shape);
            }
        }
        System.out.println("------ circle ------");
        for (Circle circle : circleList) {
            System.out.println(circle);
        }

    }

    public void printList(List<GeometricShape> shapeList) {

        System.out.println("------ for loop ------");
        for (int pos = 0; pos < shapeList.size(); pos++) {
            System.out.println(shapeList.get(pos));
        }
        // Never do that again above!

        System.out.println("------ for each ------");
        for (GeometricShape shape : shapeList) {

            System.out.println(shape);
        }

        System.out.println("------ stream 1 ------");
        shapeList
                .stream()
                .forEach(shape-> System.out.println(shape));

        System.out.println("------ stream 2 ------");
        shapeList
                .stream()
                .forEach(System.out::println);

    }

    public void fillList(List<GeometricShape> shapeList) {

        shapeList.add(new Circle(1,2,2.0));
        shapeList.add(new Circle(1,3,2.0));
        shapeList.add(new Circle(4,2,5.0));

        shapeList.add(new RightTriangle(11,22,10.0,11.0));
        shapeList.add(new RightTriangle(40,22,10.0,11.0));
        shapeList.add(new RightTriangle(11,40,10.0,11.0));

        shapeList.add(new Rectangle(1,60,20.1,21.11));
        shapeList.add(new Rectangle(1,2,20.1,21.11));
        shapeList.add(new Rectangle(35,2,20.1,21.11));
    }


}
