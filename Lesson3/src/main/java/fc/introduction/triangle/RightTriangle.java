package fc.introduction.triangle;

public class RightTriangle {

    public static void main(String[] args) {

        System.out.println(isRightTriangle(10,8,6));
        System.out.println(isRightTriangle(3,4,5));
    }

    public static String isRightTriangle(int firstSide, int secondSide, int thirdSide) {
        if (firstSide > 0 && secondSide > 0 && thirdSide > 0) {
            int firstSideToSquare = (int) Math.pow(firstSide,2);
            int secondSideToSquare = (int) Math.pow(secondSide,2);
            int thirdSideToSquare = (int) Math.pow(thirdSide,2);
            if (thirdSideToSquare == firstSideToSquare + secondSideToSquare
                    || secondSideToSquare == firstSideToSquare + thirdSideToSquare
                    || firstSideToSquare == secondSideToSquare + thirdSideToSquare) {
                return "Right Triangle";
            } else {
                return "Not a right Triangle";
            }
        } else {
            return "Invalid";
        }
    }
}

