import Box from "@mui/material/Box";
import TextField from "@mui/material/TextField";
import _ from 'lodash';


const TextInput = (props: any) => {

    return (
        <Box sx={{paddingY: ".6rem", width:'100%'}} >
            <TextField
                error={props.error}
                id={_.uniqueId(`${props.label}-`)}
                label={props.label}
                value={props.value}
                onChange={props.onChange}
                helperText={props.helperText}
                variant="outlined"
                name={props.label.toLocaleLowerCase()}
                fullWidth
            />
        </Box>

    )
}

export default TextInput;