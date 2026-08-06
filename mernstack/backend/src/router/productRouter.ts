import express from "express";
import { getAllProducts } from "../service/productService.js";
import { Request, Response } from "express";
const router = express.Router();
 
router.route("/").get(async(req: Request,res: Response) => {
    try {
        const products = await getAllProducts();
        res.json(products);
    } catch (error) {
       console.error("Error fetching products: ",error);
       res.status(500).json({error:"Internal server error"});
    }
});
export default router;