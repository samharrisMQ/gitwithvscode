public class Person {
    String name;
    int age;
    String dob;
    String interests;
    String favFood;
    int bodyCount;

    Person() {
        age = 0;
    }

    Person(String pName, int pAge) {
        name = pName;
        age = pAge;
    }

    Person(String pName, int pAge, String pInterests, String pFavFood, int pBodyCount) {
        name = pName;
        age = pAge;
        interests = pInterests;
        favFood = pFavFood;
        bodyCount = pBodyCount;
    }

    void attack() {
        System.out.println(name + ", KILL!");
    }

    void statcheck() {
        System.out.println(name + ", " + age);
    }

    void moreInfo() {
        if(bodyCount < 10) {
            System.out.println("likes " + interests + ", favourite food is " 
            + favFood + ", has caught " + bodyCount + " bodies. GAY!!!" ); 
        } else {
            System.out.println("likes " + interests + ", favourite food is " 
            + favFood + ", has caught " + bodyCount + " bodies. He a body snatcher!!"); 
        }
    }
}
