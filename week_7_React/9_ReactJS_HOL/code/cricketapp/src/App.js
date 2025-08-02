import React, { useState } from 'react';
import ListofPlayers from './Components/ListOfPlayers';
import IndianPlayers from './Components/IndianPlayers';


function App() {
    const [flag, setFlag] = useState(true);

    return (
        <div className="App">
            <h1>Cricket Players App</h1>
            <button onClick={() => setFlag(!flag)} Style={{ backgroundColor: flag ? "blue" : "green", color: "white" }}>
                Toggle Component ({flag ? "ListofPlayers" : "IndianPlayers"})
            </button>
            
            {flag ? <ListofPlayers /> : <IndianPlayers />}
        </div>
    );
}

export default App;