package ie.gmit.single;

public class StoreUser {

    //Store used by controller
    private Store store = new Store();

    public boolean storeUserDetails(User user){
        return StoreValidUser(user);
    }

    private boolean StoreValidUser(User user) {
        store.store(user);
        return true;
    }
}
