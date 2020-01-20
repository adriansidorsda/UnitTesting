public class User {

    public boolean checkName(String userName) {
        if (userName.length() < 3) {
            throw new IllegalArgumentException("Username is too short!");
        } else if( userName.length() >= 3 && userName.length() < 40) {
            return true;
        } else {
            throw new IllegalArgumentException("Username is too long!");
        }
    }
}
