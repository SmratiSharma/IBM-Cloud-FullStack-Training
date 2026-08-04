import Product from "../schema/productSchema.js";
import IProduct from "../model/product.js";

export const getAllProducts = async () => {
    return await Product.find();
};

export const createProduct = async (productData: IProduct) => {
    const product = new Product(productData);
    return await product.save();
};