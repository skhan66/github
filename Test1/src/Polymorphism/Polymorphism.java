package Polymorphism;

public class Polymorphism {
        public static void main(String[] args) {

            Cakes myCake = new Cakes();
            Cakes myDess = new Redvelvet();
            myCake.creamy();
            myDess.creamy();
        }
    }
    class Cakes {
        public void creamy() {
            System.out.println("Cake is creamy");
        }
    }

    class Redvelvet extends Cakes {
        public void creamy() {
            System.out.println("Redvelvet is very sweet");
        }
    }
