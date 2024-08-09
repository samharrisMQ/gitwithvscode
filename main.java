public class main {
    public static void main(String[] args) {
        Person p2 = new Person("Jeffrey", 48, "long walks", "grool", 500);
        Person virgin = new Person("gaylord timmy", 30, "gaming", "nuggets", 2);

        p2.statcheck();
        p2.moreInfo();
        System.out.println();
        virgin.statcheck();
        virgin.moreInfo();
    }
}
