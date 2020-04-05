package RPC;

public class UserServiceImpl implements IUserService {
    public User findUserById(Integer id){
        return new User(id,"Alice");
    }
}
