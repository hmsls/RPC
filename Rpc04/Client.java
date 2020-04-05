package RPC.Rpc04;

import RPC.IUserService;

public class Client {
    public static void main(String[] args) throws Exception{
        IUserService stub = Stub.getStud();
        System.out.println(stub.findUserById(123));
    }
}
