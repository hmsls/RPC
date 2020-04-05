package RPC.Rpc06;

import RPC.IUserService;

public class Client {
    public static void main(String[] args) throws Exception{
        IUserService stub = (IUserService) Stub.getStud(IUserService.class);
        System.out.println(stub.findUserById(456));
    }
}
