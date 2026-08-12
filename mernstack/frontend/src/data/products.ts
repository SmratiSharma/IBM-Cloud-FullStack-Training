export default interface IProduct extends Document{
    id: string;
    name: string;
    description: string;
    price: number;
    productCode: string;
    rating: number;
    imageUrl : string;
    productAvailable: string;
}