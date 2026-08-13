import {z} from 'zod';

export const paymentSchema = z.object({
    cardNumber: z.string().min(16, { message: "Card number must be at least 16 digits" }),
    cardHolderName: z.string().min(1, { message: "Card holder name is required" }),
    expirationDate: z.string().regex(/^(0[1-9]|1[0-2])\/\d{2}$/, { message: "Expiration date must be in MM/YY format" }),
    cvv: z.string().min(3, { message: "CVV must be at least 3 digits" }).max(4, { message: "CVV must be at most 4 digits" }),
});

export type PaymentFormData = z.infer<typeof paymentSchema>;