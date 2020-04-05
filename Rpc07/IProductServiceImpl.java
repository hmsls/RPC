package RPC.Rpc07;

import RPC.IProductService;
import RPC.Product;

public class IProductServiceImpl implements IProductService {
    @Override
    public Product findProductById(Integer id) {
        return new Product(id,"lishuai");
    }
}
