import Box from '@mui/material/Box';
import Button from '@mui/material/Button';

import Typography from '@mui/material/Typography';
import PasswordInput from 'components/forms/PasswordInput';
import TextInput from 'components/forms/TextInput';
import { SyntheticEvent, useState } from 'react';

interface Field {
    value: string,
    error: boolean
}
interface UserFields {
    email: Field,
    username: Field,
    password: Field
}

const SignUp = () => {
    const [fields, setField] = useState<UserFields>({
        email: { value: '', error: false },
        username: { value: '', error: false },
        password: { value: '', error: false }
    });

    const onFieldChange = (event: SyntheticEvent): void => {
       const name = (event.target as HTMLInputElement).name;
       console.log(name);
    }




    return (
        <Box sx={{ width: '70%', maxWidth: '650px' }}>
            <Typography variant="h5" component="h2" sx={{ fontWeight: 'bold' }} >
                Sign Up
            </Typography>
            <Typography variant="h6" component="small" sx={{ fontWeight: 100, fontSize: ".9rem" }} >
                Let's get started
            </Typography>
            <TextInput label="Email" value={fields.email.value} error={fields.email.error} onChange={onFieldChange} />
            <TextInput label="Username" />
            <PasswordInput label="Password" />
            <Button variant="contained" fullWidth sx={{ marginY: '.4rem', paddingY: '.6rem' }}>SignUp</Button>
        </Box>
    )
}
export default SignUp;