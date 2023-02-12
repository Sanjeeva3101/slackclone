import { lazy, Suspense } from 'react';
import { createBrowserRouter } from 'react-router-dom';

import PageLoading from '../pages/PageLoading';
import Page from '../pages/Page';

import paths from 'routes/paths';
import SignUp from 'pages/SignUp';

const Home = lazy(() => import('pages/Home'));
const PageNotFound = lazy(() => import('pages/PageNotFound'));

interface Routes {
   path: string;
   element: React.ReactNode;
}

const getRouteElement = (Component: React.ElementType): React.ReactNode => (
   <Suspense fallback={<PageLoading />}>
      <Page>
         <Component />
      </Page>
   </Suspense>
);

const routes: Routes[] = [
   { path: paths.HOME, element: getRouteElement(Home) },
   { path: paths.NOT_FOUND, element: getRouteElement(PageNotFound) },
   {path: paths.SIGNUP, element: getRouteElement(SignUp) }
];

export default createBrowserRouter(routes);