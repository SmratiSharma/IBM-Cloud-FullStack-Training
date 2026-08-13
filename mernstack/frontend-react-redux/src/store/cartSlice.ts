import {createSlice, PayloadAction} from '@reduxjs/toolkit';

interface cartState{
    items : JSON.parse(localStorage.getItem('cart') || '[]')
};

const cartSlice = createSlice({
  name: 'cart',
  initialState,
  reducers: {
    addToCart: (state, action: PayloadAction<{ id: number; name: string; price: number }>) => {
      const existingItem = state.items.find(item => item.id === action.payload.id);
        if (existingItem) {
            existingItem.quantity += 1;
        } else {
            state.items.push({ ...action.payload, quantity: 1 });
        }  
    },
    removeFromCart: (state, action: PayloadAction<number>) => {
      state.items = state.items.filter(item => item.id !== action.payload); 
    },
    clearCart: (state) => {
      state.items = [];
    },
  },
});


export const {addToCart} = cartSlice.actions;
export default cartSlice.reducer;