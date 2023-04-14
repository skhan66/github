package Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Redvelvet mycake = new Redvelvet();
        mycake.creamy();
        mycake.sweet();
    }
}
    class Cakes {
        public void creamy() {
            System.out.println("Cake is creamy");
        }
    }

    class Redvelvet extends Cakes {
        public void sweet() {
            System.out.println("Redvelvet is very sugary");
        }
    }