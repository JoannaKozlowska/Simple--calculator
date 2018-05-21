package com.kodilla.testing.shape;

import org.junit.*;


public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddShape(){
        //given
        Shape circle = new Circle(2.0);
        Shape square = new Square(3.0);
        ShapeCollector collector = new ShapeCollector();
        //when
        collector.addFigure(circle);
        collector.addFigure(square);
        //then
        Assert.assertEquals(2, collector.getShapeQuantity());
    }
    @Test
    public void testRemoveShape(){
        //given
        Circle circle = new Circle( 2.0);
        ShapeCollector collector = new ShapeCollector();
        //when
        collector.addFigure(circle);
        boolean result = collector.removeFigure(circle);
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void testGetShape(){
        //given
        Shape circle = new Circle( 2.0);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(circle);
        //when
        Shape retrievedFigure = collector.getFigure(0);
        //then
        Assert.assertEquals(circle, retrievedFigure);
    }
    @Test
    public void testRemoveNotExistingShape() {
        //given
        Shape square = new Square(2);
        ShapeCollector collector = new ShapeCollector();
        //when
        boolean result = collector.removeFigure(square);
        //then
        Assert.assertFalse(result);
    }
    @Test
    public void testGetShapeName(){
        //given
        Shape square = new Square(2);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(square);
        //when
        String result = collector.getFigure(0).getShapeName();
        //then
        Assert.assertEquals("square", result);
    }
    @Test
    public void testGetShapeField() {
        //given
        Shape square = new Square(2);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(square);
        //when
        double result = collector.getFigure(0).getField();
        //then
        Assert.assertEquals(4, result,0.001);
    }
}
