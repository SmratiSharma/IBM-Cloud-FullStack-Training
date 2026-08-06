import mongoose from "mongoose";
import process from "process";
 
export const connectDB = async (mongoURI: string): Promise<void> => {
    try{
        await mongoose.connect(mongoURI);
        console.log("MongoDB connected successfully");
    }catch(err){
        console.error("Error connecting to MongoDB:",err);
        process.exit(1); //Exit the process with failure
    }
}