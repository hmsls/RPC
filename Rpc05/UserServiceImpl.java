package RPC.Rpc05;

import RPC.IUserService;
import RPC.User;

public class UserServiceImpl implements IUserService {
    public User findUserById(Integer id){
        return new User(id,"Alice");
    }
}
