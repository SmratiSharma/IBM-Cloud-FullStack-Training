import mongoose from "mongoose";
import Iproduct from "../model/product.js";

const productSchema = new mongoose.Schema<Iproduct>({  
    name: { type: String, required: true },
    description: { type: String, required: true },
    price: { type: Number, required: true },
    productCode: { type: String, required: true },
    rating: { type: Number, required: true },
    imageUrl: { type: String, required: true },
    productAvailable: { type: String, required: true }
});

const Product = mongoose.model<Iproduct>("Product", productSchema);
export default Product;