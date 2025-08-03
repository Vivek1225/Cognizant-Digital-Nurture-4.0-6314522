import React, { useState } from 'react';
import './App.css';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  const [username, setUsername] = useState('');

  const handleLogin = (e) => {
    e.preventDefault();
    const enteredUsername = e.target.username.value;
    if (enteredUsername.trim()) {
      setUsername(enteredUsername);
      setIsLoggedIn(true);
    }
  };

  const handleLogout = () => {
    setIsLoggedIn(false);
    setUsername('');
  };

  // Sample flight data
  const flights = [
    { id: 1, airline: 'Delta', departure: '10:00 AM', arrival: '2:00 PM', price: '$250' },
    { id: 2, airline: 'United', departure: '12:00 PM', arrival: '4:00 PM', price: '$300' },
    { id: 3, airline: 'American', departure: '3:00 PM', arrival: '7:00 PM', price: '$280' },
  ];

  return (
    <div className="app">
      <header>
        <h1>Flight Ticket Booking</h1>
        {isLoggedIn ? (
          <div className="user-info">
            <span>Welcome, {username}!</span>
            <button onClick={handleLogout}>Logout</button>
          </div>
        ) : null}
      </header>

      <main>
        {isLoggedIn ? (
          <div className="user-page">
            <h2>Available Flights</h2>
            <div className="flights-container">
              {flights.map(flight => (
                <div key={flight.id} className="flight-card">
                  <h3>{flight.airline}</h3>
                  <p>Departure: {flight.departure}</p>
                  <p>Arrival: {flight.arrival}</p>
                  <p>Price: {flight.price}</p>
                  <button className="book-btn">Book Now</button>
                </div>
              ))}
            </div>
          </div>
        ) : (
          <div className="guest-page">
            <h2>Please Login to View Flight Details</h2>
            <div className="login-form">
              <form onSubmit={handleLogin}>
                <input
                  type="text"
                  name="username"
                  placeholder="Enter your username"
                  required
                />
                <button type="submit">Login</button>
              </form>
            </div>
          </div>
        )}
      </main>
    </div>
  );
}

export default App;