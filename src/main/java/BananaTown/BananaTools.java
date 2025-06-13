package BananaTown;

public class BananaTools {

    public String bananaPeeler(String banana) {
        if (banana.equals("banana")) {
            return "peeled banana";
        } else {
            return "that wasn't a banana";
        }
    }

    public Banana bananaPeeler(Banana banana) {
        switch(banana) {
            case ripe:
                return Banana.peeled;
            case underripe:
                System.out.println("banana not ready yet");
                break;
            case peeled:
                System.out.println("already peeled dude");
                break;
            case eaten:
                System.out.println("you already ate it lol");
                break;
        }
        return banana;
    }

}