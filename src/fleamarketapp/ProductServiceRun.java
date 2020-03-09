package fleamarketapp;

public class ProductServiceRun {

	//多態性

	private ProductService productservice = new ProductServiceImpl();

	public static void main(String[] args) {

		ProductServiceImpl productserviceimpl = new ProductServiceImpl();
		ProductServiceImpl.fetchProductInfo();

	}

}
