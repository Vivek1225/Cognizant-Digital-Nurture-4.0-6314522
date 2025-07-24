import React from 'react';
import './App.css';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <CalculateScore 
        Name="Chintakrindi Lakshmi Vivek" 
        School="Cognizant Academy" 
        Total={283} 
        goal={300} 
      />
    </div>
  );
}

export default App;