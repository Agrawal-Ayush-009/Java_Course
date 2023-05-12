public class Patterns {
    public static void palindromic_pyramid (int n) {
        for(int i = 1; i <= n; i++) {
            for(int spaces = 1; spaces <= (n-i); spaces++) {
                System.out.print("  ");
            }

            for(int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            for(int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void number_pyramid (int n) {
        for(int i = 1; i <= n; i++) {
            for(int spaces = 1; spaces <=(n-i); spaces++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    public static void diamond (int n) {
        for(int i = 1; i <= n; i++) {
            for(int spaces = 1; spaces <=(n-i); spaces++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= 2*(i-1)+1; j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
        for(int i = n; i >= 1; i--) {
            for(int spaces = 1; spaces <=(n-i); spaces++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= (2*(i-1)+1); j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }

    public static void hollow_rhombus (int toRows, int toCols) {
        for(int i = 1; i <= toRows; i++) {
            for(int spaces = 1; spaces <= (toRows - i); spaces ++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= toCols; j++) {
                if(i == 1 || i == toRows || j == 1 || j == toCols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly_Pattern (int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            } 

            for(int space = 1; space <= 2*(n -i); space++) {
                System.out.print(" ");
            } 

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            } 

            for(int space = 1; space <= 2*(n -i); space++) {
                System.out.print(" ");
            } 

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void zero_one_Triangle (int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1 ; j <= i; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void floyds_triangle (int n) {
        int num = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void inverted_pyramid_Numbers (int n) {
        for(int i = n; i >= 1; i--) {  // else we can use i = 1 to n and  j = 1 to (n-i+1)
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void parallelogram (int toRows, int toCols) {
        for(int i = 1; i <= toRows; i++) {
            for(int j = 1; j <= (toRows - i); j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= toCols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_pyramid (int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= (n - i) ; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_Square (int toRows, int toCols) {
        for(int i = 1; i <= toRows; i++) {
            for(int j = 1; j <= toCols; j++) {
                if(i == 1 || i == toRows || j == 1 || j == toCols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void altenate_reverse_pattern(int n){
        int start_num = 1;
        int current_num = start_num;
        for (int i = 0; i < n; i++) {
            int[] row = new int[i + 1];
            if (i == 0) {
                row[0] = current_num;
                System.out.println(row[0]);
                current_num += 1;
            } else if (i % 2 != 0) {
                for (int j = 0; j < i + 1; j++) {
                    row[j] = current_num;
                    current_num += 1;
                }
                for (int j = 0; j < row.length; j++) {
                    System.out.print(row[j] + " ");
                }
                System.out.println();
            } else {
                for (int j = 0; j < i + 1; j++) {
                    row[j] = current_num;
                    current_num += 1;
                }
                for (int j = row.length - 1; j >= 0; j--) {
                    System.out.print(row[j] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        // System.out.println("Hollow Square");
        // hollow_Square(5, 5);
        // System.out.println("Inverted Pyramid");
        // inverted_pyramid(4);
        // System.out.println("Parallelogram");
        // parallelogram(5, 5);
        // System.out.println("Inverted Pyramid With Numbers");
        // inverted_pyramid_Numbers(5);
        // System.out.println("Floyd's Triangle");
        // floyds_triangle(5);
        // System.out.println();
        // System.out.println("0-1 Pyramid");
        // zero_one_Triangle(5);
        // System.out.println("Butterfly Pattern");
        // butterfly_Pattern(4);
        // System.out.println("Hollow Rhombus");
        // hollow_rhombus(5, 5);
        // System.out.println("Diamond"); 
        // diamond(8);
        // System.out.println("Number Pyramid");
        // number_pyramid(9);

        /*
          1
          2 3
          6 5 4
          7 8 9 10
          15 14 13 12 11

         */

        System.out.println("Alternate Reverse Pattern");
        altenate_reverse_pattern(6);


    //     System.out.println("Palindromic Number Pyramid");
    //     palindromic_pyramid(9);
    }
}