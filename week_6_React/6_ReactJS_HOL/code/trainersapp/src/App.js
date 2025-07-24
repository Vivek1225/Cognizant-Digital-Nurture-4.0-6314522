import React from 'react';
import { BrowserRouter, Routes, Route, Link } from 'react-router-dom';
import Home from './Home';
import TrainersList from './TrainersList';
import TrainerDetail from './TrainerDetails';
import './App.css';

const App = () => {
  return (
    <BrowserRouter>
      <div className="App">
        <nav>

          <h1>My Academy Trainers App</h1>
              <Link to="/">Home</Link> | <Link to="/trainers">Trainers List</Link>


        </nav>

        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/trainers" element={<TrainersList />} />
          <Route path="/trainers/:id" element={<TrainerDetail />} />
        </Routes>
      </div>
    </BrowserRouter>
  );
};

export default App;