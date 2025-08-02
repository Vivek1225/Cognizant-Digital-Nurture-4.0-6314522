import React from 'react';
import './App.css';
import img1 from './img1.png';
import img2 from './img2.png';
import img3 from './img3.png';
import img4 from './img4.png';


function App() {
  // Office space data
  const offices = [
    {
      id: 1,
      name: "Downtown Executive Suite",
      rent: 55000,
      address: "123 Main St, City Center",
      image: img4
    },
    {
      id: 2,
      name: "Tech Park Office",
      rent: 75000,
      address: "456 Innovation Blvd, Tech District",
      image: img3
    },
    {
      id: 3,
      name: "Riverside Workspace",
      rent: 45000,
      address: "789 River Lane, Waterside",
      image: img2
    },
    {
      id: 4,
      name: "Metropolitan Business Center",
      rent: 85000,
      address: "321 Metro Ave, Downtown",
      image: img1
    }
  ];

  return (
    <div className="App">
      <h1>Office Space Rental</h1>
      
      <div className="office-list">
        {offices.map((office) => (
          <div key={office.id} className="office-card">
            <img src={office.image} alt={office.name} />
            <h2>{office.name}</h2>
            <p><strong>Address:</strong> {office.address}</p>
            <p>
              <strong>Rent:</strong> 
              <span style={{ color: office.rent < 60000 ? 'red' : 'green' }}>
                ₹{office.rent.toLocaleString()}/month
              </span>
            </p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;