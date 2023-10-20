public class Stars {
    public void rightHalfPyramid() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void leftHalfPyramid() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void fullPyramid() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void invertedRightHalfPyramid() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" *");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public void invertedLeftHalfPyramid() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= 5; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void invertedFullPyramid() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void rhombusPattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void diamondPattern() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void hourglassPattern() {

        System.out.println();
    }

    public void hollowSquarePattern() {
        for (int i = 1; i <= 6; i++) {
            if (i == 1 || i == 6) {
                System.out.println("* * * * * *");
            } else {
                System.out.println("*         *");
            }
        }
        System.out.println();
    }

    public void hollowFullPyramid() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k <= 2 * i - 3; k++) {
                System.out.print(" ");
            }
            if (i > 1) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("* * * * *");
        System.out.println();
    }

    public void hollowInvertedFullPyramid() {
        System.out.println("* * * * *");
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k <= 2 * i - 3; k++) {
                System.out.print(" ");
            }
            if (i > 1) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void hollowDiamondPyramid() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k <= 2 * i - 3; k++) {
                System.out.print(" ");
            }
            if (i > 1) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k <= 2 * i - 3; k++) {
                System.out.print(" ");
            }
            if (i > 1) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void hollowHourglassPattern() {
        System.out.println();
    }

    public void floydsTriangle() {
        int k = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + "  ");
                k++;
            }
            System.out.println();
        }
        System.out.println();
    }

    public int factorial(int i) {
        if (i == 0) {
            return 1;
        }
        return i * factorial(i - 1);
    }
    public void pascalsTriangle() {
        for (int i = 0; i < (3 + 1); i++) {
            for (int u = 0; u < (3 - (i)); u++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" " + factorial(i) / (factorial(i-k) * factorial(k)));
            }
            System.out.print(" 1");
            System.out.println();
        }
        System.out.println();
    }
}