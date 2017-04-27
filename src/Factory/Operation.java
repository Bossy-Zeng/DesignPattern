package Factory;

/**
 * 声明工厂方法
 * @author Bossy_Zeng
 *
 */
public abstract class Operation {
      private double NumberA;
      private double NumberB;
      
      public double getNumberA() {
		return NumberA;
	}
      public void setNumberA(double numberA) {
		NumberA = numberA;
	}
      public double getNumberB() {
		return NumberB;
	}
      public void setNumberB(double numberB) {
		NumberB = numberB;
	}
      public abstract double GetResult();
}
