package august.bao0828.proxy2_;

public interface UserService {
    String login(String loginName,String passWord);
    void deleteUsers();
    String selectUsers();
}
