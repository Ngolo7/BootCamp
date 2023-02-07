public class First {
    public static void main(String[] args) {
        System.out.println("Hello everyone nice to meet you all!!!" );

        //constructor
        Introduction MyIntro = new Introduction();
        MyIntro.name();
        MyIntro.country();
        MyIntro.major();
        MyIntro.age();
        MyIntro.height();

        Instagram Insta = new Instagram();
        Insta.Username();
        Insta.request();
        Insta.accept();
        Insta.RequestSent();



    }
}
class Introduction{
    void name(){
        System.out.println("My name is Michael Gurung");
    }
    void country(){
        System.out.println("I'm originally from Nepal");
    }
    void major(){
        System.out.println("I'm majoring in Computer Science");

    }
    void age(){
        System.out.println("My age is sweet 21 lol");
    }
    void height(){
        System.out.println("my height is 5'9");
    }
}
class Instagram{
    void Username(){
        System.out.println("MY Instagram username is: Michaelgurung7");
    }
    void request(){
        System.out.println("if you want you can send me a follow request");
    }
    void accept(){
        System.out.println("hey I  have accepted your request");
    }
    void RequestSent(){
        System.out.println("I have sent you a friend request; thanks ");
    }


}

