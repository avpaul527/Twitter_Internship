package twitter_handle;

import java.util.HashSet;

public class Twitter_Handle {
    private static HashSet<String> listOfHandles = new HashSet<>();

    public static String createHandle(String yourSocialHandle) throws EmptyHandleException {
        if (yourSocialHandle == null || yourSocialHandle.trim().isEmpty()) {
            throw new EmptyHandleException("Error: Handle cannot be empty or blank");
        }

        yourSocialHandle = yourSocialHandle.trim().toLowerCase();

        if (yourSocialHandle.length() > 9) {
            yourSocialHandle = yourSocialHandle.substring(0, 9);
        }

        return "@" + yourSocialHandle;
    }


    public static void addHandle(String yourSocialHandle) throws EmptyHandleException, DuplicateHandleException {
        String handle = createHandle(yourSocialHandle);

        if (listOfHandles.contains(handle)) {
            throw new DuplicateHandleException("Error: Handle '" + handle + "' already exists");
        }

        listOfHandles.add(handle);
    }


    public static void removeHandle(String yourSocialHandle) throws EmptyHandleException {
        String handle = createHandle(yourSocialHandle);


        if (!listOfHandles.remove(handle)) {
            System.out.println("Handle '" + handle + "' not found for removal.");
        }
    }


    public static HashSet<String> getHandles() {
        return listOfHandles;
    }

    public HashSet<String> getListOfHandles() {
        return listOfHandles;
    }

    public void setListOfHandles(HashSet<String> listOfHandles) {
        this.listOfHandles = listOfHandles;
    }
}
