import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTestTest {

    @Test
    @DisplayName("case equilateral triangle")
    void triangleclassifierEquilateralTriangle() {
        int side1=2;
        int side2=2;
        int side3=2;
        String expected="equilateral triangle";
        String result= TriangleClassifierTest.triangleclassifier(2,2,2);
        assertEquals(result,expected);
    }
    @Test
    @DisplayName("case isosceles triangle")
    void triangleclassifierIsoscelesTriangle() {
        int side1=2;
        int side2=2;
        int side3=3;
        String expected="isosceles triangle";
        String result= TriangleClassifierTest.triangleclassifier(2,2,3);
        assertEquals(result,expected);
    }
    @Test
    @DisplayName("case normal triangle")
    void triangleclassifierNormalTriangle() {
        int side1=3;
        int side2=4;
        int side3=5;
        String expected="normal triangle";
        String result= TriangleClassifierTest.triangleclassifier(3,4,5);
        assertEquals(result,expected);
    }
    @Test
    @DisplayName("case side1=8, side2=2, side3=3")
    void triangleclassifierCase8and2and3() {
        int side1=8;
        int side2=2;
        int side3=3;
        String expected="is not triangle";
        String result= TriangleClassifierTest.triangleclassifier(8,2,3);
        assertEquals(result,expected);
    }
    @Test
    @DisplayName("case side1=-1, side2=2, side3=1")
    void triangleclassifierCaseNagative1and2and1() {
        int side1=-1;
        int side2=2;
        int side3=1;
        String expected="is not triangle";
        String result= TriangleClassifierTest.triangleclassifier(-1,2,1);
        assertEquals(result,expected);
    }
    @Test
    @DisplayName("case side1=0, side2=1, side3=1")
    void triangleclassifierCase0and1and1() {
        int side1=0;
        int side2=1;
        int side3=1;
        String expected="is not triangle";
        String result= TriangleClassifierTest.triangleclassifier(0,1,1);
        assertEquals(result,expected);
    }
}