package RPC.Rpc07;

import RPC.IProductService;
import RPC.IUserService;

import java.awt.image.ImageProducer;

public class Client {
    public static void main(String[] args) throws Exception{
        IProductService stub = (IProductService) Stub.getStud(IProductService.class);
        System.out.println(stub.findProductById(456));
    }
}
