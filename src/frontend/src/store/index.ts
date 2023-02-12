import { configureStore } from '@reduxjs/toolkit';


import appReducer from 'store/slices/appSlice';
import userReducer from 'store/slices/userSlice';

const store = configureStore({
   reducer: {
      app: appReducer,
      user: userReducer
   },
});

export default store;
