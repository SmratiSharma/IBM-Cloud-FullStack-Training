import IProduct from "../model/product.js";

export interface ICartItem {
    product : IProduct;
    quantity : number;
}