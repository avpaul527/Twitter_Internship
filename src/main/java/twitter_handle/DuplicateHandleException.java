package twitter_handle;

public class DuplicateHandleException extends Exception {
    public DuplicateHandleException(String message){
        super(message);
    }
}
