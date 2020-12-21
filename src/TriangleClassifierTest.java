public class TriangleClassifierTest {
    public static String triangleclassifier(int side1,int side2, int side3){
        String result="";
        boolean isEquilateralTriangle=side1==side2&&side1==side3;
        boolean isIsoscelesTriangle=side1==side2||side1==side3;
        boolean isOneSideSmallThanTwoSide=(side1+side2)>side3&&(side3+side2)>side1&&(side1+side3)>side2;
        if (isOneSideSmallThanTwoSide){
        if (isEquilateralTriangle){
            result="equilateral triangle";
        }else if (isIsoscelesTriangle){
            result="isosceles triangle";
        }else {
            result="normal triangle";
        }
        }else {
            result="is not triangle";
        }
        return result;
    }

}
