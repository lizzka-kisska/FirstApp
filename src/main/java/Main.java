import Human.Human;
import Human.EnglishSpeakingHuman;

class Main {
    public static void main(String[] args) {
        Human human = new EnglishSpeakingHuman();
        System.out.println(human.sayHello());
    }
}
