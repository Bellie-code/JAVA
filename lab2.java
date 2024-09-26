package lab;
public class lab2 {
  public static void main(String[] args) {
		// TODO Auto-generated method stub
      byte byteValue = 125;  // You can change this to any byte value
      
      // Define the range of a byte
      byte minValue = Byte.MIN_VALUE;  // -128
      byte maxValue = Byte.MAX_VALUE;  // 127

      // Print the byte value and its range
      System.out.println("Byte value: " + byteValue);
      System.out.println("Byte range: " + minValue + " to " + maxValue);
      
      // Check if the byte value is within the range
      if (byteValue >= minValue && byteValue <= maxValue) {
          System.out.println("The byte value is within the valid range.");
      } else {
          System.out.println("The byte value is out of range.");
      }
  }
}
