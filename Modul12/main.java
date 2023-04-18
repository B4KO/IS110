public class main {
    public abstract class Animal {
        public abstract void makeSound();
        public void sleep() {
            System.out.println("ZZZ");
        }
    }
    public class Cat extends Animal {
        public void makeSound() {
            System.out.println("Meow");
        }
    }

    public interface Shape {

        double getArea();
        double getPerimeter();
    }

//    public interface Random {
//        public void random();
//
//    }

    public class Rectangle implements Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return width * height;
        }

//        public void random() {
//            return;
//        }

        public double getPerimeter() {
            return 2 * (width + height);
        }
    }


}
