import React from 'react';
import 'index.css'
import '@fontsource/roboto/300.css';
import '@fontsource/roboto/400.css';
import '@fontsource/roboto/500.css';
import '@fontsource/roboto/700.css';

import CssBaseline from '@mui/material/CssBaseline';

import ReactDOM from 'react-dom/client';
import { RouterProvider } from 'react-router-dom';
import { Provider } from 'react-redux'; // --> add this line

import Router from 'routes/Router';
import store from 'store'; // --> add this line

ReactDOM.createRoot(document.getElementById('root') as HTMLElement).render(
   <React.StrictMode>
      <CssBaseline/>
      <Provider store={store}> 
         <RouterProvider router={Router} />
      </Provider>
   </React.StrictMode>,
);