import { useState } from 'react'
import './App.css'
import { Box, Container, InputLabel, MenuItem, Select, TextField, Typography } from '@mui/material';

function App() {
  const [emailContent, setEmailContent] = useState('');
  const [tone, setTone] = useState('');
  const [generatingReply, setGeneratingReply] = useState('');
  const [loading, setLoading] = useState('false');
  const [error, setError] = useState('');

  return (
    <>
      <Container maxWidth="md" sx={{ py: 4 }}>
        <Typography variant='h3' component='h1' gutterBottom>
          Email Reply Generator
        </Typography>

        <Box sx={{ mx: 3 }}>
          <TextField
            fullWidth
            multiline
            rows={6}
            variant='outlined'
            label="Original Email Content"
            value={emailContent || ''}
            onChange={(e) => setEmailContent(e.target.value)}
            sx={{ mb: 2 }} />
        </Box>

        <FormControl>
          <InputLabel>Tone (Optional)</InputLabel>
          <Select
            value = {tone || ''}
            label = {"Tone (Optional"}
            onChange = {(e) => setTone(e.target.value)}>
              <MenuItem value="">None</MenuItem>
              <MenuItem value="professional"
            </Select>
          
        </FormControl>
      </Container>
    </>
  )
}

export default App
