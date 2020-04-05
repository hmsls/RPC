package RPC.Rpc03;

import RPC.IUserService;

import javax.swing.plaf.IconUIResource;

public class Client {
    public static void main(String[] args) throws Exception{
        IUserService stub = Stub.getStud();
        System.out.println(stub.findUserById(123));
    }
}
