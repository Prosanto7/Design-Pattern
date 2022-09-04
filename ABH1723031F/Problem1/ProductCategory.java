package Problem1;

public abstract class ProductCategory {
    private String name;

    public ProductCategory(String name) {
        this.name = name;
    }

    abstract int visit(DiscountVisitor discountVisitor);
    abstract int visit(ReturnVisitor returnVisitor);
    abstract String visit(ShippingVendorVisitor shippingVendorVisitor);
}

class Plastic 
