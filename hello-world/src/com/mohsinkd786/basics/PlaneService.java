package com.mohsinkd786.basics;

public class PlaneService {

    void getPlaneInfo(Plane plane, int x, int y) {
        int area = plane.calculateWidth(x, y);
        System.out.println("Area " + area);
        System.out.println("Plane Id "+plane.planeId);

        plane.planeId = 15;
    }
}
