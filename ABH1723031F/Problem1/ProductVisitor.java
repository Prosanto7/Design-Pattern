package Problem1;

public interface ProductVisitor {
    void accept(ProductCategory productCategory);
}

class DiscountVisitor implements ProductVisitor{

    @Override
    public void accept(ProductCategory productCategory) {

    }
}

class ReturnVisitor implements ProductVisitor{

    @Override
    public void accept(ProductCategory productCategory) {

    }
}

class ShippingVendorVisitor implements ProductVisitor{

    @Override
    public void accept(ProductCategory productCategory) {

    }
}
