import express from "express";
import productRouter from "./router/productRouter.js";
import { connectDB } from "./config/dbconfig.js";
import cors from "cors";
 
const app = express();
const PORT = process.env.PORT || 5000;
 
connectDB('mongodb+srv://admin:admin@expresscl.wkb2qxe.mongodb.net/productsdb')
 
app.use(cors());
app.use(express.json());
app.use("/api/products", productRouter);
 
app.listen(PORT, ()=> {
    console.log(`Server is running on port ${PORT}`);
});
 