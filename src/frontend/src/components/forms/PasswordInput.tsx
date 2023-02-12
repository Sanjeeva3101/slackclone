import { VisibilityOff, Visibility } from "@mui/icons-material";
import { Box, FormControl, IconButton, InputAdornment, InputLabel, OutlinedInput } from "@mui/material";

import _ from 'lodash';
import { useState } from "react";

const PasswordInput = (props: any) => {

    const [showPassword, setShowPassword] = useState<boolean>(false);
    const handleSHowPassword = () => setShowPassword(pre => !pre);
    const id = _.uniqueId(`${props.label}-`);
    return (
        <Box sx={{ paddingY: ".6rem", width:'100%' }}>
            <FormControl variant="outlined" fullWidth >
                <InputLabel htmlFor={id}>{props.label}</InputLabel>
                <OutlinedInput
                    id={id}
                    type={showPassword ? 'text' : 'password'}
                    endAdornment={
                        <InputAdornment position="end">
                            <IconButton
                                aria-label="toggle password visibility"
                                onClick={handleSHowPassword}
                                onMouseDown={(event:React.MouseEvent<HTMLButtonElement>)=>event.preventDefault()}
                                edge="end"
                            >
                                {showPassword ? <Visibility /> : <VisibilityOff />}
                            </IconButton>
                        </InputAdornment>
                    }
                    label={props.label}
                    value={props.value}
                    onChange={props.onChange}
                />
            </FormControl>
        </Box>
    )
}

export default PasswordInput;