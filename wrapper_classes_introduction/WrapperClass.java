package wrapper_classes_introduction;

public class WrapperClass {
  public static void main(String[] args) {
    // Wrapper classes are used to convert primitive data types into objects
    // and vice versa.
    // Primitive data types are not objects, they do not belong to any class.
    // To use them in object-oriented programming, they must be converted into
    // objects.
    // The wrapper classes are part of the java.lang package, which is imported
    // by default into all Java programs.
    // Wrapper classes are final, immutable, and serializable.

    // Premitive data types
    byte byteValue = 10;
    short shortValue = 20;
    int intValue = 30;
    long longValue = 40;
    float floatValue = 50.0f;
    double doubleValue = 60.0;
    char charValue = 'A';
    boolean booleanValue = true;

    // Wrapper classes - converting primitive data types into objects
    Byte byteObject = byteValue;
    Short shortObject = shortValue;
    Integer intObject = intValue;
    Long longObject = longValue;
    Float floatObject = floatValue;
    Double doubleObject = doubleValue;
    Character charObject = charValue;
    Boolean booleanValueObject = booleanValue;

    // Printing the values
    System.out.println("Byte: " + byteObject);
    System.out.println("Short: " + shortObject);
    System.out.println("Integer: " + intObject);
    System.out.println("Long: " + longObject);
    System.out.println("Float: " + floatObject);
    System.out.println("Double: " + doubleObject);
    System.out.println("Character: " + charObject);
    System.out.println("Boolean: " + booleanValueObject);

    // `new` and `valueOf` methods difference
    Integer int1 = new Integer(10);
    Integer int2 = new Integer(10);
    System.out.println("with new " + (int1 == int2));

    Integer int3 = Integer.valueOf(10);
    Integer int4 = Integer.valueOf(10);
    System.out.println("with valueOf " + (int3 == int4));

  }
}
