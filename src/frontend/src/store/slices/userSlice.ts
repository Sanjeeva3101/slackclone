import { createSlice, PayloadAction } from '@reduxjs/toolkit';


export interface User {
   email: string,
   username: string,
   password: string
}

const INITIAL_STATE = {
    email:'',
    username:'anonymous',
    password: ''
} as User;

const userSlice = createSlice({
   name: 'user',
   initialState: INITIAL_STATE,
   reducers: {
      setUser: (state, action: PayloadAction<User>) => ({
         ...state,
         ...action.payload
      }),
   },
});

export const { setUser } = userSlice.actions;

export default userSlice.reducer;