package twitter_handle;

public class Main {
    public static void main(String[] args) throws EmptyHandleException, DuplicateHandleException {

        Twitter_Handle users = new Twitter_Handle();
        System.out.println(Twitter_Handle.createHandle("Twitters"));
        System.out.println(" ");
        users.addHandle("avpaul");
        users.addHandle("nthegang");
        users.addHandle("wewillremoveextraletters");

        System.out.println("Users");
        System.out.println(users.getListOfHandles());

        users.removeHandle("wewillrem");

        System.out.println("Users after removing one");
        System.out.println(users.getListOfHandles());


    }

}
