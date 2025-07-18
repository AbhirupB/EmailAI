import { useState } from 'react'
import './App.css'
import { Box, Container, TextField, Typography } from '@mui/material';

function App() {
  const [emailContent, setEmailContent] = useState('');
  const [tone, setTone] = useState('');
  const [generatingReply, setGeneratingReply] = useState('');
  const [loading, setLoading] = useState('false');
  const [error, setError] = useState('');

  return (
    <>
      <Container maxWidth="md" sx={{py:4}}>
        <Typography variant='h3' component='h1' gutterBottom>
          Email Reply Generator
        </Typography>

        <Box sx={{mx:3}}>
          <TextField></TextField>
        </Box>
      </Container>
    </>
  )
}

export default App
