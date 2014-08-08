package heisenbugdev.planck;

public class Testing {

    public static void main(String[] args) {
        Bacon bakon = new Bacon();
    }
}

class Bacon {

    Bacon() {
        ThisOrThat.callSomething(this);
    }
}

class ThisOrThat {
    public static void callSomething(Object obj) {
        String name = obj.getClass().getPackage().toString();
        System.out.println(name);
        if (name.substring(name.lastIndexOf('.') + 1).equals("planck")) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
