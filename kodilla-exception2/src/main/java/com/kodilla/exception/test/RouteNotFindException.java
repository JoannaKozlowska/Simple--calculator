package com.kodilla.exception.test;

public class RouteNotFindException extends NullPointerException {
    public RouteNotFindException (final String information) {
        super (information);
    }
}
