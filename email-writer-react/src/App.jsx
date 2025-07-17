import { useState } from 'react'
import './App.css'

function App() {
  const [emailContent, setEmailContent] = useState('');
  const [tone, setTone] = useState('');
  const [generatingReply, setGeneratingReply] = useState('');
  const [loading, setLoading] = useState('');


  return (
    <>
      <p>Hello</p>
    </>
  )
}

export default App
