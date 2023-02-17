public class CalculateG {
      
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int square(int a) {
        return a * a;
    }

    public static int summation(int a, int b) {
        return a + b;
    }

    public static void printResult(int result) {
        System.out.println("The result is: " + result);
    }
     
    
    public static void outline(String message, double result) {
        System.out.println(message + result);
    }

    public static void main(String[] args) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double fallingTime = 30;
        double initialVelocity = 0.0;
        double finalVelocity;
        double initialPosition = 0.0;
        double finalPosition;
   /* a = gravity
      t = fallingTime ( in seconds)
      v = finalVelocity
      x = finalPosition
      vi = initialVelocity
      xi = initialPosition
      𝑥(𝑡) = 0.5 ∗𝑎𝑡2 + 𝑣𝑖𝑡 + 𝑥𝑖
      𝑣(𝑡) = 𝑎𝑡 + 𝑣𝑖
   */
        
   
      finalPosition = ((0.5*gravity*(fallingTime*fallingTime))+initialVelocity*fallingTime+initialPosition)/fallingTime;
      
      finalVelocity = (gravity*fallingTime+initialVelocity)/fallingTime;
        
        
        
        
        
        System.out.println("The object's position after " + fallingTime + "seconds is" + finalPosition + "m.");
        
        System.out.println("The object's final velocity after " +fallingTime + "seconds is" + finalVelocity + "m/s.");
        
        
         
        int a = 5;
        int b = 10;
        int product = multiply(a, b);
        int square = square(a);
        int summation = summation(a, b);
        printResult(product);
        printResult(square);
        printResult(summation);
        
    }
  }

    

