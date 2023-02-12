import Box from "@mui/material/Box";
import Container from "@mui/material/Container";
import Grid from "@mui/material/Grid";

interface PageProps {
   children: React.ReactNode | React.ReactNode[];
}

const Page = ({ children }: PageProps) => {
   return (
      <Container>
         <Box sx={{ flexGrow: 1, height: '100vh' }} >
            <Grid container spacing={2} justifyContent='center' alignItems='center' height='100%'>
                  {children}
            </Grid>
         </Box>

      </Container>
   )
};

export default Page;