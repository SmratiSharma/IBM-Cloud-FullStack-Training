import Product from "../schema/productSchema.js";
import IProduct from "../model/product.js";

// export const getAllProducts = async () => {
//     return await Product.find();
// };

// export const createProduct = async (productData: IProduct) => {
//     const product = new Product(productData);
//     return await product.save();
// };


export const getAllProducts = async (): Promise<IProduct[]> => {
    return await Product.find();
}

export const getProductById = async (id: string | null): Promise<IProduct | null> => {
    return await Product.findById(id);

}
