import express from "express";
import productRouter from "./router/productRouter.js";
// import connectDB from "./config/dbConfig.js";
import connectDB from "./config/dbconfig.js";

const app = express();
const PORT = process.env.PORT || 5000;

await connectDB("mongodb+srv://admin:admin@expresscl.tmilzxw.mongodb.net/productsdb");

app.use(express.json());
app.use("/api/products", productRouter);  //configuring middleware to use productRouter for /api/products route



app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
});